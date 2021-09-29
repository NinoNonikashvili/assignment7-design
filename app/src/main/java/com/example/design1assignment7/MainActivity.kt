package com.example.design1assignment7

import android.os.Bundle
import android.text.InputType
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.design1assignment7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var partiallyColoredText = SpannableStringBuilder(getString(R.string.sharemac))

        partiallyColoredText.setSpan(ForegroundColorSpan(getResources().getColor(R.color.red_text)), 5, 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.text3.text = partiallyColoredText
        binding.crossedEye.setOnClickListener{ toggleCrossedEye()}
        binding.eye.setOnClickListener{ toggleEye()}
    }
    fun toggleCrossedEye(){
        binding.eye.visibility = View.VISIBLE
        binding.crossedEye.visibility = View.GONE
        binding.password.transformationMethod = HideReturnsTransformationMethod.getInstance()

    }
    fun toggleEye(){
        binding.eye.visibility = View.GONE
        binding.crossedEye.visibility = View.VISIBLE
        binding.password.transformationMethod = PasswordTransformationMethod.getInstance()



    }

}