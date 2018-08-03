package com.jayanthan.studdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLLite s=new SQLLite(this);
        final Button INSERT = (Button)findViewById(R.id.btninsert);
        Button UPDATE = (Button)findViewById(R.id.btnupdate);
        Button FETCH = (Button)findViewById(R.id.btnview);
        Button EXIT = (Button)findViewById(R.id.btnexit);
        View.OnClickListener lst = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent target;
                switch (view.getId()){
                    case R.id.btninsert:
                        target = new Intent(MainActivity.this, INSERTActivity.class);
                        startActivity(target);
                        break;
                    case R.id.btnupdate:
                        target = new Intent(MainActivity.this, UPDATEActivity.class);
                        startActivity(target);
                        break;
                    case R.id.btnview:
                        target = new Intent(MainActivity.this, FETCHActivity.class);
                        startActivity(target);
                        break;
                    case R.id.btnexit:
                        System.exit(0);
                        break;
                }
            }
        };
        INSERT.setOnClickListener(lst);
        UPDATE.setOnClickListener(lst);
        FETCH.setOnClickListener(lst);
        EXIT.setOnClickListener(lst);
    }
}