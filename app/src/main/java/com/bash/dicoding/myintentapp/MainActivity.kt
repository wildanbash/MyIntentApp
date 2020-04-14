package com.bash.dicoding.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveWithData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithData.setOnClickListener(this)
        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when (v.id){
            R.id.btn_move_activity_data-> {
                val moveDataIntent = Intent(this@MainActivity, MoveDataActivity::class.java)
                moveDataIntent.putExtra(MoveDataActivity.EXTRA_NAME, "Wildan Dawam Bash")
                moveDataIntent.putExtra(MoveDataActivity.EXTRA_AGE, 5)
                startActivity(moveDataIntent)
            }
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "089697574547"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}
