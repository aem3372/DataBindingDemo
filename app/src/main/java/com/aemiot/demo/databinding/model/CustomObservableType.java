package com.aemiot.demo.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class CustomObservableType extends BaseObservable {

    @Bindable
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(this.value != value) {
            this.value = value;
            notifyChange();
        }
    }
}
