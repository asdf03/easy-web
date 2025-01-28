package com.example.demo.handler

import com.example.demo.domain.Hoge
import com.example.demo.usecase.GetHogeUseCase
import org.springframework.stereotype.Component

@Component
class QueryHandler (
    private val getHogeUseCase: GetHogeUseCase
) {
    fun hoge(): String {
//        return getHogeUseCase.execute().message
        println("ハンドラー")
        return Hoge("こんにちは！ 疎通を確認したよ！").message
    }
}
