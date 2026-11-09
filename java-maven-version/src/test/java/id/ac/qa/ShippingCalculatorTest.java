package id.ac.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShippingCalculatorTest {
    @Test
    void test001SubtotalNegative() {
        new ShippingCalculator();
        assertEquals("INVALID_ORDER", ShippingCalculator.calculateShipping(-1, 10, true));
    }

    @Test
    void test002SubtotalZero() {
        assertEquals("INVALID_ORDER", ShippingCalculator.calculateShipping(0, 10, true));
    }

    @Test
    void test003MemberShipping() {
        assertEquals(10000, ShippingCalculator.calculateShipping(1, 10, true));
    }

    @Test
    void test004DistanceBoundary20() {
        assertEquals(20000, ShippingCalculator.calculateShipping(100000, 20, false));
    }

    @Test
    void test005OutOfCoverage() {
        assertEquals("OUT_OF_COVERAGE", ShippingCalculator.calculateShipping(100000, 21, true));
    }

    @Test
    void test006DistanceBelow20() {
        assertEquals(20000, ShippingCalculator.calculateShipping(100000, 19, false));
    }

    @Test
    void test007SubtotalBelowFreeShipping() {
        assertEquals(10000, ShippingCalculator.calculateShipping(499999, 10, true));
    }

    @Test
    void test008SubtotalBoundaryFreeShipping() {
        assertEquals(0, ShippingCalculator.calculateShipping(500000, 10, true));
    }

    @Test
    void test009SubtotalAboveFreeShipping() {
        assertEquals(0, ShippingCalculator.calculateShipping(500001, 10, false));
    }

    @Test
    void test010MemberFee() {
        assertEquals(10000, ShippingCalculator.calculateShipping(100000, 10, true));
    }

    @Test
    void test011NonMemberFee() {
        assertEquals(20000, ShippingCalculator.calculateShipping(100000, 10, false));
    }

    @Test
    void test012InvalidOrderPriority() {
        assertEquals("INVALID_ORDER", ShippingCalculator.calculateShipping(0, 21, true));
    }

    @Test
    void test013BranchFalseNonMember() {
        assertEquals(20000, ShippingCalculator.calculateShipping(100000, 10, false));
    }
}
