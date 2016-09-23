package com.example.setditjenp2mkt.coba2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputText, log;
    Button buttonAC,
            button0,
            button1,
            button2,
            button3,
            button4,
            button5,
            button6,
            button7,
            button8,
            button9,
            hapus,
            koma,
            kali,
            bagi,
            tambah,
            kurang,
            akar,
            samadengan,
            kuadrat,
            persen;
    double input1 = 0.0;
    double input2 = 0.0;
    double input3 = 0.0;
    double nilaikuadrat = 0.0;
    boolean isTambah, isKurang, isBagi, isKali, isKoma, isKuadrat, checker, akhir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = (EditText)findViewById(R.id.editText);
        log = (EditText)findViewById(R.id.editText2);
        buttonAC = (Button)findViewById(R.id.button23);
        hapus = (Button)findViewById(R.id.button22);
        button0 = (Button)findViewById(R.id.button);
        button1 = (Button)findViewById(R.id.button6);
        button2 = (Button)findViewById(R.id.button7);
        button3 = (Button)findViewById(R.id.button8);
        button4 = (Button)findViewById(R.id.button12);
        button5 = (Button)findViewById(R.id.button13);
        button6 = (Button)findViewById(R.id.button14);
        button7 = (Button)findViewById(R.id.button18);
        button8 = (Button)findViewById(R.id.button19);
        button9 = (Button)findViewById(R.id.button20);
        kuadrat = (Button)findViewById(R.id.button10);
        koma = (Button)findViewById(R.id.button2);
        kali = (Button)findViewById(R.id.button15);
        bagi = (Button)findViewById(R.id.button21);
        tambah = (Button)findViewById(R.id.button4);
        kurang = (Button)findViewById(R.id.button9);
        akar = (Button)findViewById(R.id.button11);
        samadengan = (Button)findViewById(R.id.button5);
        kuadrat = (Button)findViewById(R.id.button10);
        persen = (Button)findViewById(R.id.button3);
        inputText.setText("0");

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("0");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else{
                    inputText.setText(inputText.getText() + "0");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("1");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "1");
                }
                isKuadrat = false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("2");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "2");
                }
                isKuadrat = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("3");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "3");
                }
                isKuadrat = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("4");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "4");
                }
                isKuadrat = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("5");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "5");
                }
                isKuadrat = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("6");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "6");
                }
                isKuadrat = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("7");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "7");
                }
                isKuadrat = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("8");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "8");
                }
                isKuadrat = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float cek = Float.parseFloat(inputText.getText() + "");
                if ((cek == 0 || checker) && !isKoma){
                    inputText.setText("9");
                    checker = false;
                    if (akhir){
                        log.setText("");
                        akhir = false;
                    }
                } else {
                    inputText.setText(inputText.getText() + "9");
                }
                isKuadrat = false;
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1 == 0){
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKoma){
                        log.setText(input1 + " + ");
                    } else{
                        log.setText((int)input1 + " + ");
                    }
                } else{
                    hasil();
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKuadrat){
                        log.setText(log.getText() + "" + " + ");
                    } else{
                        if (isKoma){
                            log.setText(log.getText() + "" + input2 + " + ");
                        } else{
                            log.setText(log.getText() + "" + ((int)input2) + " + ");
                        }
                    }
                }
                isTambah = true;
                checker = true;
                isKoma = false;
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1 == 0){
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKoma){
                        log.setText(input1 + " - ");
                    } else{
                        log.setText((int)input1 + " - ");
                    }
                } else{
                    hasil();
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKuadrat){
                        log.setText(log.getText() + "" + " - ");
                    } else{
                        if (isKoma){
                            log.setText(log.getText() + "" + input2 + " - ");
                        } else{
                            log.setText(log.getText() + "" + ((int)input2) + " - ");
                        }
                    }
                }
                isKurang = true;
                checker = true;
                isKoma = false;
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1 == 0){
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKoma){
                        log.setText(input1 + " x ");
                    } else{
                        log.setText((int)input1 + " x ");
                    }
                } else{
                    hasil();
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKuadrat){
                        log.setText(log.getText() + "" + " x ");
                    } else{
                        if (isKoma){
                            log.setText(log.getText() + "" + input2 + " x ");
                        } else{
                            log.setText(log.getText() + "" + ((int)input2) + " x ");
                        }
                    }
                }
                isKali = true;
                checker = true;
                isKoma = false;
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1 == 0){
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKoma){
                        log.setText(input1 + " / ");
                    } else{
                        log.setText((int)input1 + " / ");
                    }
                } else{
                    hasil();
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKuadrat){
                        log.setText(log.getText() + "" + " / ");
                    } else{
                        if (isKoma){
                            log.setText(log.getText() + "" + input2 + " / ");
                        } else{
                            log.setText(log.getText() + "" + ((int)input2) + " / ");
                        }
                    }
                }
                isBagi = true;
                checker = true;
                isKoma = false;
            }
        });

        samadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTambah || isKurang || isKali || isBagi ||isKuadrat){
                    hasil();
                    if (!isKuadrat){
                        if (isKoma){
                            log.setText(log.getText() + "" + input2);
                        } else{
                            log.setText(log.getText() + "" + ((int)input2));
                        }
                    }
                    isKoma = false;
                    akhir = true;
                    input1 = 0;
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("0");
                log.setText("");
                input1 = 0;
                input2 = 0;
                input3 = 0;
                isKoma = false;
                checker = false;
                akhir = false;
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = inputText.getText().length();
                if (length > 1) {
                    inputText.getText().delete(length - 1, length);
                } else if (length == 1){
                    inputText.setText("0");
                }

            }
        });

        koma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isKoma && checker) {
                    inputText.setText("0.");
                    isKoma = true;
                } else{
                    inputText.setText(inputText.getText() + ".");
                    isKoma = true;
                }
            }
        });

        kuadrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1 == 0){
                    input1 = Double.parseDouble(inputText.getText() + "");
                    if (isKoma){
                        log.setText(input1 + " \u00b2 ");
                    } else{
                        log.setText((int)input1 + " \u00b2 ");
                    }
                } else{
                    input3 = Double.parseDouble(inputText.getText() + "");
                    if (isKoma){
                        log.setText(log.getText() + "" + input3 + " \u00b2 ");
                    } else{
                        log.setText(log.getText() + "" + (int)input3 + " \u00b2 ");
                    }
                }
                kuadrat();
                isKuadrat = true;
            }
        });

        akar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Double.parseDouble(inputText.getText() + "");
                if (isKoma){
                    inputText.setText(Math.sqrt(input1) + "");
                    log.setText(" \u221a " + input1);
                } else{
                    inputText.setText((Math.sqrt(input1)) + "");
                    log.setText(" \u221a " + (int)input1);
                }
            }
        });

        persen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Double.parseDouble(inputText.getText() + "");
                inputText.setText(input1 / 100 + "");
            }
        });
    }

    protected void hasil(){
        input2 = Double.parseDouble(inputText.getText() + "");
        if (isTambah){
            if (isKoma){
                if(input3 != 0){
                    input2 = nilaikuadrat;
                    input3 = 0;
                }
                inputText.setText(input1 + input2 + "");
            } else{
                if(input3 != 0){
                    input2 = nilaikuadrat;
                    input3 = 0;
                }
                inputText.setText((int)(input1 + input2) + "");
            }
            isTambah = false;
        } else if (isKurang){
            if (isKoma){
                if(input3 != 0){
                    input2 = nilaikuadrat;
                    input3 = 0;
                }
                inputText.setText(input1 - input2 + "");
            } else{
                if(input3 != 0){
                    input2 = nilaikuadrat;
                    input3 = 0;
                }
                inputText.setText((int)(input1 - input2) + "");
            }
            isKurang = false;
        } else if (isKali){
            if (isKoma){
                if(input3 != 0){
                    input2 = nilaikuadrat;
                    input3 = 0;
                }
                inputText.setText(input1 * input2 + "");
            } else{
                if(input3 != 0){
                    input2 = nilaikuadrat;
                    input3 = 0;
                }
                inputText.setText((int)(input1 * input2) + "");
            }
            isKali = false;
        } else if (isBagi){
            if (input1 % input2 != 0){
                if(input3 != 0){
                    input2 = nilaikuadrat;
                    input3 = 0;
                }
                inputText.setText(input1 / input2 + "");
            } else{
                if(input3 != 0){
                    input2 = nilaikuadrat;
                    input3 = 0;
                }
                inputText.setText((int)(input1 / input2) + "");
            }
            isBagi = false;
        } else if (isKuadrat){
            if (!checker){
                if (isKoma){
                    inputText.setText(nilaikuadrat + "");
                } else{
                    inputText.setText((int)nilaikuadrat + "");
                }
            }
        }
        checker = true;
        nilaikuadrat = 0;
    }

    protected void kuadrat(){
        if (input3 == 0){
            if (isKoma){
                nilaikuadrat = Math.pow(input1, 2);
            } else{
                nilaikuadrat = (int)Math.pow(input1, 2);
            }
        } else{
            if (isKoma){
                nilaikuadrat = Math.pow(input3, 2);
            } else{
                nilaikuadrat = (int)Math.pow(input3, 2);
            }
        }
    }
}