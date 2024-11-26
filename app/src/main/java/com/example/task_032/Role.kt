package com.example.task_032

import java.io.Serializable

class Role (val name: String, val dataUrl: String): Serializable {
    companion object {
        val roles = mutableListOf(
            Role("yandex", "https://ya.ru/"),
            Role("urban", "https://urban-university.ru/"),
            Role("google", "https://www.google.ru/"),
            Role("github", "https://github.com/")
        )
    }
}