package cn.xiaoniaojun.androidproficiencyexercise.v;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.xiaoniaojun.androidproficiencyexercise.R;
import cn.xiaoniaojun.androidproficiencyexercise.retrofit.JsonService;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/goeasyway/SimpleListDemo/master/")
                .addCallAdapterFactory(Rx)
                .build();

        JsonService jsonService = retrofit.create(JsonService.class);
    }
}
