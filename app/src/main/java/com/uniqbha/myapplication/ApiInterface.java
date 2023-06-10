package com.uniqbha.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("mahasiswa")
    Call<List<MahasiswaModel>> getMahasiswa();

    @GET("mahasiswa/udin")
    Call<MahasiswaModel> getOneMahasiswa();


}
