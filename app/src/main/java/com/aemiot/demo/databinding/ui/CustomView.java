package com.aemiot.demo.databinding.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomView extends TextView {

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setCustomAttribute(String value) {
        setText(value);
    }
}
