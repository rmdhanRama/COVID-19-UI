package com.example.belajarui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarui.berita.BeritaAdapter
import com.example.belajarui.dashboard.DashboardAdapter
import com.example.belajarui.model.BeritaModel
import com.example.belajarui.model.DashboardModel
import com.example.belajarui.model.PencegahanModel
import com.example.belajarui.pencegahan.PencegahanAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mData: MutableList<DashboardModel> = ArrayList()
    private var mDataPencegahan: MutableList<PencegahanModel> = ArrayList()
    private var mDataBerita: MutableList<BeritaModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Dashboard()
        Pencegahan()
        Berita()
    }

    private fun Dashboard(){
        rvDashboard.setHasFixedSize(true)
        rvDashboard.layoutManager = GridLayoutManager(this, 2)
        mData.add(DashboardModel(R.drawable.round_border_green, "50.000", "SEMBUH", R.color.colorTextGreen))
        mData.add(DashboardModel(R.drawable.round_boder_orange,"80.000", "TERKONFIRMASI", R.color.orange))
        mData.add(DashboardModel(R.drawable.round_border_red,"70.000", "MENINGGAL", R.color.red))
        mData.add(DashboardModel(R.drawable.round_border_blue, "60.000", "PERAWATAN", R.color.blue))
        rvDashboard.adapter = DashboardAdapter(mData)
    }

    private fun Pencegahan(){
        rvPencegahan.setHasFixedSize(true)
        rvPencegahan.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mDataPencegahan.add(PencegahanModel(R.drawable.icon_virus, "Apa Itu Virus Corona ?", "Virus yang dapat menyebabkan penyakit pada hewan dan manusia"))
        mDataPencegahan.add(PencegahanModel(R.drawable.icon_virus, "Apa Itu Virus Corona ?", "Virus yang dapat menyebabkan penyakit pada hewan dan manusia"))
        rvPencegahan.adapter = PencegahanAdapter(mDataPencegahan)
    }

    private fun Berita(){
        rvBerita.setHasFixedSize(true)
        rvBerita.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mDataBerita.add(BeritaModel(R.drawable.berita, "Kasus Covid-19 diIndonesia", "Jumlah ini bertambah 218 kasus dalam 24 jam terakhir."))
        mDataBerita.add(BeritaModel(R.drawable.berita, "Kasus Covid-19 diIndonesia", "Jumlah ini bertambah 218 kasus dalam 24 jam terakhir."))
        rvBerita.adapter = BeritaAdapter(mDataBerita)
    }

}
