package com.example.demorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter:  RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {
    private var titles = arrayOf("Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5", "Chapter 6","Chapter 7", "Chapter 8")

    private var details = arrayOf(
        "0584125605",
        "0584125605",
        "0584125605",
        "0584125605",
        "0584125605",
        "0584125605",
        "0584125605",
        "0584125605",)

    private var images = intArrayOf(
        R.drawable.avartar,
        R.drawable.avartar,
        R.drawable.avartar,
        R.drawable.avartar,
        R.drawable.avartar,
        R.drawable.avartar,
        R.drawable.avartar,
        R.drawable.avartar   ,)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
        var itemDetail: TextView = itemView.findViewById(R.id.item_detail)

        init {

            itemView.setOnClickListener {
                val position : Int = adapterPosition

                Toast.makeText(itemView.context, "Bạn đã chọn ${titles[position]}", Toast.LENGTH_LONG).show()
            }
        }
    }
}