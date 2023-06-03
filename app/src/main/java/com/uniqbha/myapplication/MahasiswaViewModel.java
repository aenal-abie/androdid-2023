package com.uniqbha.myapplication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MahasiswaViewModel  extends ViewModel {
    String[] mahasiswa = new String[5];

    public MutableLiveData<String> nama;

    void dataMahasiswa (){
        mahasiswa[0] = "Budi";
        mahasiswa[1] = "Dedi";
        mahasiswa[2] = "Sudi";
        mahasiswa[3] = "Mudi";
        mahasiswa[4] = "Dudi";
    }

    public void clickButton() {
        nama.setValue(mahasiswa[0]);
    }


}
