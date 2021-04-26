package com.as1k.expandablerecyclerviewexample.model

import com.as1k.expandablerecyclerview.model.ParentListItem

data class Category(val name:String,val movieList:List<CategoryList>) : ParentListItem {
    override fun getChildItemList(): List<*> = movieList
    override fun isInitiallyExpanded(): Boolean = false
}