package com.as1k.expandablerecyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.as1k.expandablerecyclerview.adapter.ExpandableRecyclerAdapter
import com.as1k.expandablerecyclerview.model.ParentListItem
import com.as1k.expandablerecyclerviewexample.R
import com.as1k.expandablerecyclerviewexample.model.Category
import com.as1k.expandablerecyclerviewexample.model.CategoryList
import com.as1k.expandablerecyclerviewexample.viewholder.CategoryListViewHolder
import com.as1k.expandablerecyclerviewexample.viewholder.CategoryViewHolder

class CategoryAdapter : ExpandableRecyclerAdapter<CategoryViewHolder, CategoryListViewHolder>(){

    override fun onCreateParentViewHolder(parentViewGroup: ViewGroup
    ): CategoryViewHolder {
        val view = LayoutInflater.from(parentViewGroup.context).inflate(R.layout.item_category, parentViewGroup, false)
        return CategoryViewHolder(view)
    }

    override fun onCreateChildViewHolder(parentViewGroup: ViewGroup): CategoryListViewHolder {
        val view = LayoutInflater.from(parentViewGroup.context).inflate(R.layout.item_category_list, parentViewGroup, false)
        return CategoryListViewHolder(view)
    }

    override fun onBindParentViewHolder(parentViewHolder: CategoryViewHolder, position: Int, parentListItem: ParentListItem) {
        val data = parentListItem as Category
        parentViewHolder.bind(data)
    }

    override fun onBindChildViewHolder(childViewHolder: CategoryListViewHolder, position: Int, childListItem: Any) {
        val data = childListItem as CategoryList
        childViewHolder.bind(data)
    }
}