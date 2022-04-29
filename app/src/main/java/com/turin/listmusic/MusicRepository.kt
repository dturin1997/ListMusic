package com.turin.listmusic

import com.turin.listmusic.model.Music

class MusicRepository (val musics:MutableList<Music> = ArrayList()) {
    init {
        getDataMusics()
    }

    fun getDataMusics(): List<Music> {
        musics.add(Music(1, "Complicated", "Avril Lavigne", "ic_artist_1","rock"))
        musics.add(Music(2, "Girlfriend", "Avril Lavigne", "ic_artist_1","rock"))
        musics.add(Music(3, "Faded", "Alan Walker", "ic_artist_2","electronic"))
        musics.add(Music(4, "I Was Made For Lovin You", "KISS", "ic_artist_3","rock"))
        musics.add(Music(5, "Detroit Rock City", "KISS", "ic_artist_3","rock"))
        musics.add(Music(6, "Snow", "Red Hot Chili Peppers", "ic_artist_4","rock"))
        musics.add(Music(7, "Coin Laundry", "Lisa Mitchell", "ic_artist_5","folk"))
        musics.add(Music(8, "Neopolitan Dreams", "Lisa Mitchell", "ic_artist_5","folk"))
    return musics
    }
}