package com.example.salah.includemergetag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
ImageView iimageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        button = (Button)findViewById( R.id.button );
        iimageView = (ImageView)findViewById(R.id.iimageView );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( getApplication(), "click on includ button", Toast.LENGTH_LONG ).show();
            }
        } );
    }
}
