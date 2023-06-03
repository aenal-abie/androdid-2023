package com.uniqbha.myapplication;

public class DataItem {
    private int icon;
    private String androidName;
    private String version;

    public DataItem(int icon, String androidName, String version) {
        this.icon = icon;
        this.androidName = androidName;
        this.version = version;
    }

    public int getIcon() {
        return icon;
    }

    public String getAndroidName() {
        return androidName;
    }

    public String getVersion() {
        return version;
    }
}

