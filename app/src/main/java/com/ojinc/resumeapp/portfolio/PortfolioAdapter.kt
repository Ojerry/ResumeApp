package com.ojinc.resumeapp.portfolio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ojinc.resumeapp.R


class PortfolioAdapter(private val mdata: List<PortfolioItem>, var listener: PortfolioCallback) : RecyclerView.Adapter<PortfolioAdapter.PortfolioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PortfolioViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_portfolio,
            parent, false)
        return PortfolioViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PortfolioViewHolder, position: Int) {
        val currentItem = mdata[position]
        holder.tvPosition.text = currentItem.title
    }

    override fun getItemCount(): Int {
        return mdata.size
    }


    inner class PortfolioViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvPosition: TextView = itemView.findViewById(R.id.item_port_text)
        init {
            itemView.setOnClickListener {
                listener.onPortfolioItemClick(adapterPosition)
            }
        }
    }
}

