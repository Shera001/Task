package com.example.task.home.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.home.Model

class ProductHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val productImage = itemView.findViewById<ImageView>(R.id.product_item_image)
    private val productName = itemView.findViewById<TextView>(R.id.product_item_name)
    private val productPrice = itemView.findViewById<TextView>(R.id.product_item_price)

    fun onBind(e: Model) {
        productImage.setImageResource(e.image)
        productName.text = e.name
        productPrice.text = "100$"
    }
}