package de.japancountdown.app;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebSettings; import android.webkit.WebView; import android.webkit.WebViewClient;
public class MainActivity extends Activity {
@Override public void onCreate(Bundle state){super.onCreate(state); WebView w=new WebView(this); w.setWebViewClient(new WebViewClient()); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); w.setOverScrollMode(WebView.OVER_SCROLL_NEVER); setContentView(w); w.loadUrl("file:///android_asset/index.html");}
}
