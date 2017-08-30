package com.example.lenovo.alarammanager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAlert();
            }
        });
    }
        public void startAlert(){
        int i = Integer.parseInt(e1.getText().toString());
        Intent intent = new Intent(this,Kuchbhi.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(),234567897,intent,0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+ (i*1000),pendingIntent);
            Toast.makeText(this,"ALarm after" + i + "seconds", Toast.LENGTH_LONG).show();
         }
    }
