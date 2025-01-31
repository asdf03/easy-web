package com.example.demo.repository

import com.example.demo.domain.Book
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
class BookRepository {

    private val books = listOf(
        Book(1, "GraphQL Kotlin入門", "Alice", LocalDate.of(2022, 10, 1)),
        Book(2, "Spring Bootガイド", "Bob", LocalDate.of(2023, 1, 12)),
        Book(3, "Kotlin 実践", "Charlie", LocalDate.of(2021, 6, 30)),
    )

    fun findAll(): List<Book> = books

    fun findById(id: Int): Book? = books.find { it.id == id }
}
