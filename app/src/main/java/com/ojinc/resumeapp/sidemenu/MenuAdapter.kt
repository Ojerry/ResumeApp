package com.ojinc.resumeapp.sidemenu

import com.ojinc.resumeapp.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class MenuAdapter(val mData: ArrayList<MenuItem>, var listener: Callback) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
//    private lateinit var listener: Callback



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val currentItem = mData[position]
        holder.icon.setImageResource(currentItem.icon)
        if (mData[position].isSelected) {
            holder.isSelected.visibility = View.VISIBLE
        } else holder.isSelected.visibility = View.GONE
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.item_menu_icon)
        val isSelected: ImageView = itemView.findViewById(R.id.item_menu_selected)

//        icon =
//        isSelected =

        init {
//             menu item click listener
            itemView.setOnClickListener {
                listener.onSideMenuItemClick(adapterPosition)
            }
        }
    }


//    init {
//        this.listener = listener
//    }
}