# Unit Testing `calculate_shipping()` — Python & Java Maven

Repository ini merupakan proyek tugas **QA Testing / Unit Testing Kelompok 1** yang mengimplementasikan dan menguji fungsi `calculate_shipping()` menggunakan dua pendekatan berbeda, yaitu Python dengan `unittest` dan Java dengan Maven serta JUnit 5.

Proyek ini dibuat untuk memahami penerapan Unit Testing, Black-box Testing, White-box Testing, Statement Coverage, Branch Coverage, dan pengujian batas input (Boundary Value Analysis).

## 📌 Tujuan Proyek

- Mengimplementasikan fungsi `calculate_shipping()` menggunakan Python dan Java.
- Membuat 13 test case untuk menguji fungsi perhitungan ongkir.
- Menerapkan Black-box Testing dan White-box Testing.
- Mengukur Statement Coverage dan Branch Coverage.
- Membandingkan implementasi testing Python dan Java Maven.
- Mendokumentasikan hasil pengujian dalam repository GitHub.

## 📂 Struktur Repository

```text
unit-testing-calculate-shipping/
│
├── README.md
│
├── python-version/
│   ├── calculate_shipping.py
│   ├── test_calculate_shipping.py
│   ├── requirements.txt
│   ├── README.md
│   └── htmlcov/
│
└── java-maven-version/
    ├── pom.xml
    ├── README.md
    ├── src/
    │   ├── main/java/com/tokokita/ShippingCalculator.java
    │   └── test/java/com/tokokita/ShippingCalculatorTest.java
    └── target/site/jacoco/
```

## 📖 Aturan Fungsi `calculate_shipping()`

Fungsi ini digunakan untuk menentukan biaya pengiriman berdasarkan subtotal belanja, jarak pengiriman, dan status member.

| Kondisi | Hasil |
|---|---|
| Subtotal ≤ 0 | `INVALID_ORDER` |
| Jarak > 20 km | `OUT_OF_COVERAGE` |
| Subtotal ≥ Rp500.000 | Gratis ongkir (0) |
| Member | Rp10.000 |
| Non-member | Rp20.000 |

Urutan pengecekan kondisi mengikuti implementasi fungsi yang digunakan dalam materi perkuliahan.

## 🧪 Test Case

Proyek ini menggunakan **13 test case** yang mencakup:

- Subtotal negatif.
- Subtotal nol.
- Subtotal valid.
- Jarak pengiriman tepat 20 km.
- Jarak pengiriman melebihi 20 km.
- Jarak pengiriman di bawah batas maksimal.
- Subtotal di bawah batas gratis ongkir.
- Subtotal tepat Rp500.000.
- Subtotal di atas Rp500.000.
- Biaya pengiriman member.
- Biaya pengiriman non-member.
- Prioritas validasi pesanan.
- White-box testing pada jalur non-member.

Seluruh test case dijalankan pada kedua implementasi.

## 🐍 Implementasi Python

### Teknologi
- Python
- `unittest`
- `coverage.py`

### Cara Menjalankan Testing

Masuk ke folder Python:

```bash
cd python-version
```

Jalankan pengujian:

```bash
python -m unittest test_calculate_shipping.py -v
```

Jalankan pengujian dengan coverage:

```bash
coverage run --branch -m unittest test_calculate_shipping.py
```

Lihat laporan coverage:

```bash
coverage report -m
```

Buat laporan HTML:

```bash
coverage html
```

Laporan HTML tersedia di:

```text
python-version/htmlcov/index.html
```

## ☕ Implementasi Java Maven

### Teknologi
- Java 17
- Apache Maven
- JUnit 5
- JaCoCo

### Cara Menjalankan Testing

Masuk ke folder Java Maven:

```bash
cd java-maven-version
```

Jalankan testing:

```bash
mvn test
```

Jalankan verifikasi dan coverage:

```bash
mvn verify
```

Laporan JaCoCo tersedia di:

```text
java-maven-version/target/site/jacoco/index.html
```

Laporan dapat dibuka menggunakan browser untuk melihat Statement Coverage dan Branch Coverage.

## 📊 Hasil Pengujian

Berdasarkan pengujian yang telah dilakukan:

| Pengujian | Python | Java Maven |
|---|---:|---:|
| Total Test Case | 13 | 13 |
| Test Passed | 13 | 13 |
| Test Failed | 0 | 0 |
| Statement Coverage | 100% | 100% |
| Branch Coverage | 100% | 100% |
| Status | PASS | BUILD SUCCESS |

### Python Coverage

- Statement Coverage fungsi `calculate_shipping()`: **100%**
- Branch Coverage fungsi `calculate_shipping()`: **100%**

### Java Maven JaCoCo

- Instruction Coverage fungsi `calculateShipping()`: **100%**
- Branch Coverage fungsi `calculateShipping()`: **100%**
- Maven Verification: **BUILD SUCCESS**

Hasil coverage tersebut menunjukkan seluruh statement dan seluruh cabang keputusan pada fungsi yang diuji telah tercakup dalam pengujian.

## 🔍 Teknik Testing

### Black-box Testing
Pengujian dilakukan berdasarkan input dan output fungsi tanpa memperhatikan struktur internal kode.

Teknik yang digunakan:
- Equivalence Partitioning.
- Boundary Value Analysis.

### White-box Testing
Pengujian dilakukan dengan memperhatikan struktur internal fungsi.

Teknik yang digunakan:
- Statement Coverage.
- Branch Coverage.
- Pengujian jalur keputusan True dan False pada kondisi IF.

## 📑 Perbandingan Implementasi

| Aspek | Python | Java Maven |
|---|---|---|
| Bahasa | Python | Java |
| Testing Framework | unittest | JUnit 5 |
| Build Tool | Tidak menggunakan Maven | Maven |
| Coverage Tool | coverage.py | JaCoCo |
| Perintah Testing | `python -m unittest` | `mvn test` |
| Perintah Coverage | `coverage report` | `mvn verify` |
| Laporan | HTML | HTML |

## 👨‍💻 Kesimpulan

Proyek ini berhasil mengimplementasikan Unit Testing pada fungsi `calculate_shipping()` menggunakan Python dan Java Maven.

Kedua implementasi berhasil menjalankan 13 test case dengan seluruh pengujian berstatus PASS. Hasil pengukuran menunjukkan Statement Coverage dan Branch Coverage mencapai 100% pada fungsi yang diuji.

Melalui proyek ini, dapat dipahami bahwa Unit Testing dapat diterapkan menggunakan bahasa pemrograman dan framework berbeda dengan tujuan yang sama, yaitu memastikan fungsi berjalan sesuai spesifikasi dan mengurangi kemungkinan kesalahan program.

---

**Project:** QA Testing — Unit Testing Kelompok 1  
**Function:** `calculate_shipping()`  
**Implementation:** Python & Java Maven  
**Testing:** unittest, JUnit 5, coverage.py, JaCoCo
