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

public class TabB extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // Tab control
        Button taba = (Button) findViewById(R.id.tabbA);
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
        Button tabb = (Button) findViewById(R.id.tabbB);
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
        Button tabc = (Button) findViewById(R.id.tabbC);
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
        Button gewoonAltijd = (Button) findViewById(R.id.gewoonAltijd);
        gewoonAltijd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.gewoonaltijd);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button kutStem = (Button) findViewById(R.id.kutStem);
        kutStem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.hebikechtzonkutstem);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button stoerDoen = (Button) findViewById(R.id.hierStoerDoen);
        stoerDoen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.hijwilhierstoerdoen);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button benSerieus = (Button) findViewById(R.id.benSerieus);
        benSerieus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.ikbenserieus);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button krijgMelding = (Button) findViewById(R.id.krijgMelding);
        krijgMelding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.ikkrijgeenmelding);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button napHetNiet = (Button) findViewById(R.id.snapHetNiet);
        napHetNiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.iksnaphetniet);
                mp.start();
            }
        });
        // End button sound


        // Start button sound
        Button luisterEens = (Button) findViewById(R.id.luisterEens);
        luisterEens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.luistereens);
                mp.start();
            }
        });
        // End button sound


        // Start button sound
        Button neeFFserieus = (Button) findViewById(R.id.ffSerieus);
        neeFFserieus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.neeffserieus);
                mp.start();
            }
        });
        // End button sound


        // Start button sound
        Button klaarMee = (Button) findViewById(R.id.klaarMee);
        klaarMee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.neeikbenerklaarmeenu);
                mp.start();
            }
        });
        // End button sound


        // Start button sound
        Button opeensHard = (Button) findViewById(R.id.opeensHard);
        opeensHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.verahard);
                mp.start();
            }
        });
        // End button sound


        // Start button sound
        Button watHebJe = (Button) findViewById(R.id.watHebJe);
        watHebJe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.wathebje);
                mp.start();
            }
        });
        // End button sound


        // Start button sound
        Button watisDit = (Button) findViewById(R.id.watIdDit);
        watisDit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabB.this, R.raw.watisdit);
                mp.start();
            }
        });
        // End button sound


        // Return home and fix audio
        ImageButton home = (ImageButton) findViewById(R.id.tabbHome);
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
