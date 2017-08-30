package com.example.lenovo.alarammanager;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Main2Activity extends AppCompatActivity {

    ProgressDialog p1;
    Button b1;
    private int progressBarStatus=0;
    private Handler progressBarHandler = new Handler();
    private long fileSize=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1= new ProgressDialog(view.getContext());
                p1.setCancelable(true);
                p1.setMessage("File downloading.....");
                p1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                p1.setProgress(0);
                p1.setMax(100);
                p1.show();
                progressBarStatus = 0;
                fileSize = 0;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(progressBarStatus<100)
                        {
                            progressBarStatus=doOperation();
                            try{
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            progressBarHandler.post(new Runnable() {
                                @Override
                                public void run() {

                                }
                            });

                        }

                        if(progressBarStatus>=100)
                        {
                            
                        }
                    }
                })
            }
        });
    }
}
