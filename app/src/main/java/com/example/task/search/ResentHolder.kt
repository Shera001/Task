package com.example.task.search

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R

class ResentHolder(
    itemView: View,
    private val listener: OnDeleteClickListener
): RecyclerView.ViewHolder(itemView) {

    private val tvName = itemView.findViewById<TextView>(R.id.tv_resent)
    private val deleteImage = itemView.findViewById<ImageView>(R.id.delete_imageview)

    init {
        deleteImage.setOnClickListener {
           listener.setOnDeleteClick(adapterPosition)
        }
    }

    fun onBind(name: String) {
        tvName.text = name
    }
}