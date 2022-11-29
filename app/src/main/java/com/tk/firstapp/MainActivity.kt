package com.tk.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tk.firstapp.databinding.ActivityMainBinding
import java.util.Date

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCurrent.setOnClickListener {
            val toast = Toast.makeText(this,
            Date().toString(), Toast.LENGTH_LONG)
            toast.show()
            binding.txtResult.text = Date().toString()
        }

        // 画面遷移
        binding.btnSecondView.setOnClickListener {
            val i = Intent(this, SecondView::class.java)
            startActivity(i)
        }
    }

    // 画面が破棄される前に変更を保存
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val txtResult = binding.txtResult
        outState.putString("txtResult", txtResult.text.toString())
    }

    // 画面が復元される前に状態を取り出し
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val txtResult = binding.txtResult
        txtResult.text = savedInstanceState.getString("txtResult")
    }

}