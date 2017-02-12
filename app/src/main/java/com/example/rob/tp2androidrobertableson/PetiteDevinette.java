package com.example.rob.tp2androidrobertableson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class PetiteDevinette extends AppCompatActivity {

    NumberPicker m_NpNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petite_devinette);

        //init number picker
        String[] nums;
        m_NpNumero = (NumberPicker) findViewById(R.id.npNumero);
        nums = new String[120];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.toString(i + 1);
        }

        m_NpNumero.setMaxValue(100);
        m_NpNumero.setMinValue(0);
        m_NpNumero.setWrapSelectorWheel(false);
        m_NpNumero.setDisplayedValues(nums);
    }
}
