package android.code.wing.jueqi_core.base.util;

import android.content.Context;
import android.widget.Toast;


public class MessageUtil {


    private Context mContext;
    private static MessageUtil mslToast;

    public static MessageUtil getInstance(Context mContext) {
        if (mslToast == null) {
            mslToast = new MessageUtil(mContext);
        }
        return mslToast;
    }

    private MessageUtil(Context mContext) {
        this.mContext = mContext;
    }

    public static void showMessage(Context context, String msg) {
        if (context != null) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        }
    }

    public static void showMessage(Context context, int resourceId) {
        if (context != null) {
            Toast.makeText(context, resourceId, Toast.LENGTH_LONG).show();
        }
    }

    public static void showMessage(Context context, int resourceId, int showTime) {
        if (context != null) {
            Toast.makeText(context, resourceId, showTime).show();
        }
    }

    public static void showMessage(Context context, String msg, int showTime) {
        if (context != null) {
            Toast.makeText(context, msg, showTime).show();
        }
    }


}
