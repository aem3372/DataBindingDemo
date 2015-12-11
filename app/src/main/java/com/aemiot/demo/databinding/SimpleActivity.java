package com.aemiot.demo.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aemiot.demo.databinding.databinding.ActivitySimpleBinding;

public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySimpleBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_simple);
        binding.setTip("Hello! DataBinding.");
    }
}
