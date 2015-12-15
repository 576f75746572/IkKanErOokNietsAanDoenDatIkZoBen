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

public class TabC extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // Tab control
        Button taba = (Button) findViewById(R.id.tabcA);
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
        Button tabb = (Button) findViewById(R.id.tabcB);
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
        Button tabc = (Button) findViewById(R.id.tabcC);
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
        Button elkeKeer = (Button) findViewById(R.id.elkeKeer);
        elkeKeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.datkrijgiknouechtelkekeer);
                mp.start();
            }
        });
        // End button sound


        // Start button sound
        Button klaarMee = (Button) findViewById(R.id.klaarMee);
        klaarMee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.eigenlijkbenikerwelklaarmee);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button nietsAanDoen = (Button) findViewById(R.id.nietsAanTeDoen);
        nietsAanDoen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.ikkanerooknietsaandoendatikzoben);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button firefox = (Button) findViewById(R.id.firefox);
        firefox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.lichthetaandiefockingfirefoxweer);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button FuckPaulFirefox = (Button) findViewById(R.id.fuckPaulFirefox);
        FuckPaulFirefox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.paulfuckyouandyourfirefox);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button stompSheldon = (Button) findViewById(R.id.stompSheldon);
        stompSheldon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.sheldonikstompjoudalijk);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button grappigste = (Button) findViewById(R.id.grappigste);
        grappigste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.wachtdezevindikechtdegrappigste);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button kunnenWijOok = (Button) findViewById(R.id.kunnenWijOok);
        kunnenWijOok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.watjijenanneloeskunnenkunnenwijook);
                mp.start();
            }
        });
        // End button sound

        // Start button sound
        Button doorgaanOfStoppen = (Button) findViewById(R.id.doorGaanStoppen);
        doorgaanOfStoppen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(TabC.this, R.raw.watmoetikdoendoorgaanofstoppen);
                mp.start();
            }
        });
        // End button sound



        // Return home and fix audio
        ImageButton home = (ImageButton) findViewById(R.id.tabcHome);
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
