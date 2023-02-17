package com.dao;

import com.entity.MaintainRecord;

import java.util.List;

public interface FilmInfoDao {

    List<MaintainRecord> getAllFilmInfo();

    boolean delFilmById(int id);

}
