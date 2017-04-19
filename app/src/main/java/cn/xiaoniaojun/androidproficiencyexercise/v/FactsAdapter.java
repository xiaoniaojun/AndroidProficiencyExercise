package cn.xiaoniaojun.androidproficiencyexercise.v;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cn.xiaoniaojun.androidproficiencyexercise.R;
import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;
import cn.xiaoniaojun.androidproficiencyexercise.m.Facts.RowsBean;

public class FactsAdapter extends BaseAdapter {
    private Activity mContext;
    private ArrayList<RowsBean> mContentRows;

    public FactsAdapter(Facts dataSource, Activity context) {
        mContext = context;
        mContentRows = (ArrayList<RowsBean>) dataSource.getRows();
    }

    @Override
    public int getCount() {
        return mContentRows.size();
    }

    @Override
    public RowsBean getItem(int position) {
        return mContentRows.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        if (convertView == null) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            item = inflater.inflate(R.layout.list_view_item, null);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.tvTitle = (TextView) item.findViewById(R.id.tv_item_title);
            viewHolder.tvContent = (TextView) item.findViewById(R.id.tv_item_content);
            viewHolder.imgv = (ImageView) item.findViewById(R.id.imgv_item);
            item.setTag(viewHolder);
        }
        ViewHolder holder = (ViewHolder) item.getTag();
        RowsBean data = mContentRows.get(position);
        // 设置item内容
        holder.tvTitle.setText(data.getTitle());
        holder.tvContent.setText(data.getDescription());


        return item;
    }

    private static class ViewHolder {
        TextView tvTitle;
        TextView tvContent;
        ImageView imgv;
    }
}
