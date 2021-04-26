package com.as1k.expandablerecyclerviewexample.viewholder

import android.view.View
import android.widget.TextView
import com.as1k.expandablerecyclerview.viewholder.ChildViewHolder
import com.as1k.expandablerecyclerviewexample.R
import com.as1k.expandablerecyclerviewexample.model.CategoryList

class CategoryListViewHolder(view:View) : ChildViewHolder(view){
    fun bind(categoryList : CategoryList){
        itemView.findViewById<TextView>(R.id.nameTv).text = categoryList.name
    }
}