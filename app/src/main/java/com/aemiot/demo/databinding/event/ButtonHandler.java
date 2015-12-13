package com.aemiot.demo.databinding.event;

import android.view.View;
import android.widget.Toast;

import com.aemiot.demo.databinding.R;

public class ButtonHandler {

    public void tip(View v) {
        Toast.makeText(v.getContext(), R.string.click_tip, Toast.LENGTH_SHORT).show();
    }
}
