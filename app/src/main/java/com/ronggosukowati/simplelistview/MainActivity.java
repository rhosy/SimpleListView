package com.ronggosukowati.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private String [] smartphone = {
            "Samsung",
            "Xiaomi",
            "Iphone",
            "Collpad",
            "Huawei",
            "Oppo",
            "Vivo",
            "Asus",
            "Advan"
    };

    private ListView listPhone;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Smart Phone");

        listPhone = (ListView) findViewById(R.id.list_phone);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, smartphone);
        listPhone.setAdapter(adapter);

        listPhone.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked " + smartphone[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
