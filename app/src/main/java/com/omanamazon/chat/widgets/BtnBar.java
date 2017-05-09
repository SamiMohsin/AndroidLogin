package com.omanamazon.chat.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.v7.widget.ButtonBarLayout;
import android.util.AttributeSet;
import com.omanamazon.chat.R;

/**
 * Created by ayoob on 09/05/17.
 */
public class BtnBar extends ButtonBarLayout
{

    Paint paint;

    Resources.Theme theme;
    public BtnBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }



    private void init(Context context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            setBackgroundColor(getResources().getColor(R.color.colorAccent,theme));
        }
        paint = new Paint();
        paint.setDither(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            paint.setElegantTextHeight(true);
        }
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeWidth(10);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPaint(paint);
    }
}
