package com.dao;

import com.entity.MaintainRecord;

import java.util.List;

public interface MaintainRecordDao {

    List<MaintainRecord> getAllMaintainRecordInfo();

    boolean delMaintainRecordById(int id);

}
