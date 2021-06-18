package com.example.task.home.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.home.Model
import com.example.task.home.holders.PopularHolder

class PopularAdapter(
    private val list: List<Model>
    ): RecyclerView.Adapter<PopularHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)
        return PopularHolder(view)
    }

    override fun onBindViewHolder(holder: PopularHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}