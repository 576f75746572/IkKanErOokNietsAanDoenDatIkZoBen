package nl.donkeyscripts.wouter.ikkanerooknietsaandoendatikzoben;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TabA extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Tab control
        Button taba = (Button) findViewById(R.id.tabaA);
        taba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(v.getContext(), TabA.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(i);
            }
        });
        // End Tab control

        // Tab control
        Button tabb = (Button) findViewById(R.id.tabaB);
        tabb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(v.getContext() , TabB.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(i);
            }
        });
        // End Tab control

        // Tab control
        Button tabc = (Button) findViewById(R.id.tabaC);
        tabc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(v.getContext() , TabC.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(i);
            }
        });
        // End Tab control



        // Start button sound
        Button bas = (Button) findViewById(R.id.bas);
        bas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.bas);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button gezeik = (Button) findViewById(R.id.gezeik);
        gezeik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.gezeik);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button huh = (Button) findViewById(R.id.huh);
        huh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.huh);
                mp.start();
            }
        });
        // End button sound


        // Start button sound
        Button jawel = (Button) findViewById(R.id.jawel);
        jawel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.jawel);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button wat = (Button) findViewById(R.id.wat);
        wat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.wat);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button nee = (Button) findViewById(R.id.nee);
        nee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.neeee);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button kutJong = (Button) findViewById(R.id.kutJong);
        kutJong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.kutjong);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button nee1 = (Button) findViewById(R.id.nee);
        nee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.neeee);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button neehee = (Button) findViewById(R.id.NeeHee);
        neehee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabA.this, R.raw.neeeheee);
                mp.start();
            }
        });
        // End button sound


        // Return home and fix audio
        ImageButton home = (ImageButton) findViewById(R.id.tabaHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                Intent i = new Intent();
                i.setClass(v.getContext(), MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(i);
            }
        });
        // End going hoem and fix audio





    }

}
