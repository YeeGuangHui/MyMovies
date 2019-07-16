package com.example.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Movies> alMovies;
    ListView lvMovies;
    CustomAdaptor ccMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alMovies = new ArrayList<>();

        Movies film1=new Movies("How to Train Your Dragon: The Hidden World", "2019", "PG", "Comedy Adventure", "GV", "January", "");
        alMovies.add(film1);
        Movies film2=new Movies("Green Book", "2018", "NC16", "Biopic", "GV", "February", "");
        alMovies.add(film2);
        Movies film3=new Movies("Alita: Battle Angel", "2019", "PG13", "Sci-Fi Action", "GV", "February", "");
        alMovies.add(film3);
        Movies film4=new Movies("Captain Marvel", "2019", "PG", "Superhero Action", "GV", "March", "");
        alMovies.add(film4);
        Movies film5=new Movies("Dumbo", "2019", "PG", "Family Adventure", "GV", "April", "");
        alMovies.add(film5);
        Movies film6=new Movies("Shazam!", "2019", "PG", "Superhero Action Comedy", "GV", "April", "");
        alMovies.add(film6);
        Movies film7=new Movies("Avengers: Endgame", "2019", "PG13", "Superhero Action", "GV", "April", "End of Heisei");
        alMovies.add(film7);
        Movies film8=new Movies("Pokemon Detective Pikachu", "2019", "PG", "Comedy Adventure", "GV", "May", "");
        alMovies.add(film8);
        Movies film9=new Movies("Aladdin", "2019", "PG", "Action Adventure", "GV", "May", "");
        alMovies.add(film9);
        Movies film10=new Movies("Godzilla: King of the Monsters", "2019", "PG13", "Sci-fi Action", "GV", "May", "");
        alMovies.add(film10);
        Movies film11=new Movies("The Secret Life of Pets 2", "2019", "PG", "Comedy Adventure", "GV", "June", "");
        alMovies.add(film11);
        Movies film12=new Movies("Toy Story 4", "2019", "PG", "Comedy Adventure", "GV", "June", "");
        alMovies.add(film12);
        Movies film13=new Movies("Bumblebee", "2018", "PG", "Sci-fi Action", "GV", "December 2018", "");
        alMovies.add(film13);
        Movies film14=new Movies("Spider-man: Into the Spider-Verse", "2018", "PG", "Comedy Adventure", "GVn", "December 2018", "");
        alMovies.add(film14);
        Movies film15=new Movies("Aquaman", "2018", "PG13", "Action Adventure", "GV", "December 2018", "");
        alMovies.add(film15);
        Movies film16=new Movies("Bohemian Rhapsody", "2018", "NC16", "Biopic", "GV", "December 2018", "");
        alMovies.add(film16);
        Movies film17=new Movies("A Star is Born", "2018", "M18", "Biopic", "GV", "December 2018", "");
        alMovies.add(film17);
        Movies film18=new Movies("Ralph Breaks the Internet", "2018", "PG", "Action Adventure", "GV", "November 2018", "");
        alMovies.add(film18);
        Movies film19=new Movies("Fantastic Beasts: The Crime of Grindlewald", "2018", "PG13", "Action Adventure", "GV", "November 2018", "");
        alMovies.add(film19);
        Movies film20=new Movies("Spider-man: Far From Home", "2019", "PG", "Action Adventure", "TBA", "TBA", "");
        alMovies.add(film20);

        lvMovies=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ccMovies);

        alMovies.setAdapter(lvMovies);
        adapter=new CustomAdaptor(this, R.layout.activity_main, ccMovie);
    }
}
