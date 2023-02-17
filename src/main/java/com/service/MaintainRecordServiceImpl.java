package com.service;

import com.dao.MaintainRecordDao;
import com.dao.MaintainRecordDaoImpl;
import com.entity.MaintainRecord;

import java.util.List;

public class MaintainRecordServiceImpl implements MaintainRecordService {

    private MaintainRecordDao dao = new MaintainRecordDaoImpl();

    @Override
    public List<MaintainRecord> getAllMaintainRecordInfo() {
        List filmList = dao.getAllMaintainRecordInfo();
        return filmList;
    }

    @Override
    public boolean delMaintainRecordById(int id) {
        return dao.delMaintainRecordById(id);
    }

    @Override
    public boolean updMaintainRecordById(int id) {
        return dao.updMaintainRecordById(id);
    }
}
