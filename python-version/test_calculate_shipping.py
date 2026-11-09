import unittest

from calculate_shipping import calculate_shipping


class TestCalculateShipping(unittest.TestCase):
    """13 test case yang sama dengan implementasi Java."""

    def test_001_subtotal_negative(self):
        self.assertEqual(calculate_shipping(-1, 10, True), "INVALID_ORDER")

    def test_002_subtotal_zero(self):
        self.assertEqual(calculate_shipping(0, 10, True), "INVALID_ORDER")

    def test_003_member_shipping(self):
        self.assertEqual(calculate_shipping(1, 10, True), 10000)

    def test_004_distance_boundary_20(self):
        self.assertEqual(calculate_shipping(100000, 20, False), 20000)

    def test_005_out_of_coverage(self):
        self.assertEqual(calculate_shipping(100000, 21, True), "OUT_OF_COVERAGE")

    def test_006_distance_below_20(self):
        self.assertEqual(calculate_shipping(100000, 19, False), 20000)

    def test_007_subtotal_below_free_shipping(self):
        self.assertEqual(calculate_shipping(499999, 10, True), 10000)

    def test_008_subtotal_boundary_free_shipping(self):
        self.assertEqual(calculate_shipping(500000, 10, True), 0)

    def test_009_subtotal_above_free_shipping(self):
        self.assertEqual(calculate_shipping(500001, 10, False), 0)

    def test_010_member_fee(self):
        self.assertEqual(calculate_shipping(100000, 10, True), 10000)

    def test_011_nonmember_fee(self):
        self.assertEqual(calculate_shipping(100000, 10, False), 20000)

    def test_012_invalid_order_priority(self):
        self.assertEqual(calculate_shipping(0, 21, True), "INVALID_ORDER")

    def test_013_branch_false_nonmember(self):
        self.assertEqual(calculate_shipping(100000, 10, False), 20000)


if __name__ == "__main__":
    unittest.main(verbosity=2)
