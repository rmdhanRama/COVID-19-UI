package com.example.belajarui.berita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarui.R
import com.example.belajarui.model.BeritaModel
import kotlinx.android.synthetic.main.berita_main.view.*


class BeritaAdapter(private val mData: List<BeritaModel>) :
    RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.berita_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mData[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: BeritaModel) {
            itemView.image_berita.setImageResource(data.img)
            itemView.tv_title_berita.text = data.title
            itemView.tv_desc_berita.text = data.desc
        }
    }

}