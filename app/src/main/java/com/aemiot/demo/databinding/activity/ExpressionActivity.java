package com.aemiot.demo.databinding.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.aemiot.demo.databinding.R;
import com.aemiot.demo.databinding.databinding.ActivityExpressionBinding;

public class ExpressionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityExpressionBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_expression);
    }
}
