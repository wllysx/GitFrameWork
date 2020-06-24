package com.wll.myproject.gitframework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wll.myproject.gitframework.mvp.model.Student;


import java.util.List;

/**
 * You can do well if you want to
 * Create by WLL on 2020/6/19 DATA: 10:43
 */

public class MyAdapter extends BaseAdapter {

    List<Student> infoBeans;

    public MyAdapter(List<Student> infoBeans) {
        this.infoBeans = infoBeans;
    }



    @Override
    public int getCount() {
        return infoBeans!=null?infoBeans.size():0;
    }

    @Override
    public Student getItem(int position) {
        return infoBeans.get( position );
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    ViewHolder holder;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        if (convertView == null) {
            convertView = LayoutInflater.from( context ).inflate( R.layout.item_list,null);
            holder = new ViewHolder( convertView );
            convertView.setTag( holder );
        }else{
            //当页面往下滑动时，获得原来的view，不需要new新的。
            holder= (ViewHolder) convertView.getTag();
        }


        holder.mT1.setText( infoBeans.get( position ).getName() );
        holder.mT2.setText( infoBeans.get( position ).getPassword() );

        return convertView;
    }
    class ViewHolder{
        TextView mT1;
        TextView mT2;
        TextView mT3;

        public ViewHolder(View itemView) {
            mT1 = itemView.findViewById( R.id.m_t1 );
            mT2 = itemView.findViewById( R.id.m_t2 );
            mT3 = itemView.findViewById( R.id.m_t3 );
        }
    }

}
