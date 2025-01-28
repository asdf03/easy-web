package com.example.demo.usecase

import com.example.demo.domain.Hoge
import org.springframework.stereotype.Service

@Service
class GetHogeUseCase {
    fun execute(): Hoge {
        return Hoge("Hoge")
    }
}