package cn.xiaoniaojun.androidproficiencyexercise.retrofit;


import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import cn.xiaoniaojun.androidproficiencyexercise.R;
import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;
import cn.xiaoniaojun.androidproficiencyexercise.v.FactsAdapter4RecyclerView;

public class Facts2ListViewHandler implements ICustomerFactsHandler<Facts> {

    private RecyclerView mRecyclerViewView;
    private Activity mActivity;

    public Facts2ListViewHandler(RecyclerView recyclerView, Activity activity) {
        mRecyclerViewView = recyclerView;
        mActivity = activity;
    }

    @Override
    public void handle(Facts jsonObject) {
        ((Toolbar) mActivity.findViewById(R.id.toolBar)).setTitle(jsonObject.getTitle());
        mRecyclerViewView.setLayoutManager(new LinearLayoutManager(mActivity));
        mRecyclerViewView.setAdapter(new FactsAdapter4RecyclerView(jsonObject.getRows()));
        mActivity = null;
    }
}
