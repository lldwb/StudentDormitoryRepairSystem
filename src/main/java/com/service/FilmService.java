package com.service;

import com.entity.MaintainRecord;

import java.util.List;

public interface FilmService {

    List<MaintainRecord> getAllFilmInfo();

    boolean delFilmById(int id);
}
