package com.omanamazon.chat.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.omanamazon.chat.FontCache;

/**
 * Created by ayoob on 09/05/17.
 */
public class TextINput extends android.support.design.widget.TextInputLayout {
    public TextINput(Context context) {
        super(context);
        init(context);
    }

    public TextINput(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TextINput(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setTypeface(FontCache.getTypeface(context,"regular.ttf"));

    }
}
