package haxidenti.duck

import haxidenti.duckLib.Duck

inline fun <reified T> Any.quack(): T {
    return Duck.quack(T::class.java, this)
}