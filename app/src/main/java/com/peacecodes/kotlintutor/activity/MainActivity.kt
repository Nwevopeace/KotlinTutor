package com.peacecodes.kotlintutor.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.peacecodes.kotlintutor.R
import com.peacecodes.kotlintutor.adapter.RecyclerAdapter
import com.peacecodes.kotlintutor.databinding.ActivityMainBinding
import com.peacecodes.kotlintutor.databinding.HomeScreenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: HomeScreenBinding
    private lateinit var navController: NavController
    private lateinit var navigationView: NavigationView
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeScreenBinding.inflate(layoutInflater)
//        setTheme(R.style.Theme_KotlinTutor)
        setContentView(binding.root)

        navigationView = binding.navView
        drawerLayout = binding.drawerLayout

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        navController = navHostFragment.navController

        //Connecting the drawer with navigation component
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)

        //Connecting toolbar with navController
        toolbar = binding.toolBar
        toolbar.setupWithNavController(navController, appBarConfiguration)

        //connect navigationView with navController
        navigationView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragment_container)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}