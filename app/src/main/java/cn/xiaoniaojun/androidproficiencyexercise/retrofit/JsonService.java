package cn.xiaoniaojun.androidproficiencyexercise.retrofit;

import java.util.List;

import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonService {
    @GET("{jsonFile}")
    Observable<? extends List<Facts>> fetchJsonFeed(@Path("user") String jsonFile);
}
