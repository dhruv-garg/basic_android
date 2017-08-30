package com.example.lenovo.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String naam[]={"abc","def","ghi","jkl","pqr"};
    String add[]={"gajf","sf","fs","fdsg","sgf"};
    Integer image[]={R.drawable.splash4,R.drawable.view1,R.drawable.view2,R.drawable.view3,R.drawable.splash4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customadaptar customadaptar = new customadaptar(this, naam, add, image);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customadaptar);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "You Clicked" + naam[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
