package com.example.animalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    MediaPlayer     player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton chat = (ImageButton) findViewById(R.id.chat);
        ImageButton chien = (ImageButton) findViewById(R.id.chien);
        ImageButton kangro = (ImageButton) findViewById(R.id.img1);
        ImageButton donkey = (ImageButton) findViewById(R.id.img2);
        ImageButton yak = (ImageButton) findViewById(R.id.img3);
        ImageButton eagle = (ImageButton) findViewById(R.id.img4);
        ImageButton goat = (ImageButton) findViewById(R.id.img5);
        ImageButton camel = (ImageButton) findViewById(R.id.img6);
        ImageButton lion = (ImageButton) findViewById(R.id.img7);
        ImageButton zebra = (ImageButton) findViewById(R.id.img8);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("chat");
            }
        });
        chien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("chien");
            }
        });
        kangro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("kangro");
            }
        });
        donkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("donkey");
            }
        });
        yak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("yak");
            }
        });
        eagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("eagle");
            }
        });
        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("goat");
            }
        });
        camel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("camel");
            }
        });
        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("lion");
            }
        });
        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio("zebra");
            }
        });


    }
    public void playAudio(String _soundNames)
    {
        if (player!= null)
        {
            stopPlayer();
            player = null;
        }

        if(_soundNames == "kangro")
        {
            player = MediaPlayer.create(this,R.raw.kangro);
        }
        else if(_soundNames == "chat")
        {
            player = MediaPlayer.create(this,R.raw.chat);
        }
        else if(_soundNames == "chien")
        {
            player = MediaPlayer.create(this,R.raw.chien);
        }
        else if(_soundNames == "donkey")
        {
            player = MediaPlayer.create(this,R.raw.donkey);
        }
        else if(_soundNames == "yak")
        {
            player = MediaPlayer.create(this,R.raw.yak);
        }
        else if(_soundNames == "eagle")
        {
            player = MediaPlayer.create(this,R.raw.eagle);
        }
        else if(_soundNames == "goat")
        {
            player = MediaPlayer.create(this,R.raw.goat);
        }
        else if(_soundNames == "camel")
        {
            player = MediaPlayer.create(this,R.raw.camel);
        }
        else if(_soundNames == "lion")
        {
            player = MediaPlayer.create(this,R.raw.lion);
        }
        else if(_soundNames == "zebra")
        {
            player = MediaPlayer.create(this,R.raw.zebra);
        }

        else
        {
            player = null;
        }
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                player.start();
            }
        });
        player.start();
    }
    public void stopPlayer()
    {
        if (player!= null)
        {
            player.release();
            player = null;
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }
}
