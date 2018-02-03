package com.example.atzaw.informationstorageproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button createContactButton = (Button)findViewById(R.id.newContactButton);

        createContactButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                newContactsPage(v);
            }
        });
    }

    public void newContactsPage(View v) {
        Intent newContactsIntent = new Intent(this, EnterContactActivity.class);
        startActivity(newContactsIntent);
    }

}
