package com.junarcho.fruit_pedia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.junarcho.buah_pedia.R
import com.junarcho.fruit_pedia.entity.Fruits

class CardFruitAdapter(private val listFruit: ArrayList<Fruits>) :
    RecyclerView.Adapter<CardFruitAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card_fruit, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val fruits = listFruit[position]
        val fruitName = listFruit[holder.absoluteAdapterPosition].name

        Glide.with(holder.itemView.context)
            .load(fruits.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = fruits.name
        holder.tvDetails.text = fruits.details

        holder.btnFavorite.setOnClickListener { callToast(holder, "$fruitName Set Favorite ") }
        holder.btnShare.setOnClickListener { callToast(holder, "$fruitName Shared ") }
        holder.imgPhoto.setOnClickListener { callToast(holder, "You Choose $fruitName ") }
    }

    override fun getItemCount(): Int {
        return listFruit.size
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Initialize The View In The Layout Item
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetails: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }

    private fun callToast(holder: CardViewHolder, text: String) {

        Toast.makeText(holder.itemView.context, text, Toast.LENGTH_SHORT).show()
    }
}