package com.example.task.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R

class ResentAdapter(
    private val listener: OnDeleteClickListener
): RecyclerView.Adapter<ResentHolder>(){

    private var list: ArrayList<String> = ArrayList()

    fun setList(list: ArrayList<String>) {
        this.list = list
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int) {
        notifyItemRemoved(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResentHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_resent_search, parent, false)
        return ResentHolder(view, listener)
    }

    override fun onBindViewHolder(holder: ResentHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}