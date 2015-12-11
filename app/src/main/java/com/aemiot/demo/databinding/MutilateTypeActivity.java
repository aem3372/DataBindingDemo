package com.aemiot.demo.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aemiot.demo.databinding.databinding.ActivityMutilateTypeBinding;
import com.aemiot.demo.databinding.model.CustomType;

import java.util.Collections;
import java.util.Date;

public class MutilateTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMutilateTypeBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_mutilate_type);
        binding.setIntValue(0);
        binding.setShortValue((short) 1);
        binding.setLongValue(2L);
        binding.setFloatValue(0.1f);
        binding.setDoubleValue(0.2);
        binding.setIntegerClassValue(3);
        binding.setShortClassValue((short) 4);
        binding.setLongClassValue(5L);
        binding.setFloatClassValue(0.3f);
        binding.setDoubleClassValue(0.4);
        binding.setStringValue("String");
        binding.setDateValue(new Date());
        binding.setListValue(Collections.EMPTY_LIST);
        CustomType custom = new CustomType();
        custom.value = "custom";
        binding.setCustomValue(custom);
    }
}
