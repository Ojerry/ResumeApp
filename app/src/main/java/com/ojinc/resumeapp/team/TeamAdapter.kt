package com.ojinc.resumeapp.team

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ojinc.resumeapp.R

class TeamAdapter(private val mdata: ArrayList<TeamItem>) :  RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_team,
            parent, false)
        return TeamViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val currentItem = mdata[position]
        holder.tv_name.text = currentItem.name
        holder.tv_desc.text = currentItem.desc
        holder.img.setImageResource(currentItem.img)

    }

    override fun getItemCount(): Int {
        return mdata.size
    }


    class TeamViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tv_name: TextView = itemView.findViewById(R.id.team_item_name)
        val tv_desc: TextView = itemView.findViewById(R.id.team_item_desc)
        val img: ImageView = itemView.findViewById(R.id.team_item_img)

    }
}