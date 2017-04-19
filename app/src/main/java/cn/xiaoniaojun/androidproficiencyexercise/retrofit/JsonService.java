package cn.xiaoniaojun.androidproficiencyexercise.retrofit;

import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

// Retrofit Api
public interface JsonService {
    @GET("{jsonFile}")
    Observable<Facts> fetchJsonFeed(@Path("jsonFile") String jsonFile);
}
