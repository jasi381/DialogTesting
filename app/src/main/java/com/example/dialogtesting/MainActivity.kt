package com.example.dialogtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.DialogTitle
import com.example.dialogtesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var dialogTest : DialogTest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dialogTest = DialogTest(this)



        binding.btn.setOnClickListener {
            //dialogTest.setTitleAndBody("Title","Hello you are in the dialog inside the app")
            dialogTest.setContentLayout(com.example.dialogtesting.R.layout.activity_main)
        }



    }
}