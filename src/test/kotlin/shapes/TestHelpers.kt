package shapes

import kotlin.test.assertEquals

private const val EPS = 1e-9

fun assertDouble(expected: Double, actual: Double) {
    assertEquals(expected, actual, EPS)
}
