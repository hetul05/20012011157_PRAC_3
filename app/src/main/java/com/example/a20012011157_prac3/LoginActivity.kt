package ru.kotlin.a20012011157_prac32
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import
ru.kotlin.a20012011157_prac32.databinding.ActivityLoginBindin
g
import
ru.kotlin.a20012011157_prac32.databinding.ActivityMainBinding
class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val signup = findViewById<TextView>(R.id.signup)
        signup.setOnClickListener {
            Intent(this, RegisterActivity::class.java).also
            {startActivity(it)}
            signup.movementMethod =
                LinkMovementMethod.getInstance();
        }
        binding.bottomNavigationView.selectedItemId =
            R.id.bottom_nav_login
        binding.bottomNavigationView.setOnItemSelectedListener { it

            ->
            when (it.itemId) {
                R.id.bottom_nav_reg -> {
                    Intent(this, RegisterActivity::class.java).also
                    { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}
