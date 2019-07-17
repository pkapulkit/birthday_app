package com.pka.sikha_birthday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final MediaPlayer ring= MediaPlayer.create(this,R.raw.ring);
        ring.start();
        ring.setVolume(100,100);
        TextView enter = (TextView)findViewById(R.id.enter);
        enter.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent welcome = new Intent(Welcome.this, HomeActivity.class);
                        startActivity(welcome);
                        ring.stop();
                    }
                }
        );


    }
}
