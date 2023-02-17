package com.entity;

public class MaintainRecord {
    public MaintainRecord(int mid, String mname, String room, boolean status, String context) {
        this.mid = mid;
        this.mname = mname;
        this.room = room;
        this.status = status;
        this.context = context;
    }

    private int mid;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String mname;
    private String room;
    private boolean status;
    private String context;

    public MaintainRecord() {
    }
}
