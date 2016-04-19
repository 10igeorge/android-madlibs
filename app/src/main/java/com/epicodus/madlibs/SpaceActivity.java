package com.epicodus.madlibs;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SpaceActivity extends AppCompatActivity {
    private static final String TAG = SpaceActivity.class.getSimpleName();
    private Button mSubmitSpaceButton;
    private EditText mColorSpaceInput;
    private EditText mNounSpaceInput1;
    private EditText mNounSpaceInput2;
    private EditText mNounSpaceInput3;
    private EditText mFamousPlaceSpaceInput;
    private EditText mAdjectiveSpaceInput1;
    private EditText mAdjectiveSpaceInput2;
    private EditText mAdjectiveSpaceInput3;
    private EditText mAdjectiveSpaceInput4;
    private EditText mVerbSpaceInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);

        mColorSpaceInput = (EditText) findViewById(R.id.colorSpaceInput);
        mNounSpaceInput1 = (EditText) findViewById(R.id.nounSpaceInput1);
        mNounSpaceInput2 = (EditText) findViewById(R.id.nounSpaceInput2);
        mNounSpaceInput3 = (EditText) findViewById(R.id.nounSpaceInput3);
        mFamousPlaceSpaceInput = (EditText) findViewById(R.id.famousPlaceSpaceInput);
        mAdjectiveSpaceInput1 = (EditText) findViewById(R.id.adjectiveSpaceInput1);
        mAdjectiveSpaceInput2 = (EditText) findViewById(R.id.adjectiveSpaceInput2);
        mAdjectiveSpaceInput3 = (EditText) findViewById(R.id.adjectiveSpaceInput3);
        mAdjectiveSpaceInput4 = (EditText) findViewById(R.id.adjectiveSpaceInput4);
        mVerbSpaceInput = (EditText) findViewById(R.id.verbSpaceInput);
        mSubmitSpaceButton = (Button) findViewById(R.id.submitSpaceButton);
        mSubmitSpaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String color = mColorSpaceInput.getText().toString();
                String noun1 = mNounSpaceInput1.getText().toString();
                String noun2 = mNounSpaceInput2.getText().toString();
                String noun3 = mNounSpaceInput3.getText().toString();
                String famousPlace = mFamousPlaceSpaceInput.getText().toString();
                String adj1 = mAdjectiveSpaceInput1.getText().toString();
                String adj2 = mAdjectiveSpaceInput2.getText().toString();
                String adj3 = mAdjectiveSpaceInput3.getText().toString();
                String adj4 = mAdjectiveSpaceInput4.getText().toString();
                String verb = mVerbSpaceInput.getText().toString();

                Intent intent = new Intent(SpaceActivity.this, SpaceResultsActivity.class);
                startActivity(intent);
            }
        });


    }
}
