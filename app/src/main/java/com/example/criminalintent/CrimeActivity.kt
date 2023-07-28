package com.example.criminalintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.criminalintent.databinding.ActivityCrimeBinding

class CrimeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCrimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCrimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment == null) {
            val fragment = CrimeFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
    }
}