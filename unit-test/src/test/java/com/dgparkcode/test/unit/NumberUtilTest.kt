package com.dgparkcode.test.unit

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class NumberUtilTest {

    @Test
    fun sum() {
        val sum = 1 + 2
        val numSum = NumberUtil.sum(1, 2)

        assertThat(numSum).isEqualTo(sum)
    }
}