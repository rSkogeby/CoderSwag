package rskogeby.com.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.category_list_item.view.*
import rskogeby.com.coderswag.R
import rskogeby.com.coderswag.model.Category

/**
 * Created by richa on 2018-03-06.
 */

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        // Inflate view for the very first time if there isn't view available to reuse
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.category_list_item, parent, false)
        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit): RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category,context: Context) {
            val resourceId = context.resources.getIdentifier(category.image,
                    "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
            itemView.setOnClickListener { itemClick(category)}

        }
    }
}