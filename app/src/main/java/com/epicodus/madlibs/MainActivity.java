package com.epicodus.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mSpaceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mLogo = (TextView) findViewById(R.id.logoTextView);
        Typeface mSigmarOne = Typeface.createFromAsset(getAssets(), "SigmarOne.ttf");
        mLogo.setTypeface(mSigmarOne);

        mSpaceButton = (Button) findViewById(R.id.spaceButton);
        mSpaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SpaceActivity.class);
                startActivity(intent);
            }
        });
    }
}
