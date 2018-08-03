package com.jayanthan.studdatabase;
import android.content.ContentValues;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;

public class FETCHActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch);
        Button btnview = (Button)findViewById(R.id.btnview);
        View.OnClickListener lst = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int rno = Integer.parseInt(((EditText)findViewById(R.id.rno)).getText().toString().trim());
                Cursor rs = SQLLite.studdatabase.rawQuery("SELECT * FROM student where rno="+rno,null);
                rs.moveToFirst();
                EditText uname = (EditText) findViewById(R.id.uname);
                EditText marks = (EditText) findViewById(R.id.mark);
                uname.setText(rs.getString(1));
                marks.setText(rs.getString(2));
            }
        };
        btnview.setOnClickListener(lst);
    }
}