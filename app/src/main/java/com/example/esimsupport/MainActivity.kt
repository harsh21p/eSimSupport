package com.example.esimsupport

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.esim.esimcheck.ESimSupport

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view)
        Toast.makeText(this, ESimSupport.isESIMSupported(this).toString(),Toast.LENGTH_LONG).show();
    }
}