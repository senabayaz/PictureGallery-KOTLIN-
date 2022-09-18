package com.example.picturegallerykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.picturegallerykotlin.Adapter.RecyclerAdapter
import com.example.picturegallerykotlin.Model.MarkModel
import com.example.picturegallerykotlin.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity() {
    private lateinit var markList : ArrayList<MarkModel>
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var pic1 = MarkModel(
            "Johannes Verneer",
            "Girl With a Pearl Earring",
            R.drawable.incikupelikiz_johannes_wermeer
        )
        var pic2 = MarkModel(
            "Sandro Botticelli",
            "The Birth Of Venus",
            R.drawable.incikupelikiz_johannes_wermeer
        )
        var pic3 =
            MarkModel("Leonardo Da Vinci", "Mona Lisa", R.drawable.incikupelikiz_johannes_wermeer)

        markList = ArrayList<MarkModel>()

        markList.add(pic1)
        markList.add(pic2)
        markList.add(pic3)

        /*var adapterList = ArrayAdapter(this,android.R.layout.simple_list_item_1,markList.map { MarkModel -> MarkModel.name })
        binding.ListView.adapter = adapterList
        binding.ListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, i, l ->
            val intent = Intent(this,Marks::class.java)
            intent.putExtra("list",markList.get(i))
            startActivity(intent)
        */
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        var adapter = RecyclerAdapter(markList)
        binding.recyclerView.adapter = adapter

    }
}