package com.example.mymovies;

class Movies {



    public Movies(String title, String year, String rated, String genre, String watched, String intheatre, String description) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched = watched;
        this.intheatre = intheatre;
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatched() {
        return watched;
    }

    public void setWatched(String watched) {
        this.watched = watched;
    }

    public String getIntheatre() {
        return intheatre;
    }

    public void setIntheatre(String intheatre) {
        this.intheatre = intheatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", watched='" + watched + '\'' +
                ", intheatre='" + intheatre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    String title;
    String year;
    String rated;
    String genre;
    String watched;
    String intheatre;
    String description;
}
