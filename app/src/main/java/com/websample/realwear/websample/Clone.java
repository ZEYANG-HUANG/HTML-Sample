package com.websample.realwear.websample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebView;

import java.util.List;
/*
public class Clone extends AppCompatActivity implements WebAppInterface.JavaScriptListener {

    private WebView web;

    String ACTION_OVERRIDE = "com.realwear.wearhf.intent.action.OVERRIDE_COMMANDS";

    String EXTRA_COMMANDS = "com.realwear.wearhf.intent.extra.COMMANDS";
    String EXTRA_SOURCE = "com.realwear.wearhf.intent.extra.SOURCE_PACKAGE";
    String EXTRA_GLOBAL = "com.realwear.wearhf.intent.extra.GLOBAL_COMMANDS";
    String EXTRA_BUTTON = "com.realwear.wearhf.intent.extra.ACTION_BUTTON_HOME";
    String ACTION_RESTORE = "com.realwear.wearhf.intent.action.RESTORE_COMMANDS";

    String ACTION_SPEECH_EVENT = "com.realwear.wearhf.intent.action.SPEECH_EVENT";

    String EXTRA_COMMAND = "com.realwear.wearhf.intent.extra.COMMAND";
    String EXTRA_ORIG_COMMAND = "com.realwear.wearhf.intent.extra.ORIGINAL_COMMAND";
    String EXTRA_CONFIDENCE = "com.realwear.wearhf.intent.extra.CONFIDENCE";
    private List<WebElement> mWebElemenets;

    private String user_agent = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getLayoutInflater().setFactory(new AttrFactory());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        web = (WebView)findViewById(R.id.webView);
        web.setWebViewClient(new myWebClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setDefaultFontSize(24);
        //web.getSettings().setUserAgentString("my-user-agent");
        //web.loadUrl("http://mobilehtml5.org/ts/?id=23");
        web.loadUrl("file:///android_asset/sample/type_1/index.html");
        //web.loadUrl("http://193.85.188.162:5080/anyglass/pubdisplay/RealWear-demo.gdfx");
        WebAppInterface webInterface = new WebAppInterface(this);
        webInterface.setCallBackListener(this);
        //web.addJavascriptInterface(webInterface, "Android");

        String value = Build.VERSION.RELEASE;

    }

    public void callJavascriptFunction(String func){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            web.evaluateJavascript(func, null);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        registerReceiver(speechBroadcastReceiver, new IntentFilter(ACTION_SPEECH_EVENT));
    }

    @Override
    public void onReceivedWearML(List<WebElement> value) {
        mWebElemenets = value;
        updateCommands();
    }

    private void updateCommands(){
        if(mWebElemenets == null || mWebElemenets.size() == 0){
            restoreCommands();
        }else {
            StringBuilder sb = new StringBuilder();

            for (WebElement element : mWebElemenets) {
                sb.append(element.SpeechCommand + " ");
                sb.append("|");
            }
            sb.setLength(Math.max(sb.length() - 1, 0));

            Intent intent = new Intent(ACTION_OVERRIDE);
            intent.putExtra(EXTRA_COMMANDS, sb.toString());
            intent.putExtra(EXTRA_SOURCE, getPackageName());
            //sendBroadcast(intent);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        restoreCommands();
    }

    private void restoreCommands(){
        Intent intent = new Intent(ACTION_RESTORE);
        //sendBroadcast(intent);
    }

    private BroadcastReceiver speechBroadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            if (intent.getAction().equals(ACTION_SPEECH_EVENT)) {
                //Speech detected
                String command = intent.getStringExtra(EXTRA_COMMAND);

                for(WebElement element : mWebElemenets){
                    if(command.equals(element.SpeechCommand) || command == element.SpeechCommand){
                        String inject = String.format("document.elementFromPoint(%f, %f).click();", element.Top, element.Right);
                        callJavascriptFunction(inject);
                    }
                }
            }
            updateCommands();
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
            web.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}*/