package cn.xiaoniaojun.androidproficiencyexercise.v;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import cn.xiaoniaojun.androidproficiencyexercise.R;
import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;
import cn.xiaoniaojun.androidproficiencyexercise.retrofit.Facts2ListViewHandler;
import cn.xiaoniaojun.androidproficiencyexercise.retrofit.FactsHandler;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private RecyclerView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        mListView = (RecyclerView) findViewById(R.id.recycler_view);

        // 经过封装后的网络请求以及处理Json的类。
        // 将请求(url请求)和处理(处理返回结果)分离；
        new FactsHandler<Facts>(new Facts2ListViewHandler(mListView, this)).exec();

    }
}
