package com.example.picturegallerykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picturegallerykotlin.Model.MarkModel
import com.example.picturegallerykotlin.databinding.ActivityMainBinding
import com.example.picturegallerykotlin.databinding.ActivityMarksBinding

open class Marks : AppCompatActivity() {
    private lateinit var binding : ActivityMarksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarksBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var intent = intent
        var serializable = intent.getSerializableExtra("list") as MarkModel

        binding.imageView.setImageResource(serializable.image)
        binding.textView.text = serializable.name
        binding.textView2.text = serializable.picName

    }
}