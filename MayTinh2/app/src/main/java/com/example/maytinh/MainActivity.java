package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3,btn4, btn5,btn6, btn7,btn8,btn9,btn0,btnCong,btnTru,btnNhan,btnChia,btnBang,btnC;
    TextView txtView;
    Double var1,var2, ans;
    Boolean cong = false, tru = false, nhan = false, chia = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnC = findViewById(R.id.btnC);
        btnBang = findViewById(R.id.btnBang);
        txtView = findViewById(R.id.txtView);

        //Viet su kien

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "9");
            }
        });

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                buttonFalse();
                cong = true;
                tru = false;
                nhan = false;
                chia = false;

            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                buttonFalse();
                cong = false;
                tru = true;
                nhan = false;
                chia = false;
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                buttonFalse();
                cong = false;
                tru = false;
                nhan = true;
                chia = false;
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                buttonFalse();
                cong = false;
                tru = false;
                nhan = false;
                chia = true;
            }
        });

        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(txtView.getText().toString());

                if(cong){
                    ans = var1 + var2;
                }else if(tru){
                    ans = var1 - var2;
                }else if (nhan){
                    ans = var1 * var2;
                }else if(chia){
                    ans = var1/var2;
                }else {
                    ans = ans+0;
                }
                txtView.setText(ans.toString());
                btnBang.setEnabled(false);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBang.setEnabled(true);
                btnCong.setEnabled(true);
                btnNhan.setEnabled(true);
                btnChia.setEnabled(true);

                txtView.setText("");
            }
        });
    }
    public void setVar1(){
        var1 = Double.parseDouble(txtView.getText().toString());
    }
    public void buttonFalse(){
        btnCong.setEnabled(false);
        btnTru.setEnabled(false);
        btnNhan.setEnabled(false);
        btnChia.setEnabled(false);
        txtView.setText("");
    }
}