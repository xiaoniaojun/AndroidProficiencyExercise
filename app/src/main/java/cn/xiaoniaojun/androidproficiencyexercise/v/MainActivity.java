package cn.xiaoniaojun.androidproficiencyexercise.v;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import cn.xiaoniaojun.androidproficiencyexercise.R;
import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;
import cn.xiaoniaojun.androidproficiencyexercise.retrofit.JsonService;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/goeasyway/SimpleListDemo/master/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonService jsonService = retrofit.create(JsonService.class);
        Observable<? extends List<Facts>> observable = jsonService.fetchJsonFeed("facts.json");
        observable.subscribe(list -> {
            for (Facts fact : list
                    ) {

            }
        });
    }
}
