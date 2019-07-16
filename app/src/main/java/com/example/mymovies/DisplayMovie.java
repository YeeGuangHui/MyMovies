package com.example.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMovie extends AppCompatActivity {

    ImageView ivRatings;
    TextView tvTitle, tvDescription, tvMovieDescription, tvWatchedOn;
    Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_movie);

        ivRatings = findViewById(R.id.ivRating);
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);
        tvMovieDescription = findViewById(R.id.tvMovieDescription);
        tvWatchedOn = findViewById(R.id.tvWatchedOn);
        btnDelete = findViewById(R.id.btnDelete);

        Intent intent = getIntent();
        final String title = intent.getStringExtra("title");
        String year = intent.getStringExtra("year");
        String rated = intent.getStringExtra("rated");
        String genre = intent.getStringExtra("genre");
        String watched_on = intent.getStringExtra("watched_on");
        String in_theatre = intent.getStringExtra("in_theatre");
        String description = intent.getStringExtra("description");

        if (rated.equalsIgnoreCase("g")) {
            ivRatings.setImageResource(R.drawable.rating_g);
        } else if (rated.equalsIgnoreCase("pg")) {
            ivRatings.setImageResource(R.drawable.rating_pg);
        } else if (rated.equalsIgnoreCase("pg13")) {
            ivRatings.setImageResource(R.drawable.rating_pg13);
        } else if (rated.equalsIgnoreCase("nc16")) {
            ivRatings.setImageResource(R.drawable.rating_nc16);
        } else if (rated.equalsIgnoreCase("m18")) {
            ivRatings.setImageResource(R.drawable.rating_m18);
        } else {
            ivRatings.setImageResource(R.drawable.rating_r21);
        }

        tvTitle.setText(title);
        tvDescription.setText(year + "-" + genre);
        tvMovieDescription.setText(description);
        tvWatchedOn.setText("Watch on: "+watched_on+"\n In Theatre: "+in_theatre);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DisplayMovie.this, MainActivity.class);
                intent.putExtra("source", "DisplayMovie");
                intent.putExtra("title", title);
                startActivity(intent);
                finish();
            }
        });

    }
}
