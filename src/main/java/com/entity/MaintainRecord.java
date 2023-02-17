package com.entity;

public class MaintainRecord {
    public MaintainRecord(int mid, String mname, String room, boolean context, String status) {
        this.mid = mid;
        this.mname = mname;
        this.room = room;
        this.context = context;
        this.status = status;
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

    public boolean isContext() {
        return context;
    }

    public void setContext(boolean context) {
        this.context = context;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String mname;
    private String room;
    private boolean context;
    private String status;

    public MaintainRecord() {
    }
}
