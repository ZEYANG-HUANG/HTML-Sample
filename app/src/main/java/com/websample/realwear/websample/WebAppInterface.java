package com.websample.realwear.websample;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fin on 17/05/2017.
 */

public class WebAppInterface {
    Context mContext;
    private JavaScriptListener mCallBack;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void VoiceCommands(String values){
        Toast.makeText(mContext, values, Toast.LENGTH_SHORT).show();
        List<WebElement> webElements = new ArrayList<>();
        try {
            JSONArray elements = new JSONArray(values);

            for(int i = 0; i < elements.length(); i++){
                JSONObject object = elements.getJSONObject(i);
                WebElement element = (WebElement)JsonEncoder.fromJson(object.toString(), WebElement.class);
                webElements.add(element);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(mCallBack != null)
            mCallBack.onReceivedWearML(webElements);
    }

    public void setCallBackListener(JavaScriptListener listener){
        mCallBack = listener;
    }

    public interface JavaScriptListener{
        void onReceivedWearML(List<WebElement> value);
    }
}