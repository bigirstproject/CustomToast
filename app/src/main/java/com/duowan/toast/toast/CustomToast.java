package com.duowan.toast.toast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by dexian on 2015/11/17.
 */
public class CustomToast extends Toast {


    int ccc ;

    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public CustomToast(Context context) {
        super(context);
        Log.d(CustomToast.class.getSimpleName(),"ccc = "+ccc);
    }

    @Override
    public void setDuration( int duration) {
        super.setDuration(duration);
    }

    @Override
    public int getDuration() {
        super.getDuration();
        return LENGTH_LONG;
    }


}
