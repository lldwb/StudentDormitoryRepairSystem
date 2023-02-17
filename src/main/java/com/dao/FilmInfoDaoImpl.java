package com.dao;

import com.entity.FilmInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//写数据库的读取代码
public class FilmInfoDaoImpl implements FilmInfoDao{

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/filmdb?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123456";

    @Override
    public List<FilmInfo> getAllFilmInfo() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("找到数据库驱动:com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);;
            PreparedStatement pst = conn.prepareStatement("select * from filminfo");
            ResultSet rs = pst.executeQuery();
            List filmList = new ArrayList<FilmInfo>();
            while(rs.next()){
                FilmInfo film = new FilmInfo();

                film.setActors( rs.getString("actors") );
                film.setAreas( rs.getString("areas") );
                film.setFilmname( rs.getString("filmname") );
                film.setFilmid( rs.getInt("filmid") );
                film.setPrice( rs.getFloat("price") );
                film.setMemo(rs.getString("memo"));

                filmList.add(film);
            }
            return filmList;

        }catch (Exception e){
            System.out.println("发生异常:"+e.getMessage());
            return null;
        }
    }

    @Override
    public boolean delFilmById(int id) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("找到数据库驱动:com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);;
            PreparedStatement pst = conn.prepareStatement("delete from filminfo where filmid=?");
            pst.setInt(1,id);
            pst.executeUpdate();
            return true;

        }catch (Exception e){
            System.out.println("发生异常:"+e.getMessage());
            return false;
        }
    }
}
