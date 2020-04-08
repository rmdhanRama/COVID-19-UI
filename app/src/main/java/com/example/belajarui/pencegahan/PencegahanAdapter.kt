package com.example.belajarui.pencegahan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarui.R
import com.example.belajarui.model.PencegahanModel
import kotlinx.android.synthetic.main.pencegahan_main.view.*

class PencegahanAdapter (private val mData: List<PencegahanModel>): RecyclerView.Adapter<PencegahanAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pencegahan_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int  = mData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(mData[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(data: PencegahanModel){
            itemView.image.setImageResource(data.img)
            itemView.tv_title.text = data.title
            itemView.tv_desc.text = data.desc
        }
    }

}