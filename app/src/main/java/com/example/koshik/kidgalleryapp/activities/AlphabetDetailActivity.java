package com.example.koshik.kidgalleryapp.activities;

import android.os.StrictMode;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.example.koshik.kidgalleryapp.R;
import com.squareup.picasso.Picasso;

public class AlphabetDetailActivity extends AppCompatActivity {
    public static final String EXTRA_IMAGE = "extra_image";
    private ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet_activity_detail);
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        myImage = (ImageView) findViewById(R.id.largeImage);


        if (getIntent() != null && getIntent().getExtras() != null) {
            if (getIntent().getExtras().containsKey(EXTRA_IMAGE)) {
                Picasso.with(this).load(getIntent().getExtras().getString(EXTRA_IMAGE)).into(myImage);
            }
        }
    }
}
