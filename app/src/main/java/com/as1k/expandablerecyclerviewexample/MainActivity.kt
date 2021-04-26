package com.as1k.expandablerecyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.as1k.expandablerecyclerview.listener.ExpandCollapseListener
import com.as1k.expandablerecyclerviewexample.adapter.CategoryAdapter
import com.as1k.expandablerecyclerviewexample.model.Category
import com.as1k.expandablerecyclerviewexample.model.CategoryList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = CategoryAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = listOf(
            Category("Action", listOf(
                CategoryList("My Spy"),
                CategoryList("BloodShot"),
                CategoryList("Midway")
            )),
            Category("Drama", listOf(CategoryList("The Godfather"), CategoryList("The Dark Knight"))),
            Category("War", listOf(
                CategoryList("Apocalypse Now"),
                CategoryList("Saving Private Ryan")
            ))
        )


        categoryListRv.setHasFixedSize(true)
        categoryListRv.layoutManager = LinearLayoutManager(this)
        adapter.setExpandCollapseListener(object : ExpandCollapseListener {
            override fun onListItemExpanded(position: Int) {
            }

            override fun onListItemCollapsed(position: Int) {

            }

        })
        categoryListRv.adapter = adapter
        adapter.setExpandableParentItemList(data)
    }
}
