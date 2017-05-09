package com.omanamazon.chat.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.omanamazon.chat.FontCache;
import com.omanamazon.chat.R;

/**
 * Created by ayoob on 09/05/17.
 */
public class EditLogin extends EditText {

    public EditLogin(Context context) {
        super(context);
        init(context);
    }

    public EditLogin(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public EditLogin(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setTypeface(FontCache.getTypeface(context,"regular.ttf"));
        setShadowLayer(1,1,1,getResources().getColor(R.color.brown_900));
    }
}
