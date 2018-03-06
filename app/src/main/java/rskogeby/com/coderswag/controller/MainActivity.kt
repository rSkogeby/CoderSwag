package rskogeby.com.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import rskogeby.com.coderswag.R
import rskogeby.com.coderswag.adapters.CategoryAdapter
import rskogeby.com.coderswag.model.Category
import rskogeby.com.coderswag.services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
                DataService.categories)
        categoryListView.adapter = adapter
    }
}
