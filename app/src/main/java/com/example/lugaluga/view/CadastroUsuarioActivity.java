package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.example.lugaluga.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastroUsuarioActivity extends AppCompatActivity {

    private Spinner spinnerUf;

    private TextInputLayout inputEmail;

    private TextInputLayout inputCpf;

    private TextInputLayout inputCEP;

    private TextInputLayout inputDataNasc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle("Cadastro");
        setSupportActionBar(myToolbar);

        inputCpf = findViewById(R.id.input_cpf);

        inputCpf.getEditText().addTextChangedListener(new TextWatcher() {
            private static final String maskCPF = "###.###.###-##";
            boolean isUpdating;
            String old = "";

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = s.toString().replaceAll("[^0-9]*","");
                String mask = maskCPF;

                String mascara = "";
                if(isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : mask.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        mascara += m;
                        continue;
                    }


                    try {
                        mascara += str.charAt(i);
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                inputCpf.getEditText().setText(mascara);
                inputCpf.getEditText().setSelection(mascara.length());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        spinnerUf = (Spinner) findViewById(R.id.spinner_uf);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.uf_cadastro,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUf.setAdapter(adapter);

        inputEmail = findViewById(R.id.input_email);

        inputEmail.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Pattern pattern;
                Matcher matcher;
                String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                pattern = Pattern.compile(EMAIL_PATTERN);
                CharSequence cs = (CharSequence) s;
                matcher = pattern.matcher(cs);
                if (!(matcher.matches() == true)) {
                    inputEmail.setError("Invalid email");
                } else {
                    inputEmail.setError("");
                }

            }
        });

        inputCEP = findViewById(R.id.input_cep);

        inputCEP.getEditText().addTextChangedListener(new TextWatcher() {
            private static final String maskCEP = "#####-###";
            boolean isUpdating;
            String old = "";

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = s.toString().replaceAll("[^0-9]*","");
                String mask = maskCEP;

                String mascara = "";
                if(isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : mask.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        mascara += m;
                        continue;
                    }


                    try {
                        mascara += str.charAt(i);
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                inputCEP.getEditText().setText(mascara);
                inputCEP.getEditText().setSelection(mascara.length());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        inputDataNasc = findViewById(R.id.input_data);

        inputDataNasc.getEditText().addTextChangedListener(new TextWatcher() {
            private static final String maskDATANASC = "##/##/####";
            boolean isUpdating;
            String old = "";

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = s.toString().replaceAll("[^0-9]*","");
                String mask = maskDATANASC;

                String mascara = "";
                if(isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : mask.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        mascara += m;
                        continue;
                    }


                    try {
                        mascara += str.charAt(i);
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                inputDataNasc.getEditText().setText(mascara);
                inputDataNasc.getEditText().setSelection(mascara.length());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}