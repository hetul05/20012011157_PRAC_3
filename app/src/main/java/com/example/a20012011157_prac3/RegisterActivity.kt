package ru.kotlin.a20012011157_prac32
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import
ru.kotlin.a20012011157_prac32.databinding.ActivityMainBinding
import
ru.kotlin.a20012011157_prac32.databinding.ActivityRegisterBin
ding
class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val login = findViewById<TextView>(R.id.logins)
        login.setOnClickListener {

            Intent(this, LoginActivity::class.java).also
            {startActivity(it)}
            login.movementMethod = LinkMovementMethod.getInstance();
        }
        binding.bottomNavigationView.selectedItemId =
            R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener { it
            ->
            when (it.itemId) {
                R.id.bottom_nav_login -> {
                    Intent(this, LoginActivity::class.java).also {
                        startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}