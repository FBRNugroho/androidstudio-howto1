package com.example.febriantonugroho.androidstudio_howto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Todo: setLineSpacing txtHello1 to 10dp */
        TextView txtHello1 = (TextView) findViewById(R.id.txtHello1);
        float add = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
        float mult = 1.0f;
        txtHello1.setLineSpacing(add, mult);

        /* Todo: setLineSpacing txtHello2 to 15dp */
        ((TextView) findViewById(R.id.txtHello2)).setLineSpacing(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15, getResources().getDisplayMetrics()), 1.0f);
    }
}
