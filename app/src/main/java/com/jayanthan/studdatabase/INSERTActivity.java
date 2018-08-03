package com.jayanthan.studdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class INSERTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        Button btninsert = (Button)findViewById(R.id.btninsert);
        View.OnClickListener lst=new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int rno=Integer.parseInt(((EditText)findViewById(R.id.rno)).getText().toString().trim());
                String sname=((EditText)findViewById(R.id.uname)).getText().toString().trim();
                int marks=Integer.parseInt(((EditText)findViewById(R.id.mark)).getText().toString().trim());
                SQLLite.studdatabase.execSQL("INSERT INTO student VALUES('"+rno+"','"+sname+"','"+marks+"')");
                Toast.makeText(getBaseContext(),"Record Inserted Successfully", Toast.LENGTH_LONG).show();
            }
        };
        btninsert.setOnClickListener(lst);
    }
}