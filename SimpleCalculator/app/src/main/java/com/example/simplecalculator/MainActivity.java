package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;
public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive;
    Button btnSix, btnSeven, btnEight, btnNine;
    Button btnAdd, btnSub, btnMul, btnDiv, btnDot, btnEqual, btnClear;
    EditText etResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        etResult = (EditText)findViewById(R.id.etResult);
        etResult.setText("");
        btnZero = (Button)findViewById(R.id.btnZero);
        btnZero.setOnClickListener(this);
        btnOne = (Button)findViewById(R.id.btnOne);
        btnOne.setOnClickListener(this);
        btnTwo = (Button)findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(this);
        btnThree = (Button)findViewById(R.id.btnThree);
        btnThree.setOnClickListener(this);
        btnFour = (Button)findViewById(R.id.btnFour);
        btnFour.setOnClickListener(this);
        btnFive = (Button)findViewById(R.id.btnFive);
        btnFive.setOnClickListener(this);
        btnSix = (Button)findViewById(R.id.btnSix);
        btnSix.setOnClickListener(this);
        btnSeven = (Button)findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(this);
        btnEight = (Button)findViewById(R.id.btnEight);
        btnEight.setOnClickListener(this);
        btnNine = (Button)findViewById(R.id.btnNine);
        btnNine.setOnClickListener(this);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnSub.setOnClickListener(this);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnMul.setOnClickListener(this);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);
        btnDot = (Button)findViewById(R.id.btnDot);
        btnDot.setOnClickListener(this);
        btnEqual = (Button)findViewById(R.id.btnEqual);
        btnEqual.setOnClickListener(this);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        // take actions for buttons 0-9 and .
        if ( v.equals(btnZero))
            etResult.append("0");
        if ( v.equals(btnOne))
            etResult.append("1");
        if ( v.equals(btnTwo))
            etResult.append("2");
        if ( v.equals(btnThree))
            etResult.append("3");
        if ( v.equals(btnFour))
            etResult.append("4");
        if ( v.equals(btnFive))
            etResult.append("5");
        if ( v.equals(btnSix))
            etResult.append("6");
        if ( v.equals(btnSeven))
            etResult.append("7");
        if ( v.equals(btnEight))
            etResult.append("8");
        if ( v.equals(btnNine))
            etResult.append("9");
        if ( v.equals(btnDot))
            etResult.append(".");
        // handle the operations +, -, *, /
        if ( v.equals(btnAdd))
            etResult.append("+");
        if ( v.equals(btnSub))
            etResult.append("-");
        if ( v.equals(btnMul))
            etResult.append("*");
        if ( v.equals(btnDiv))
            etResult.append("/");
        // clear the display when cancel button is clicked
        if ( v.equals(btnClear))
            etResult.setText("");
        // handle equals
        if ( v.equals(btnEqual))
        {
            try {
                String data = etResult.getText().toString();
                // handle division
                if (data.contains("/")) {
                    String[] operands = data.split("/");
                    if(operands.length==2) {
                        double operand1 =
                                Double.parseDouble(operands[0]);
                        double operand2 =
                                Double.parseDouble(operands[1]);
                        double result = operand1 / operand2;
                        etResult.setText(String.valueOf(result));
                    }
                    else
                    {
                        Toast.makeText(getBaseContext(),"Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                }
                // handle multiplication
                if (data.contains("*")) {
                    String[] operands =
                            data.split(Pattern.quote("*"));
                    if(operands.length==2) {
                        double operand1 =
                                Double.parseDouble(operands[0]);
                        double operand2 =
                                Double.parseDouble(operands[1]);
                        double result = operand1 * operand2;
                        etResult.setText(String.valueOf(result));
                    }
                    else
                    {
                        Toast.makeText(getBaseContext(),"Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                }
                // handle addition
                if (data.contains("+")) {
                    String[] operands =
                            data.split(Pattern.quote("+"));
                    if(operands.length==2) {
                        double operand1 =
                                Double.parseDouble(operands[0]);
                        double operand2 =
                                Double.parseDouble(operands[1]);
                        double result = operand1 + operand2;
                        etResult.setText(String.valueOf(result));
                    }
                    else
                    {
                        Toast.makeText(getBaseContext(),"Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                }
                // handle subtraction
                if (data.contains("-")) {
                    String[] operands = data.split("-");
                    if(operands.length==2) {
                        double operand1 =
                                Double.parseDouble(operands[0]);
                        double operand2 =
                                Double.parseDouble(operands[1]);
                        double result = operand1 - operand2;
                        etResult.setText(String.valueOf(result));
                    }
                    else
                    {
                        Toast.makeText(getBaseContext(),"Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
            catch(Exception e)
            {
                Toast.makeText(getBaseContext(),"Invalid Input",
                        Toast.LENGTH_LONG).show();
            }
        }
    }
}
