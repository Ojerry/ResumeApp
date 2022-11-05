package com.ojinc.resumeapp.cv

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ojinc.resumeapp.R
import org.w3c.dom.Text

class CVAdapter(private val mdata: ArrayList<CVItem>) : RecyclerView.Adapter<CVAdapter.CVViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CVViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_cv,
            parent, false)
        return CVViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CVViewHolder, position: Int) {
        val currentItem = mdata[position]
        holder.tvTitle.text = currentItem.title
        holder.tvDescription.text = currentItem.description
    }

    override fun getItemCount(): Int {
        return mdata.size
    }


    class CVViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvTitle: TextView = itemView.findViewById(R.id.item_cv_title)
        val tvDescription: TextView = itemView.findViewById(R.id.item_cv_desc)

    }
}