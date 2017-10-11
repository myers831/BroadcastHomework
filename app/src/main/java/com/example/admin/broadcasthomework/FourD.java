package com.example.admin.broadcasthomework;

import java.io.Serializable;

/**
 * Created by Admin on 10/10/2017.
 */

public class FourD implements Serializable {
    int xaxis, yaxis, zaxis, time;

    public FourD(int xaxis, int yaxis, int zaxis, int time) {
        this.xaxis = xaxis;
        this.yaxis = yaxis;
        this.zaxis = zaxis;
        this.time = time;
    }

    public int getXaxis() {
        return xaxis;
    }

    public void setXaxis(int xaxis) {
        this.xaxis = xaxis;
    }

    public int getYaxis() {
        return yaxis;
    }

    public void setYaxis(int yaxis) {
        this.yaxis = yaxis;
    }

    public int getZaxis() {
        return zaxis;
    }

    public void setZaxis(int zaxis) {
        this.zaxis = zaxis;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
