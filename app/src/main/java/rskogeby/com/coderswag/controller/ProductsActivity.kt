package rskogeby.com.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import rskogeby.com.coderswag.R
import rskogeby.com.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

    }
}
