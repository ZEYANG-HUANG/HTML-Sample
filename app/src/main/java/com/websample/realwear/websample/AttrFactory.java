package com.websample.realwear.websample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Luke on 29/03/2017.
 */

public class AttrFactory implements LayoutInflater.Factory {

    @Override
    public View onCreateView(String name, Context context,
                             AttributeSet attrs) {
            if(name.contains("RecyclerView")){

            }
            return null;
    }
}