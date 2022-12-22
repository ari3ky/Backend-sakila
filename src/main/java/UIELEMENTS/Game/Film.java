package UIELEMENTS.Game;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
    @Table(name="film")

    public class Film {
        @Id //basically the primary key for this class attribute

        @Column(name="film_id")
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        int filmid;


        @Column(name="title")
        String title;

        @Column(name="description")
        String description;

        @Column(name="release_year")
        Date release_Year;

        @Column (name="language_id")
        int language_ID;


        @Column (name="rental_duration")
        int rental_Duration;

        @Column (name="rental_rate")
        float rental_Rate;

        @Column (name="length")
        int length;

        @Column (name="replacement_cost")
        float replacement_Cost;

        @Column (name="rating")
        String rating;

        @Column (name="special_features")
        String special_Features;

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Date getRelease_Year() {
//        return release_Year;
//    }
//
//    public void setRelease_Year(Date release_Year) {
//        this.release_Year = release_Year;
//    }

    public int getLanguage_ID() {
        return language_ID;
    }

    public void setLanguage_ID(int language_ID) {
        this.language_ID = language_ID;
    }

    public int getRental_Duration() {
        return rental_Duration;
    }

    public void setRental_Duration(int rental_Duration) {
        this.rental_Duration = rental_Duration;
    }

    public float getRental_Rate() {
        return rental_Rate;
    }

    public void setRental_Rate(float rental_Rate) {
        this.rental_Rate = rental_Rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getReplacement_Cost() {
        return replacement_Cost;
    }

    public void setReplacement_Cost(float replacement_Cost) {
        this.replacement_Cost = replacement_Cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_Features() {
        return special_Features;
    }

    public void setSpecial_Features(String special_Features) {
        this.special_Features = special_Features;
    }

//    public Date getLast_Update() {
//        return last_Update;
//    }
//
//    public void setLast_Update(Date last_Update) {
//        this.last_Update = last_Update;
//    }

//    @Column (name="last_update")
//        Date last_Update;


        public Film (){

        }


   }


