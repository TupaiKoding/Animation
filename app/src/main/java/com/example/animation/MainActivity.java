package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    ImageView iv;
    Button bt1, bt2, appearBtn, screwBtn, bounceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        iv = (ImageView) findViewById(R.id.imageButton);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);

        appearBtn = (Button) findViewById(R.id.appearBtn);
        screwBtn = (Button) findViewById(R.id.screwBtn);
        bounceBtn = (Button) findViewById(R.id.bounceBtn);

        Animation testAnim;

        testAnim = AnimationUtils.loadAnimation(this, R.anim.blink);
        tv1.startAnimation(testAnim);
    }
}