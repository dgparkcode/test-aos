package com.dgparkcode.testing.junit.simple

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        // 테스트를 진행하기 전에 계산기 객체를 먼저 생성한다.
        calculator = Calculator()
    }

    @Test
    fun sum_of_two_numbers() {
        val number1 = 1
        val number2 = 2
        val sumVal = number1 + number2
        val rtnVal = calculator.sum(number1, number2)

        // number1, number2를 더한 값과 계산기의 계산 결과가 같으면 성공한다.
        assertEquals(sumVal, rtnVal)
    }
}