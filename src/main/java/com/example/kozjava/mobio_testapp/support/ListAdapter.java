package com.example.kozjava.mobio_testapp.support;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kozjava.mobio_testapp.R;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Model> models;

    public ListAdapter(Context context, ArrayList<Model> models){
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.single_list_item,
                    viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.modelIcon.setImageResource(models.get(i).getIcon());
        viewHolder.modelDescription.setText(models.get(i).getDescription());

        return view;
    }



    private class ViewHolder{
        ImageView modelIcon;
        TextView modelDescription;

        public ViewHolder(View view){
            modelIcon = (ImageView)view.findViewById(R.id.modelIcon);
            modelDescription = (TextView)view.findViewById(R.id.modelDescription);

        }
    }
}
