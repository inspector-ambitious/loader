package com.bubbleroad.toyhunt;
import java.lang.reflect.Method;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Loader extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("load")) {
            CordovaWebViewEngine localCordovaWebViewEngine = this.webView.getEngine();
            try {
                localCordovaWebViewEngine.getClass().getMethod("evaluateJavaScript", new Class[] { String.class }).invoke(localCordovaWebViewEngine, new Object[] { "alert('YEAH!');" });
            } catch (Exception e) {

            }
            String name = data.getString(0);
            String message = "test";
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
