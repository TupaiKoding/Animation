package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    ImageButton ib;
    Button bt1, bt2, appearBtn, screwBtn, bounceBtn, stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        ib = (ImageButton) findViewById(R.id.imageButton);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);

        stopBtn = (Button) findViewById(R.id.stopBtn);

        appearBtn = (Button) findViewById(R.id.appearBtn);
        screwBtn = (Button) findViewById(R.id.screwBtn);
        bounceBtn = (Button) findViewById(R.id.bounceBtn);

        Animation blinkAnim, bounceAnim, moveAnim, zoomInAnim, appearAnim, screwAnim, rotateAnim;

        blinkAnim = AnimationUtils.loadAnimation(this, R.anim.blink);
        bounceAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        moveAnim = AnimationUtils.loadAnimation(this, R.anim.move);
        zoomInAnim = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        appearAnim = AnimationUtils.loadAnimation(this, R.anim.appear);
        screwAnim = AnimationUtils.loadAnimation(this, R.anim.screw);
        rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt2.startAnimation(rotateAnim);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1.startAnimation(zoomInAnim);
            }
        });

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopBtn.startAnimation(moveAnim);
            }
        });

        appearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ib.startAnimation(appearAnim);
                appearBtn.startAnimation(moveAnim);
            }
        });

        bounceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ib.startAnimation(bounceAnim);
                bounceBtn.startAnimation(zoomInAnim);
            }
        });

        screwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ib.startAnimation(screwAnim);
                screwBtn.startAnimation(blinkAnim);
            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.clearAnimation();
                ib.clearAnimation();
                bt1.clearAnimation();
                bt2.clearAnimation();
                appearBtn.clearAnimation();
                bounceBtn.clearAnimation();
                screwBtn.clearAnimation();
                stopBtn.clearAnimation();
            }
        });

        tv1.startAnimation(blinkAnim);
    }
}