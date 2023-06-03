package com.uniqbha.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uniqbha.myapplication.databinding.ActivityListMahasiswaBinding;

public class ListMahasiswaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;

    ActivityListMahasiswaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListMahasiswaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        recyclerView = binding.recyclerview;

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MahasiswaViewModel model = new ViewModelProvider(this).get(MahasiswaViewModel.class);
        model.dataMahasiswa();
        customAdapter = new CustomAdapter(model.mahasiswa);
        recyclerView.setAdapter(customAdapter);
    }
}