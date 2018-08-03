package com.jayanthan.studdatabase;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UPDATEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        View.OnClickListener lst=new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String rno = ((EditText)findViewById(R.id.rno)).getText().toString().trim();
                String uname = ((EditText)findViewById(R.id.uname)).getText().toString().trim();
                int marks = Integer.parseInt(((EditText)findViewById(R.id.mark)).getText().toString().trim());
                ContentValues cv = new ContentValues();
                cv.put("sname",uname);
                cv.put("marks",marks);
                SQLLite.studdatabase.update("student",cv,"rno="+rno,null);
                Toast.makeText(getBaseContext(),"Record Updated",Toast.LENGTH_SHORT).show();
            }
        };
        Button btnupdate=(Button)findViewById(R.id.btnupdate);
        btnupdate.setOnClickListener(lst);
    }
}