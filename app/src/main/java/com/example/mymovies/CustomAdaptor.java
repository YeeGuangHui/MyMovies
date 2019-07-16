package com.example.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class CustomAdaptor extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movies> moviesArrayList;

    public CustomAdaptor(Context context, int resource, ArrayList<Movies> objects) {
        super(context, resource, (List) objects);
        parent_context = context;
        layout_id = resource;
        moviesArrayList = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(layout_id, parent, false);

        TextView textViewName=rowView.findViewById(R.id.lvVersion);
        TextView textViewVer=rowView.findViewById(R.id.lvName);
        Movies currentVersion=Movies.get(position);
        return rowView;
    }
}
