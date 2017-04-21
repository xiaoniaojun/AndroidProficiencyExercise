package cn.xiaoniaojun.androidproficiencyexercise.v;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cn.xiaoniaojun.androidproficiencyexercise.R;
import cn.xiaoniaojun.androidproficiencyexercise.m.Facts;

public class FactsAdapter4RecyclerView extends RecyclerView.Adapter<FactsAdapter4RecyclerView.ViewHolder> {

    private ArrayList<Facts.RowsBean> mContentRows;

    public FactsAdapter4RecyclerView(List<Facts.RowsBean> contentRows) {
        mContentRows = (ArrayList<Facts.RowsBean>) contentRows;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Facts.RowsBean row = mContentRows.get(position);
        holder.tvTitle.setText(row.getTitle());
        holder.tvContent.setText(row.getDescription());

        Glide.with(holder.imgv.getContext())
                .load(row.getImageHref())
                .fitCenter()
                .into(holder.imgv);
    }

    @Override
    public int getItemCount() {
        return mContentRows.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        TextView tvContent;
        ImageView imgv;

        ViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_item_title);
            tvContent = (TextView) itemView.findViewById(R.id.tv_item_content);
            imgv = (ImageView) itemView.findViewById(R.id.imgv_item);
        }
    }

}
