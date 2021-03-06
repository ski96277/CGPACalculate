package com.example.imran.cgpacalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView totalcgpa, totalcredit;
    Spinner cradenumber;
    EditText gradePointNumber;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalcgpa = (TextView) findViewById(R.id.TotalCGPA);
        totalcredit = (TextView) findViewById(R.id.TotalCredit);
        cradenumber = (Spinner) findViewById(R.id.creditNumber);
        gradePointNumber = (EditText) findViewById(R.id.GradepointNumber1);
        add = (Button) findViewById(R.id.AddButtom);
        add.setOnClickListener(new View.OnClickListener() {

            double creditnumber;
            double gradepointnumber;
            double result;
            double totalcreditsum = 0;
            double totalgradetinto = 0;
            double finalresult = 0;
            int i = 0;

            @Override
            public void onClick(View view) {
                try {
                    String a = String.valueOf(cradenumber.getSelectedItem());

                    String b = String.valueOf(gradePointNumber.getText());
                    creditnumber = Double.parseDouble(a);  //convert to double credit
                    gradepointnumber = Double.parseDouble(b);//convert to double point


                    totalcreditsum = totalcreditsum + creditnumber; //total credit sum

                    totalgradetinto = gradepointnumber * creditnumber;

                    finalresult = finalresult + totalgradetinto;
                    result = finalresult / totalcreditsum;

                    totalcgpa.setText("Total CGPA =" + String.valueOf(result));
                    totalcredit.setText("Toal Credit =" + String.valueOf(totalcreditsum));

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "pls fillup the requerement", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    //Add menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }// menu bar add complete

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
//                Intent intent = new Intent(MainActivity.this,);
                break;

            case R.id.help:

//                Intent intent2 = new Intent(MainActivity.this,);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void allcredit(View view) {
        Intent intent = new Intent(MainActivity.this, seeallcredit.class);
        startActivity(intent);
    }
}
