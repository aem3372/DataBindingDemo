package com.aemiot.demo.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.aemiot.demo.databinding.BR;

public class BindingData extends BaseObservable {

    private String value;

    @Bindable
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyPropertyChanged(BR.value);
    }
}
