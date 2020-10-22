package `in`.gsrathoreniks.a01_unittests

/**
 * Utility class Calculator to perform the actual calculations.
 */
class Calculator {
    // Operations
    enum class Operator {
        ADD, SUB, DIV, MUL
    }

    /**
     * Addition operation
     */
    fun add(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand + secondOperand
    }

    /**
     * Subtract operation
     */
    fun sub(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand - secondOperand
    }

    /**
     * Divide operation
     */
    fun div(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand / secondOperand
    }

    /**
     * Multiply operation
     */
    fun mul(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand * secondOperand
    }
}