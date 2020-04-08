package com.example.belajarui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarui.R
import com.example.belajarui.model.DashboardModel
import kotlinx.android.synthetic.main.dahboard_main.view.*

class DashboardAdapter(private val mData: List<DashboardModel>): RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dahboard_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mData[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(listData: DashboardModel){
            itemView.tv_title.text = listData.title
            itemView.ln_dahboard.background = ContextCompat.getDrawable(itemView.context, listData.lineBg)
            itemView.tv_ket.text = listData.ket
            itemView.tv_ket.setTextColor(ContextCompat.getColorStateList(itemView.context, listData.ketColor))
        }
    }


}