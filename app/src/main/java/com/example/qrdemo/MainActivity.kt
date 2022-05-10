package com.example.qrdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.qrdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.frFragment, CameraFragment(), "rageComicList").commit()
    }


    fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().add(R.id.frFragment, fragment).commit()
    }

}