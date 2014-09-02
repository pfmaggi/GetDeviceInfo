package com.pietromaggi.sample.getdeviceinfo;

import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView DeviceNameTextView;
    TextView ESNTextView;
    TextView BuildNumberTextView;

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
    }
}
