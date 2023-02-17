package com.dao;

import com.entity.MaintainRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//写数据库的读取代码
public class MaintainRecordDaoImpl implements MaintainRecordDao {

    private static final String URL = "jdbc:mysql://mysql.lldwb.top:33366/MaintainDB?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "@dwb123456";

    @Override
    public List<MaintainRecord> getAllMaintainRecordInfo() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("找到数据库驱动:com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);;
            PreparedStatement pst = conn.prepareStatement("select * from MaintainRecord");
            ResultSet rs = pst.executeQuery();
            List maintainRecordArrayList = new ArrayList<MaintainRecord>();
            while(rs.next()){
                MaintainRecord maintainRecord = new MaintainRecord(rs.getInt("mid"),rs.getString("mname"),rs.getString("room"),rs.getBoolean("context"),rs.getString("status"));
                maintainRecordArrayList.add(maintainRecord);
            }
            return maintainRecordArrayList;

        }catch (Exception e){
            System.out.println("发生异常:"+e.getMessage());
            return null;
        }
    }

    @Override
    public boolean delMaintainRecordById(int id) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("找到数据库驱动:com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);;
            PreparedStatement pst = conn.prepareStatement("delete from MaintainRecord where filmid=?");
            pst.setInt(1,id);
            pst.executeUpdate();
            return true;

        }catch (Exception e){
            System.out.println("发生异常:"+e.getMessage());
            return false;
        }
    }
}
