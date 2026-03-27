package org.example.creational.singleton

class SingletonMain {
    fun main(){
        Logger.log("Hello World")
        CacheManager.put("text", "Hello")
        val v = CacheManager.get("text",)
        println(v)
    }
}