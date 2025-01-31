package com.example.demo.handler

import com.example.demo.domain.Book
import com.example.demo.repository.BookRepository
import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class BookQuery(
    private val bookRepository: BookRepository
) : Query {
    /**
     * すべての書籍を取得
     */
    fun books(): List<Book> = bookRepository.findAll()

    /**
     * 指定したIDの書籍を取得
     */
    fun bookById(id: Int): Book? = bookRepository.findById(id)
}
