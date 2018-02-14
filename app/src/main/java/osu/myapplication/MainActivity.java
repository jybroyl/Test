package osu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickPickButton(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, PickActivity.class);

        MainActivity.this.startActivityForResult(myIntent, 1);
    }



    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
               // String result=data.getStringExtra("result");

                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                //if (result == "A" )
                    helloTextView.setText("A");
                //if (result == "B" )
                  //  helloTextView.setText("B");
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);

                helloTextView.setText("B");
            }
        }





    }//onActivityResult


}
