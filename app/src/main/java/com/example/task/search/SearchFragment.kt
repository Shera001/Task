package com.example.task.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R

class SearchFragment : Fragment(), OnDeleteClickListener {

    private var list: ArrayList<String> = ArrayList()
    private lateinit var adapter: ResentAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        adapter = ResentAdapter(this)

        val rvSearch = view.findViewById<RecyclerView>(R.id.search_recycler)
        rvSearch.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        rvSearch.adapter =adapter

        getResentList()

        adapter.setList(list)

        return view
    }

    private fun getResentList() {
        list.add("Phones")
        list.add("Keyboards")
        list.add("Mouse")
        list.add("Chargers")
        list.add("Computers")
    }

    override fun setOnDeleteClick(position: Int) {
        list.removeAt(position)
        adapter.deleteItem(position)
    }
}