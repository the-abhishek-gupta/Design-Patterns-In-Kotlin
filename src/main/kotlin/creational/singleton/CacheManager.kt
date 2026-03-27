package org.example.creational.singleton

object CacheManager {
    private val cache = mutableMapOf<String, String>()
    fun get(key: String): String? {
        return cache[key]
    }

    fun put(key: String, value: String) {
        cache[key] = value
    }
}