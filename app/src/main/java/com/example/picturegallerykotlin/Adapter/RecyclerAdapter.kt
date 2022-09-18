package com.example.picturegallerykotlin.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.picturegallerykotlin.Marks
import com.example.picturegallerykotlin.Model.MarkModel
import com.example.picturegallerykotlin.databinding.ActivityMainBinding
import com.example.picturegallerykotlin.databinding.RecyclerRowBinding

open class RecyclerAdapter(val list : ArrayList<MarkModel>) : RecyclerView.Adapter<RecyclerAdapter.recyclerHolder>() {

    class recyclerHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerHolder {
        var binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return recyclerHolder(binding)
    }

    override fun onBindViewHolder(holder: recyclerHolder, position: Int) {
        holder.binding.recylerTxt.text = list.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,Marks::class.java)
            intent.putExtra("list",list.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}