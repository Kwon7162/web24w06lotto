package kr.ac.kumoh.s20210084.web24w06lotto.repository

import kr.ac.kumoh.s20210084.web24w06lotto.model.LottoNumber
import org.springframework.stereotype.Repository

@Repository
class InMemoryLottoRepository : LottoRepository {
    private var storedLottoNumber: LottoNumber? = null

    override fun save(lottoNumber: LottoNumber): LottoNumber {
        storedLottoNumber = lottoNumber

        return storedLottoNumber!!
    }

    override fun find(): LottoNumber? {
        return storedLottoNumber
    }
}