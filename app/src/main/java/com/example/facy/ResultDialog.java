package com.example.facy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import org.w3c.dom.Text;

public class ResultDialog extends DialogFragment {

    Button btn;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_resultdialog, container, false);
        String text = "";

        btn = view.findViewById(R.id.okBtn);
        textView = view.findViewById(R.id.dialog);

        // Getting the bundle (from MainActivity):
        Bundle bundle = getArguments();
        text = bundle.getString("RESULT_TEXT");
        textView.setText(text);

        // Adding click listeners to btn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return view;
    }
}
