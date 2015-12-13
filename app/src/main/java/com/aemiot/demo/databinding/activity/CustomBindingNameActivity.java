package com.aemiot.demo.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aemiot.demo.databinding.R;
import com.aemiot.demo.databinding.databinding.CustomClassNameBinding;

public class CustomBindingNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomClassNameBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_custom_binding_name);
        binding.setTip("Custom Class Name.");
    }
}
