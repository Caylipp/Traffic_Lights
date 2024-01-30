package com.hoang.msu.traffic_lights

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hoang.msu.traffic_lights.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
private var isGo : Boolean = true
private var isStop : Boolean = false

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(){
            if(isStop){
                binding.redImage.visibility = View.VISIBLE
                binding.yellowImage.visibility = View.INVISIBLE
                isStop = false
                isGo = true

            } else if (isGo){
                binding.redImage.visibility = View.INVISIBLE
                binding.greenImage.visibility = View.VISIBLE
                binding.button.setText("GO!")

                isGo = false
            } else {
                binding.yellowImage.visibility = View.VISIBLE
                binding.greenImage.visibility = View.INVISIBLE
                isStop = true
            }


        }
    }

}