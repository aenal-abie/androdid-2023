package com.uniqbha.myapplication;

import com.google.gson.annotations.SerializedName;

public class MahasiswaModel {
    @SerializedName("nama")
    private String name;

    @SerializedName("alamat")
    private String address;

    public MahasiswaModel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
