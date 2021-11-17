package com.peacecodes.kotlintutor.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.peacecodes.kotlintutor.R
import com.peacecodes.kotlintutor.databinding.ActivityMainBinding
import com.peacecodes.kotlintutor.databinding.HomeScreenBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: HomeScreenBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeScreenBinding.inflate(layoutInflater)
//        setTheme(R.style.Theme_KotlinTutor)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        navController = navHostFragment.navController
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
    }
}