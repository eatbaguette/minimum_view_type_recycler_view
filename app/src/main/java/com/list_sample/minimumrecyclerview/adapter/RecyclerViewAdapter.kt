package com.list_sample.minimumrecyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.list_sample.minimumrecyclerview.R
import com.list_sample.minimumrecyclerview.model.Items

/**
 * Created by monkey on 2017/09/26.
 */
class RecyclerViewAdapter(private val itemList: List<Items>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    // ViewHolder
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var cellText: TextView = view.findViewById<TextView>(R.id.recycler_view_cell_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder{
        val itemView = LayoutInflater.from(parent?.context)
                .inflate(R.layout.recycler_view_cell, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val item = itemList[position]
        holder?.cellText?.text = item.cellText
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}