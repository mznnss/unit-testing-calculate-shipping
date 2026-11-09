"""Business logic for calculating shipping costs."""


def calculate_shipping(subtotal, distance, is_member):
    """Menghitung biaya pengiriman sesuai aturan bisnis materi Pertemuan 9."""
    if subtotal <= 0:
        return "INVALID_ORDER"
    if distance > 20:
        return "OUT_OF_COVERAGE"
    if subtotal >= 500000:
        return 0
    if is_member:
        return 10000
    return 20000
