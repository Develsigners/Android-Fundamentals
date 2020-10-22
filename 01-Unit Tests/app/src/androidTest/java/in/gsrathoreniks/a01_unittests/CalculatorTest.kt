package `in`.gsrathoreniks.a01_unittests

import androidx.test.filters.SmallTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.Matchers.closeTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


/**
 * Instrumented test, which will execute on an Android device.
 */
@RunWith(JUnit4::class)
@SmallTest
class CalculatorTest {
    private var mCalculator: Calculator? = null

    /**
     * Set up the environment for testing
     */
    @Before
    fun setUp() {
        mCalculator = Calculator()
    }

    /**
     * Test for simple addition
     */
    @Test
    fun addTwoNumbers() {
        val resultAdd = mCalculator!!.add(1.0, 1.0)
        assertThat(resultAdd, `is`(equalTo(2.0)))
    }
    /**
     * Test for simple addition of a negative number
     */
    @Test
    fun addTwoNumbersNegative() {
        val resultAdd = mCalculator!!.add(-1.0, 2.0)
        assertThat(resultAdd, `is`(equalTo(1.0)))
    }
    /**
     * Test for simple addition of floating numbers
     */
    @Test
    fun addTwoNumbersFloats() {
        val resultAdd = mCalculator!!.add(1.111, 1.111)
        assertThat(resultAdd, `is`(closeTo(2.222, 0.01)))
    }
    /**
     * Test for simple subtraction
     */
    @Test
    fun subTwoNumbers() {
        val resultSub = mCalculator!!.sub(1.0, 1.0)
        assertThat(resultSub, `is`(equalTo(0.0)))
    }
    /**
     * Test for subtraction with negative result
     */
    @Test
    fun subWorksWithNegativeResult() {
        val resultSub = mCalculator!!.sub(1.0, 17.0)
        assertThat(resultSub, `is`(equalTo(-16.0)))
    }
    /**
     * Test for simple multiplication
     */
    @Test
    fun mulTwoNumbers() {
        val resultMul = mCalculator!!.mul(32.0, 2.0)
        assertThat(resultMul, `is`(equalTo(64.0)))
    }
    /**
     * Test for simple division
     */
    @Test
    fun divTwoNumbers() {
        val resultDiv = mCalculator!!.div(32.0, 2.0)
        assertThat(resultDiv, `is`(equalTo(16.0)))
    }
    /**
     * Test for dividing number by 0
     */
    @Test
    fun divTwoNumbersZero() {
        val resultDiv = mCalculator!!.div(32.0, 0.0)
        assertThat(resultDiv, `is`(equalTo(Double.POSITIVE_INFINITY)))
    }
}