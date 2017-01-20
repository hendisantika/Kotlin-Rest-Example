package com.hendisantika.kotlin.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by hendisantika on 19/01/17.
 */

@RestController
class TestController {
    @RequestMapping("/")
    fun getResponse() = ResponseDTO(true, "Testing heula yeuhh ahh ....!")


    private val INVALID_PARAM = "Invalid Parameter"

    @RequestMapping("/bulan")
    fun mapBulan(@RequestParam bln: Int): ResponseDTO{
        var strBulan = when (bln){
            1 -> "Januari"
            2 -> "Februari"
            3 -> "Maret"
            4 -> "April"
            5 -> "Mei"
            6 -> "Juni"
            7 -> "Juli"
            8 -> "Agustus"
            9 -> "September"
            10 -> "Oktober"
            11 -> "November"
            12 -> "Desember"
            else -> INVALID_PARAM
        }

        if (INVALID_PARAM == strBulan){
            return ResponseDTO(false, INVALID_PARAM)
        }else{
            return ResponseDTO(true, "Converted Month is $strBulan")
        }
    }
}