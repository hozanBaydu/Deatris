package com.hozanbaydu.deatris.adapter


import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.hozanbaydu.deatris.model.Images
import com.hozanbaydu.deatris.databinding.RecyclerRowBinding

class Adapter (val imageList:ArrayList<Images>): RecyclerView.Adapter<Adapter.FoodsHolder>() {



    class FoodsHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodsHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodsHolder(binding)

    }
    override fun onBindViewHolder(holder: FoodsHolder, position: Int) {
         holder.binding.imageView.setImageResource(imageList.get(position).image)

    }
    override fun getItemCount(): Int {
        return imageList.size
    }





}