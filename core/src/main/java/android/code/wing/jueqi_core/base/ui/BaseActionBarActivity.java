package android.code.wing.jueqi_core.base.ui;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;


/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      14-11-22 13:31
 * Description: Activity 基类
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 14-11-22      ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class BaseActionBarActivity extends FragmentActivity {
    protected final String TAG = getClass().getSimpleName();
    protected ActionBar mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActionBar = getActionBar();
    }

    protected void showActionBar() {
        if (mActionBar != null) {
            mActionBar.setDisplayShowCustomEnabled(false);
            mActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
