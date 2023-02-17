package com.service;

import com.dao.FilmInfoDao;
import com.dao.FilmInfoDaoImpl;
import com.entity.FilmInfo;

import java.util.ArrayList;
import java.util.List;

public class FilmServiceImpl implements FilmService{

    private FilmInfoDao dao = new FilmInfoDaoImpl();

    @Override
    public List<FilmInfo> getAllFilmInfo() {
        List filmList = dao.getAllFilmInfo();
        return filmList;
    }

    @Override
    public boolean delFilmById(int id) {
        return dao.delFilmById(id);
    }
}
