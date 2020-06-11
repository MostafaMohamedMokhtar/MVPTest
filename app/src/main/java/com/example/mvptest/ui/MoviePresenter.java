package com.example.mvptest.ui;

import com.example.mvptest.pojo.MovieModel;

public class MoviePresenter {
    MovieView view ;

    public MoviePresenter(MovieView view) {
        this.view = view;
    } // end constructor

    public MovieModel getMovieFromDatabase(){
        return new MovieModel("Maze Runnier" , " Scientific Fiction " ,"2018" , 1) ;
    } // end getMovieFromDatabase()

    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabase().getName());
    } // end getMovieName()
} // end class
