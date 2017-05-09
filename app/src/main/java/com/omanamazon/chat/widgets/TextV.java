package com.omanamazon.chat.widgets;

import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.widget.TextView;
import com.omanamazon.chat.FontCache;
import com.omanamazon.chat.R;

/**
 * Created by ayoob on 09/05/17.
 */
public class TextV extends TextView {

    public TextV(Context context) {
        super(context);
        init(context);
    }

    public TextV(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TextV(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setTypeface(FontCache.getTypeface(context,"regular.ttf"));
        setShadowLayer(4,2,2,getResources().getColor(R.color.brown_900));
    }
}
