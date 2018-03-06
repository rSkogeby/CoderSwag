package rskogeby.com.coderswag.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import rskogeby.com.coderswag.R
import rskogeby.com.coderswag.adapters.CategoryRecycleAdapter
import rskogeby.com.coderswag.services.DataService
import rskogeby.com.coderswag.utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories) {category ->
            val productsActivity = Intent(this,ProductsActivity::class.java)
            productsActivity.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productsActivity)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        // On click listener creation using a Lambda

    }
}
