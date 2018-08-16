package com.yahoo.r4hu7.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public static final String ALERTDIALOG = "alertdialog";
    public static final String UN = "sgvu";
    public static final String PW = "1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText un = findViewById(R.id.etUsername);
        final EditText pw = findViewById(R.id.etPassword);
        final Button btn = findViewById(R.id.btnLogin);

        pw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0)
                    btn.setEnabled(true);
                else btn.setEnabled(false);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (un.getText().toString().equals(UN) && pw.getText().toString().equals(PW)) {
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                } else showErrorDialog(un.getText().toString());
            }
        });

    }


    public void showErrorDialog(String userName) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Fragment prevFragment = getSupportFragmentManager().findFragmentByTag(ALERTDIALOG);
        if (prevFragment != null) {
            fragmentTransaction.remove(prevFragment);
        }
        fragmentTransaction.addToBackStack(null);
        ErrorDialog dialog = ErrorDialog.newInstance(userName);
        dialog.setCancelable(true);
        dialog.show(getSupportFragmentManager(), ALERTDIALOG);
    }

}
