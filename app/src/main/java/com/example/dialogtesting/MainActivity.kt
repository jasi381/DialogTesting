package com.example.dialogtesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
            dialogTest.setTitleAndBody("Title","Hello you are in the dialog inside the app")
           // dialogTest.setContentLayout(R.layout.activity_main)
            dialogTest.setCustomLayout(R.layout.demo_nba)
        }




    }
}