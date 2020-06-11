package com.example.mvptest.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvptest.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , MovieView {

    @BindView(R.id.txt_movieName_id)
    TextView movie_name;
    @BindView(R.id.button)
    Button getMovieName;
    MoviePresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getMovieName.setOnClickListener(this);
        presenter = new MoviePresenter(this) ;
    } // end onCreate()

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                presenter.getMovieName();
        }// end switch
    } // end onClick()

    @Override
    public void onGetMovieName(String movieName) {
        movie_name.setText(movieName);
    }
} // end class
