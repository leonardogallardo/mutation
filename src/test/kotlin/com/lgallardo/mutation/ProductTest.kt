package com.lgallardo.mutation

import org.junit.Assert
import org.junit.Test

class ProductTest {

    @Test
    fun `should return price with no discount`() {
        val product = Product()
        val amount = 2
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 46)
    }

    @Test
    fun `should return price with discount by amount`() {
        val product = Product()
        val amount = 100
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 1700)
    }

    @Test
    fun `should return price with discount by coupon`() {
        val product = Product()
        val amount = 5
        val price = product.getPrice(amount, true)
        Assert.assertEquals(price, 85)
    }

    @Test
    fun `should return price with discount by amount = 10`() {
        val product = Product()
        val amount = 10
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 170)
    }

}