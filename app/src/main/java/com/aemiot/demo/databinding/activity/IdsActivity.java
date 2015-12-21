package com.aemiot.demo.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aemiot.demo.databinding.R;
import com.aemiot.demo.databinding.databinding.ActivityIdsBinding;
import com.aemiot.demo.databinding.databinding.ActivitySimpleBinding;

public class IdsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIdsBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_ids);
        binding.tip.setText("Hello! DataBinding Id.");
    }
}
