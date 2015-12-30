package com.aemiot.demo.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.aemiot.demo.databinding.R;
import com.aemiot.demo.databinding.adapter.RecyclerAdapter;
import com.aemiot.demo.databinding.databinding.ActivityRecyclerBinding;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_recycler);
        binding.setLayoutManager(new LinearLayoutManager(this));
        binding.setAdapter(new RecyclerAdapter());
    }
}
