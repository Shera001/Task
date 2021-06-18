package com.example.task.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.home.adapters.CategoryAdapter
import com.example.task.home.adapters.PopularAdapter
import com.example.task.home.adapters.ProductAdapter

class ProductFragment : Fragment(), CustomOnClickListener {

    private lateinit var adapter: CategoryAdapter

    private var positionItem = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_product, container, false)

        val rvPopular = view.findViewById<RecyclerView>(R.id.recycler_popular)
        val rvCategory = view.findViewById<RecyclerView>(R.id.category_recycler)
        val rvProduct = view.findViewById<RecyclerView>(R.id.recycler_product)

        rvPopular.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        rvPopular.adapter = PopularAdapter(getList())

        adapter = CategoryAdapter(getCategoryList(), this)

        rvCategory.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        rvCategory.adapter = adapter

        rvProduct.layoutManager = GridLayoutManager(context, 2, RecyclerView.VERTICAL, false)
        rvProduct.adapter = ProductAdapter(getProductsList())

        return view
    }

    private fun getList(): List<Model> {
        val list: ArrayList<Model> = ArrayList()

        var e = Model(R.mipmap.speakers, "Speaker")
        list.add(e)

        e = Model(R.mipmap.micro, "Headphone")
        list.add(e)

        e = Model(R.mipmap.speakers, "Speaker")
        list.add(e)

        e = Model(R.mipmap.micro, "Headphone")
        list.add(e)

        e = Model(R.mipmap.speakers, "Speaker")
        list.add(e)

        e = Model(R.mipmap.micro, "Headphone")
        list.add(e)

        return list
    }

    private fun getCategoryList(): List<Model> {
        val list: ArrayList<Model> = ArrayList()

        var e = Model(R.drawable.phone, "Phones")
        list.add(e)

        e = Model(R.drawable.keyboard, "Keyboards")
        list.add(e)

        e = Model(R.drawable.mouse, "Mouse")
        list.add(e)

        e = Model(R.drawable.headphones, "Headphones")
        list.add(e)

        e = Model(R.drawable.charger, "Chargers")
        list.add(e)

        e = Model(R.drawable.comp, "Computers")
        list.add(e)

        return list
    }

    private fun getProductsList(): List<Model> {
        val list: ArrayList<Model> = ArrayList()

        var e = Model(R.mipmap.speakers, "Speaker")
        list.add(e)

        e = Model(R.mipmap.micro, "Headphone")
        list.add(e)

        e = Model(R.mipmap.micro, "Headphone")
        list.add(e)

        e = Model(R.mipmap.speakers, "Speaker")
        list.add(e)

        e = Model(R.mipmap.speakers, "Speaker")
        list.add(e)

        e = Model(R.mipmap.micro, "Headphone")
        list.add(e)

        e = Model(R.mipmap.speakers, "Speaker")
        list.add(e)

        return list
    }

    override fun setCustomOnClickListener(position: Int) {
        adapter.notifyItemChanged(positionItem)
        positionItem = position
    }
}