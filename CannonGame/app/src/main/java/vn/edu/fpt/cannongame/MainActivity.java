package vn.edu.fpt.cannongame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity
{
    // called when the app first launches
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState); // call super's onCreate method
        setContentView(R.layout.activity_main); // inflate the layout
    }
} // end class MainActivity