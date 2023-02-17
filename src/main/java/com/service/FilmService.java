package com.service;

import com.entity.FilmInfo;

import java.util.List;

public interface FilmService {

    List<FilmInfo> getAllFilmInfo();

    boolean delFilmById(int id);
}
