package com.zoo.bamboo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zoo.bamboo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onClickMenu(view: View) {
        binding.layoutDrawerMenu.openDrawer(binding.drawer.root)
    }
}