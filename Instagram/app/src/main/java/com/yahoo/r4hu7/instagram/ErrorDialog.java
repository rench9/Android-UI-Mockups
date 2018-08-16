package com.yahoo.r4hu7.instagram;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

public class ErrorDialog extends DialogFragment {

    public static ErrorDialog newInstance(String userName) {
        ErrorDialog errorDialog = new ErrorDialog();
        Bundle bundle = new Bundle();
        bundle.putString("un", userName);
        errorDialog.setArguments(bundle);
        return errorDialog;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        View v = inflater.inflate(R.layout.fragment_error, container, false);
        TextView tv = v.findViewById(R.id.tvTitle);
        TextView tvRetry = v.findViewById(R.id.tvRetry);
        tv.setText(String.format("Incorrect password for %s", getArguments().getString("un")));

        tvRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ErrorDialog.this.getDialog().dismiss();
            }
        });
        return v;
    }
}
