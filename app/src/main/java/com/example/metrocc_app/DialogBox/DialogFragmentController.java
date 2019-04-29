package com.example.metrocc_app.DialogBox;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.metrocc_app.R;

import static java.lang.reflect.Array.getInt;

public class DialogFragmentController extends DialogFragment {


    Button btnLeft, btnRight;
    TextView title, content;
    int dialogNum;


    public static DialogFragmentController newInstance(String title, String content, int dialogBoxNum) {
        DialogFragmentController f = new DialogFragmentController();
        Bundle args = new Bundle();
        args.putString("title", title);
        args.putString("content", content);
        args.putInt("dialogBoxNum", dialogBoxNum);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.Dialog_no_border);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_view, container, false);

        btnLeft = (Button) v.findViewById(R.id.btnContinue);
        btnRight = (Button) v.findViewById(R.id.btnGoBack);
        title = v.findViewById(R.id.tvForgotpassword);
        content = v.findViewById(R.id.tvForgotPasswordContent);

        btnRight.setTransformationMethod(null); //Off button text auto capitalizing
        btnLeft.setTransformationMethod(null);

        // Getting the arguments
        if (getArguments() == null) {
            throw new AssertionError();
        }

        dialogNum = getArguments().getInt("dialogBoxNum");
        title.setText(getArguments().getString("title"));
        content.setText(getArguments().getString("content"));


        switch (dialogNum) {

            // Forgot Password
            case 1:
                title.setTextColor(Color.YELLOW);
                btnLeft.setVisibility(View.GONE);
                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Pause Session
            case 2:
                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Continue button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Confirm Delete
            case 3:
                btnLeft.setText("Yes, Delete");
                btnRight.setText("Cancel");

                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Not in PJP
            case 4:
                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Continue button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Capture Geo-Location
            case 5:
                btnLeft.setText("No, Continue");
                btnRight.setText("Yes, Capture");

                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Incorrect Location
            case 6:
                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Card Swipe
            case 7:
                btnLeft.setText("Cancel");
                btnRight.setText("Yes, Confirm Order");
                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Stock Info
            case 8:
                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Insufficient Stock
            case 9:
                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Take Order
            case 10:
                btnLeft.setText("New Order");
                btnRight.setText("Resume");
                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Info
            case 11:
                btnLeft.setVisibility(View.GONE);
                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            // Confirm Cancel Quote
            case 12:
                btnLeft.setText("Yes, Delete");
                btnRight.setText("No");

                btnLeft.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;
        }

        return v;
    }
}
