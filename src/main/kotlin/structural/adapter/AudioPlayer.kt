package org.example.structural.adapter

class AudioPlayer : MediaPlayer {
    override fun play(audioType: AudioType, filename: String) {
        when (audioType) {
            AudioType.MP3 -> {
                println("Playing MP3 $filename")
            }

            AudioType.MP4, AudioType.VLC -> {
                val adapter = MediaAdapter(AdvancedMediaPlayer())
                adapter.play(audioType, filename)
            }

        }
    }
}