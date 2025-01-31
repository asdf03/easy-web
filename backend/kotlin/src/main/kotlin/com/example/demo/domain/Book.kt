package com.example.demo.domain

import java.time.LocalDate

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val publishedDate: LocalDate
)