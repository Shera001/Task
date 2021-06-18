package com.example.task.home.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.home.CustomOnClickListener
import com.example.task.home.Model
import com.example.task.home.holders.CategoryHolder

class CategoryAdapter(
    private val list: List<Model>,
    private val  listener: CustomOnClickListener
    ): RecyclerView.Adapter<CategoryHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryHolder(view, listener)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}