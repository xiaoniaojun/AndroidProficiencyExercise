package cn.xiaoniaojun.androidproficiencyexercise.v;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.xiaoniaojun.androidproficiencyexercise.R;
import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;
import cn.xiaoniaojun.androidproficiencyexercise.retrofit.FactsHandler;
import cn.xiaoniaojun.androidproficiencyexercise.retrofit.TestFactsHandler;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new FactsHandler<Facts>(new TestFactsHandler()).exec();
    }
}
