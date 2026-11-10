
package com.h96modern.tv;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().getDecorView().setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_FULLSCREEN |
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        WebView web = new WebView(this);
        web.setBackgroundColor(0xFF080D20);

        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);

        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }
}
