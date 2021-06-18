package com.example.task.home.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.home.Model

class PopularHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val imageView = itemView.findViewById<ImageView>(R.id.image_item)
    private val nameTv = itemView.findViewById<TextView>(R.id.tv_name)

    fun onBind(model: Model){
        imageView.setImageResource(model.image)
        nameTv.text = model.name
    }
}