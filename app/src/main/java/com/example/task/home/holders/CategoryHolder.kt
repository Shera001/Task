package com.example.task.home.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.home.CustomOnClickListener
import com.example.task.home.Model

class CategoryHolder(
    itemView: View,
    private val listener: CustomOnClickListener
) : RecyclerView.ViewHolder(itemView) {

    private val imageIv = itemView.findViewById<ImageView>(R.id.category_image)
    private val nameTv = itemView.findViewById<TextView>(R.id.category_name)

    private var b = 0

    init {
        itemView.setOnClickListener {
            b = adapterPosition
            itemView.setBackgroundColor(itemView.context.resources.getColor(R.color.white))
            listener.setCustomOnClickListener(adapterPosition)
        }
    }

    fun onBind(e: Model) {

        itemView.setBackgroundColor(itemView.context.resources.getColor(R.color.color1))

        imageIv.setImageResource(e.image)
        nameTv.text = e.name
    }
}