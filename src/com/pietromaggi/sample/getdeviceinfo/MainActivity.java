package com.pietromaggi.sample.getdeviceinfo;

import android.os.Build;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView DeviceNameTextView;
    TextView ESNTextView;
    TextView BuildNumberTextView;
    TextView ExternalStorageDirectoryTextView;
    TextView InternalSDCardTextView;
    TextView TrueSDCardTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DeviceNameTextView = (TextView)findViewById(R.id.device_type);
        DeviceNameTextView.setText(Build.DEVICE);

        ESNTextView = (TextView)findViewById(R.id.device_esn);
        ESNTextView.setText(Build.SERIAL);

        BuildNumberTextView = (TextView)findViewById(R.id.build_number);
        BuildNumberTextView.setText(Build.ID);

        ExternalStorageDirectoryTextView = (TextView)findViewById(R.id.external_storage);
        ExternalStorageDirectoryTextView.setText(Environment.getExternalStorageDirectory()+ "");

        InternalSDCardTextView = (TextView)findViewById(R.id.internal_sdcard);
        InternalSDCardTextView.setText(System.getenv("EXTERNAL_STORAGE"));

        String strSDCardPath = System.getenv("SECONDARY_STORAGE");
        if ((null == strSDCardPath) || (strSDCardPath.length() == 0)) {
            strSDCardPath = System.getenv("EXTERNAL_SDCARD_STORAGE");
        }
        TrueSDCardTextView = (TextView)findViewById(R.id.true_sdcard);
        TrueSDCardTextView.setText(strSDCardPath);

    }
}
