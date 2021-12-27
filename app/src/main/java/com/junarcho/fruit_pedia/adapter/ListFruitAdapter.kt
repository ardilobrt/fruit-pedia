package com.junarcho.fruit_pedia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.junarcho.buah_pedia.R
import com.junarcho.fruit_pedia.entity.Fruits

class ListFruitAdapter(private val listFruit: ArrayList<Fruits>) :
    RecyclerView.Adapter<ListFruitAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Initialize The View In The Layout Item
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvEnglishName: TextView = itemView.findViewById(R.id.tv_english_name)
        var tvDetails: TextView = itemView.findViewById(R.id.tv_item_detail)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_fruit, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        // SetImage
        val fruits = listFruit[position]
        Glide.with(holder.itemView.context)
            .load(fruits.photo)
            .into(holder.imgPhoto)

        //Set TextView
        holder.tvName.text = fruits.name
        holder.tvEnglishName.text = fruits.englishName
        holder.tvDetails.text = fruits.details

        //Set Onclick Listener in List
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(
                listFruit[holder.bindingAdapterPosition]
            )
        }
    }

    override fun getItemCount(): Int {
        return listFruit.size
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