package com.dao;

import com.entity.FilmInfo;

import java.util.List;

public interface FilmInfoDao {

    List<FilmInfo> getAllFilmInfo();

    boolean delFilmById(int id);

}
