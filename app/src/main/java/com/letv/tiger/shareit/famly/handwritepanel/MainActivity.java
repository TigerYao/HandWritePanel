package com.letv.tiger.shareit.famly.handwritepanel;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onJianbiClick(View view) {

    }

    public void onQianpiClick(View view) {

    }

    public void onErtongClick(View view) {

    }

    public void onJishiClick(View view) {

    }

    public void onToolClick(View view) {

    }

    public void onAllClick(View view) {
        Log.i("tag","click");
        try {
            Intent intent = new Intent("/");
            ComponentName cm = new ComponentName("com.android.settings","com.android.settings.ManageApplications");
            intent.setComponent(cm);
            intent.setAction("android.intent.action.VIEW");
            startActivityForResult( intent , 0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void onHuibenClick(View view) {

    }

    public void onNetWorkClick(View view) {
        Log.i("tag","click");
        Intent intent = new Intent();
        intent.setData(Uri.parse("http://www.baidu.com"));
        intent.setAction(Intent.ACTION_VIEW);
        startActivity(intent);
    }

}
