package com.turin.listmusic.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.turin.listmusic.MusicRepository
import com.turin.listmusic.adapter.MusicAdapter
import com.turin.listmusic.databinding.ActivityMainBinding
import com.turin.listmusic.databinding.ItemMusicBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var contactListRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        contactListRecyclerView = binding.musicsList
        contactListRecyclerView.layoutManager = LinearLayoutManager(this)
        val musics = MusicRepository()
        val adapter = MusicAdapter(musics.musics)
        contactListRecyclerView.adapter = adapter
    }

}
