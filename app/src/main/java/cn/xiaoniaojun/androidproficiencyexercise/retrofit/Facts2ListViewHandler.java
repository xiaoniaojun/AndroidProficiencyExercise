package cn.xiaoniaojun.androidproficiencyexercise.retrofit;


import android.app.Activity;
import android.widget.ListView;

import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;
import cn.xiaoniaojun.androidproficiencyexercise.v.FactsAdapter;

public class Facts2ListViewHandler implements ICustomerFactsHandler<Facts> {

    private ListView mListView;
    private Activity mActivity;

    public Facts2ListViewHandler(ListView listView, Activity activity) {
        mListView = listView;
        mActivity = activity;
    }

    @Override
    public void handle(Facts jsonObject) {
        mListView.setAdapter(new FactsAdapter(jsonObject, mActivity));
        mActivity = null;
    }
}
