package com.websample.realwear.websample;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

public class WebAppInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /** Sends Broadcast to speech service to force update */
    @JavascriptInterface
    public void updateVoiceCommands() {
        mContext.sendBroadcast(new Intent("com.realwear.wearhf.intent.action.REFRESH_UI"));
    }
}