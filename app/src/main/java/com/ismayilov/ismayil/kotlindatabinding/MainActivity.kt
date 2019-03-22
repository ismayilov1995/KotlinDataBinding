package com.ismayilov.ismayil.kotlindatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ismayilov.ismayil.kotlindatabinding.databinding.ActivityMainBinding
import com.ismayilov.ismayil.kotlindatabinding.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initFragment()


    }

    private fun initFragment() {
        val mainFragment = MainFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.mainCointainer.id,mainFragment,"mainFragment")
        transaction.commit()
    }
}
