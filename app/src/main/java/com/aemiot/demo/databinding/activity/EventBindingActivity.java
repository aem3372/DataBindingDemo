package com.aemiot.demo.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aemiot.demo.databinding.R;
import com.aemiot.demo.databinding.databinding.ActivityEventBinding;
import com.aemiot.demo.databinding.event.ButtonHandler;

public class EventBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEventBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_event);
        binding.setTip("click me");
        binding.setHandle(new ButtonHandler());
    }
}
