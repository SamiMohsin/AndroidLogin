package com.omanamazon.chat.widgets;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * Created by ayoob on 09/05/17.
 */
public class Btn extends Button {

    public Btn(Context context) {
        super(context);
        init(context);
    }

    public Btn(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Btn(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        View view = findViewById(getId());
        AnimationDrawable anim = (AnimationDrawable) view.getBackground();
        anim.setEnterFadeDuration(5000);
        anim.setExitFadeDuration(5000);

        if (anim != null && !anim.isRunning())
            anim.start();

    }


}
