package com.omanamazon.chat;

import android.graphics.*;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


/**
 * Created by ayoob on 09/05/17.
 */
public class LoginActivity extends AppCompatActivity {


    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(View.SYSTEM_UI_LAYOUT_FLAGS|
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
                View.HAPTIC_FEEDBACK_ENABLED);
        setContentView(R.layout.login_main);
        RelativeLayout container = (RelativeLayout) findViewById(R.id.container);

        AnimationDrawable anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(5000);
        anim.setExitFadeDuration(5000);

        if (anim != null && !anim.isRunning())
            anim.start();
        Button Btnlogin = (Button) findViewById(R.id.btn_login);

//        Paint paint = new Paint();
//                Bitmap bitmap
//                = BitmapFactory.decodeResource(
//                getResources(),
//                R.drawable.seamless);
//        Shader shader = new BitmapShader(
//                bitmap,
//                Shader.TileMode.REPEAT,
//                Shader.TileMode.REPEAT);
//        paint.setShader(shader);


    }
}
