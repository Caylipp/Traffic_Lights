package com.hoang.msu.traffic_lights

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
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
                binding.button.setText(R.string.red)
                binding.button.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                isStop = false
                isGo = true

            } else if (isGo){
                binding.redImage.visibility = View.INVISIBLE
                binding.greenImage.visibility = View.VISIBLE
                binding.button.setText(R.string.green)
                binding.button.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                isGo = false
            } else {
                binding.yellowImage.visibility = View.VISIBLE
                binding.greenImage.visibility = View.INVISIBLE
                binding.button.setText(R.string.yellow)
                binding.button.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow))
                isStop = true
            }


        }
    }

}