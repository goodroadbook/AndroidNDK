package com.example.androidndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.reuse.R;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView jnitxt = (TextView) this.findViewById(R.id.jnitxt);
        jnitxt.setText(stringFromJNI());
    }

    public native String  stringFromJNI();

    static {
        System.loadLibrary("hello-jni");
    }
}
