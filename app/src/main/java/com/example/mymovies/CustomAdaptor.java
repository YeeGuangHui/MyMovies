package com.example.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdaptor extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Movies> moviesList;

    public CustomAdaptor(Context context, int resource, ArrayList<Movies> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        moviesList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView ivRatings = rowView.findViewById(R.id.ivRating);
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvDescription = rowView.findViewById(R.id.tvDescription);
        Movies currentMovie = moviesList.get(position);
        String makeDescription = currentMovie.getYear() + "-" +currentMovie.getGenre();
        tvTitle.setText(currentMovie.getTitle());
        tvDescription.setText(makeDescription);
        String getRated = currentMovie.getRated();
        if (getRated.equalsIgnoreCase("G")) {
            ivRatings.setImageResource(R.drawable.rating_g);
        } else if (getRated.equalsIgnoreCase("PG")) {
            ivRatings.setImageResource(R.drawable.rating_pg);
        } else if (getRated.equalsIgnoreCase("PG13")) {
            ivRatings.setImageResource(R.drawable.rating_pg13);
        } else if (getRated.equalsIgnoreCase("NC16")) {
            ivRatings.setImageResource(R.drawable.rating_nc16);
        } else if (getRated.equalsIgnoreCase("M18")) {
            ivRatings.setImageResource(R.drawable.rating_m18);
        } else {
            // R21 //
            ivRatings.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
