package com.android.simpledatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.simpledatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.tvHello.setText("Hello");
        binding.btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvHello.setText("Hello "+binding.edText.getText().toString());
            }
        });
        binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.edText.setText("");
                binding.tvHello.setText("Hello");
            }
        });
    }
}
