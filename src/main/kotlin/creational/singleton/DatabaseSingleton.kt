package org.example.creational.singleton

class DatabaseSingleton private constructor() {
    companion object {
        @Volatile
        private var INSTANCE: DatabaseSingleton? = null

        fun getInstance(): DatabaseSingleton {
            return INSTANCE ?: synchronized(this){
                INSTANCE ?: DatabaseSingleton().also { INSTANCE = it }
            }
        }
    }
}