package com.verifone.kail1.servicetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btStartService = (Button) findViewById(R.id.start_service);
        Button btStopService = (Button) findViewById(R.id.stop_service);

        btStartService.setOnClickListener(this);
        btStopService.setOnClickListener(this);

        intent = new Intent(this, VerifoneService.class);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.start_service:
                startService(intent);
                break;
            case R.id.stop_service:
                stopService(intent);
                break;
            default:
                break;
        }
    }
}
