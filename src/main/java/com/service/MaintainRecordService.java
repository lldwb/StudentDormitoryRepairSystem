package com.service;

import com.entity.MaintainRecord;

import java.util.List;

public interface MaintainRecordService {

    List<MaintainRecord> getAllMaintainRecordInfo();

    boolean delMaintainRecordById(int id);
}
