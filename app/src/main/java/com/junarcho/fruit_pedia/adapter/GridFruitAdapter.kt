package com.junarcho.fruitpedia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.junarcho.buahpedia.R
import com.junarcho.fruitpedia.entity.Fruits

class GridFruitAdapter(private val listFruit: ArrayList<Fruits>) :
    RecyclerView.Adapter<GridFruitAdapter.GridViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GridViewHolder {

        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_grid_fruit, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {

        // SetImage
        val fruits = listFruit[position]
        Glide.with(holder.itemView.context)
            .load(fruits.photo)
            .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listFruit.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    // OnItemCallback Function
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Fruits)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
}