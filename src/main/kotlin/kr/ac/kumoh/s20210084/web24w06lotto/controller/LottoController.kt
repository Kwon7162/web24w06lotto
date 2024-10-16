package kr.ac.kumoh.s20210084.web24w06lotto.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LottoController {
    @GetMapping("/lotto/numbers")
    fun generateNumbers(): String {
        return "lotto"
    }
}