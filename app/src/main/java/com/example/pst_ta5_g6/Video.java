package com.example.pst_ta5_g6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video extends YouTubeBaseActivity {
    YouTubePlayerView YP;
    YouTubePlayer.OnInitializedListener YPlistener;
    Button Play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        YP= (YouTubePlayerView) findViewById(R.id.youtubeplayer);
        Play=(Button) findViewById(R.id.btnPlay);
        YPlistener= new YouTubePlayer.OnInitializedListener() {



            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("NT8I8ci74qo");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YP.initialize(Youtube.getApikey(),YPlistener);
            }
        });
    }
    public void volver(View view){
        finish();
    }
}
