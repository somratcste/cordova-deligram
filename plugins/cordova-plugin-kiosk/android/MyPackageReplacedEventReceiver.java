package jk.cordova.plugin.kiosk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Starts {@link HomeActivity} after the app APK is updated.
 */
public class MyPackageReplacedEventReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("Kiosk application restarting after upgrade");
        Intent newIntent = new Intent(context, KioskActivity.class);
        newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(newIntent);
    }
}
