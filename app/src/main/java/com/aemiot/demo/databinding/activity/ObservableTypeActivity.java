package com.aemiot.demo.databinding.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.aemiot.demo.databinding.R;
import com.aemiot.demo.databinding.databinding.ActivityObservableTypeBinding;

public class ObservableTypeActivity extends AppCompatActivity {

    private static final Drawable[] drawables = {
            new ColorDrawable(Color.BLUE),
            new ColorDrawable(Color.RED),
            new ColorDrawable(Color.YELLOW)
    };

    private ObservableBoolean booleanValue;
    private ObservableInt intValue;
    private ObservableField<String> stringValue;
    private ObservableArrayList<String> listValue;
    private ObservableArrayMap<String, String> mapValue;
    private ObservableField<Drawable> drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityObservableTypeBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_observable_type);
        booleanValue = new ObservableBoolean(false);
        intValue = new ObservableInt(0);
        stringValue = new ObservableField<>("");
        listValue = new ObservableArrayList<>();
        mapValue = new ObservableArrayMap<>();
        drawable = new ObservableField<>(drawables[0]);

        binding.setObservableBooleanValue(booleanValue);
        binding.setObservableIntValue(intValue);
        binding.setObservableStringValue(stringValue);
        binding.setObservableListValue(listValue);
        binding.setObservableMapValue(mapValue);
        binding.setObservableDrawable(drawable);
        CountDownTimer timer = new CountDownTimer(60*1000L, 1000L) {

            @Override
            public void onTick(long millisUntilFinished) {
                booleanValue.set(!booleanValue.get());
                intValue.set(intValue.get() + 1);
                stringValue.set(stringValue.get() + "s");
                listValue.add("l");
                mapValue.put(String.valueOf(millisUntilFinished), "v");
                drawable.set(drawables[intValue.get() % drawables.length]);
            }

            @Override
            public void onFinish() {
                Toast.makeText(ObservableTypeActivity.this,
                        R.string.timer_finish_tip, Toast.LENGTH_SHORT).show();
            }
        };
        timer.start();
    }
}
