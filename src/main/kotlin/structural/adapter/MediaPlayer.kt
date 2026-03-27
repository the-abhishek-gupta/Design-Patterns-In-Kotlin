package org.example.structural.adapter

interface MediaPlayer {
    fun play(audioType : AudioType, filename : String)
}