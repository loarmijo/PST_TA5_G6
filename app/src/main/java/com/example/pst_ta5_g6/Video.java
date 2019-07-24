package com.example.pst_ta5_g6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video extends YouTubeBaseActivity {
    //Se crean los objetos relacionados al View
    YouTubePlayerView YP;
    YouTubePlayer.OnInitializedListener YPlistener;
    Button Play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        //Se relacionan con el archivo xml
        YP= (YouTubePlayerView) findViewById(R.id.youtubeplayer);
        Play=(Button) findViewById(R.id.btnPlay);
        // Se crea el listener para el reproductor de youtube
        YPlistener= new YouTubePlayer.OnInitializedListener() {
        //En caso de ser valido se recarga el video escogido previamente
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("DiItGE3eAyQ");
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        //Se realiza el evento cuando se da click en el boton
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            //Se reproduce el video
            public void onClick(View view) {
                YP.initialize(Youtube.getApikey(),YPlistener);
            }
        });
    }
    //Se crea la funcion volver para regresar al menu principal
    public void volver(View view){
        finish();
    }
}
