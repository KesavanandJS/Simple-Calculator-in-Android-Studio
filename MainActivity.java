// Set the button id in the activity_main.xml and design according to the id given below
// Or change the id according to your id

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText display;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bclr,bdel,badd,bsub,bmul,bdiv,bmod,bpow,bsqr,bcube,bsqrt,bequal;
    String n1,ctext;
    int num1,num2;
    char opp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        display=(EditText) findViewById(R.id.DispEdt1);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        b3=(Button) findViewById(R.id.btn3);
        b4=(Button) findViewById(R.id.btn4);
        b5=(Button) findViewById(R.id.btn5);
        b6=(Button) findViewById(R.id.btn6);
        b7=(Button) findViewById(R.id.btn7);
        b8=(Button) findViewById(R.id.btn8);
        b9=(Button) findViewById(R.id.btn9);
        b0=(Button) findViewById(R.id.btn0);
        bclr=(Button)findViewById(R.id.btnclr);
        bdel=(Button)findViewById(R.id.btndel);
        badd=(Button) findViewById(R.id.btnadd);
        bsub=(Button) findViewById(R.id.btnsub);
        bmul=(Button) findViewById(R.id.btnmul);
        bdiv=(Button) findViewById(R.id.btndiv);
        bmod=(Button) findViewById(R.id.btnmod);
        bpow=(Button) findViewById(R.id.btnpower);
        bsqr=(Button) findViewById(R.id.btnsqr);
        bcube=(Button) findViewById(R.id.btncube);
        bsqrt=(Button) findViewById(R.id.btnroot);
        bequal=(Button) findViewById(R.id.btnequal);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"1";
                display.setText(n1);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"2";
                display.setText(n1);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"3";
                display.setText(n1);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"4";
                display.setText(n1);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"5";
                display.setText(n1);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"6";
                display.setText(n1);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"7";
                display.setText(n1);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"8";
                display.setText(n1);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"9";
                display.setText(n1);

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=display.getText().toString();
                n1= n1+"0";
                display.setText(n1);

            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(display.getText().toString());
                opp= '+';
                display.setText("");

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(display.getText().toString());
                opp= '-';
                display.setText("");

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(display.getText().toString());
                opp= '*';
                display.setText("");

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(display.getText().toString());
                opp= '/';
                display.setText("");

            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(display.getText().toString());
                opp= '%';
                display.setText("");

            }
        });
        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(display.getText().toString());
                opp = '^';
                display.setText("");
            }
        });

        bsqr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                num1 = Integer.parseInt(display.getText().toString());
                int result = num1 * num1;
                display.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                display.setText("Invalid Input");
            }
        }
        });


        bcube.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                num1 = Integer.parseInt(display.getText().toString());
                int result = num1 * num1 * num1;
                display.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                display.setText("Invalid Input");
            }
        }
    });


        bsqrt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                num1 = Integer.parseInt(display.getText().toString());
                double result = Math.sqrt(num1);
                display.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                display.setText("Invalid Input");
            }
        }
    });


        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Integer.parseInt(display.getText().toString());
                int result = 0;

                switch (opp) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                        if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Mathematical Error");
                        return;
                    }
                        break;
                case '%':
                    result = num1 % num2;
                    break;
                case '^':
                    result = (int) Math.pow(num1, num2);
                    break;
            }
            display.setText(String.valueOf(result));

            }
        });

        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctext = display.getText().toString();
                if (ctext.length() > 0) {
                    display.setText(ctext.substring(0,ctext.length() - 1));
                }
            }
        });
    }
}
