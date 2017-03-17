package cordova.plugin.WPlugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.widget.Toast;
/**
 * This class echoes a string called from JavaScript.
 */
public class WPlugin extends CordovaPlugin {

         @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
             String message = args.getString(0);
        if (action.equals("coolMethod")) {
    

            this.coolMethod(message, callbackContext);
            return true;
        } else if (action.equals("hello")) {
            this.helloMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
   Toast.makeText(this.cordova.getActivity(), "cool", Toast.LENGTH_SHORT).show();
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }


    private void helloMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            android.widget.Toast.makeText(this.cordova.getActivity(), "hello", Toast.LENGTH_SHORT).show();
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }


    // @Override
    // public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    //            String message = args.getString(0);
    
    //     if (action.equals("coolMethod")) {
 
    //         this.coolMethod(message, callbackContext);
    //         return true;
    //     }
    //     return false;
    // }

    // private void coolMethod(String message, CallbackContext callbackContext) {
    //     if (message != null && message.length() > 0) {
    //         callbackContext.success(message);
    //     } else {
    //         callbackContext.error("Expected one non-empty string argument.");
    //     }
    // }
}
