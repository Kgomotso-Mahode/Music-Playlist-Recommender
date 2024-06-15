package com.example.musicplaylist;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton popRadioButton, neoSoulRadioButton, hipHopRadioButton, rnbRadioButton;
    Button recommendButton;
    TextView playlistTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popRadioButton = findViewById(R.id.popRadioButton);
        neoSoulRadioButton = findViewById(R.id.neoSoulRadioButton);
        hipHopRadioButton = findViewById(R.id.hipHopRadioButton);
        rnbRadioButton = findViewById(R.id.rnbRadioButton);
        recommendButton = findViewById(R.id.recommendButton);
        playlistTextView = findViewById(R.id.playlistTextView);

        recommendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playlist = getRecommendedPlaylist();
                playlistTextView.setText(playlist);
            }
        } );

    }
    private String getRecommendedPlaylist(){
        if (popRadioButton.isChecked()) {
            return "Recommended Pop Playlist: Taylor Swift, Ed Sheeran, Ariana Grande, Justin Bieber, The Weeknd, Dua Lipa";
        }else if (neoSoulRadioButton.isChecked()) {
            return "Recommended NeoSoul Playlist: Erykah Bady, Lauryn Hill, Jill Scott, Bilal, D'Angelo, Maxwell";
        }else if (rnbRadioButton.isChecked()) {
            return "Recommended RNB Playlist: Beyonce, SZA, Alicia Keys; Miguel, Chris Brown, Daniel Caesar";
        } else if ((hipHopRadioButton.isChecked())) {
            return "Recommended Hip Hop Playlist: Kendrick Lamar, J Cole, Tyler The Creator, Nicki Minaj, A Tribute Called Quest, Fugees";
        } else {
            return "Please select a genre to get a playlist recommendation";
        }
    }
}
