# QA Testing / Unit Testing Kelompok 1

Proyek ini mengimplementasikan ulang fungsi `calculate_shipping()` berdasarkan materi Pertemuan 9 QA Testing dalam dua bahasa. Keduanya menggunakan aturan bisnis yang sama persis dan masing-masing memiliki 13 test case.

## Struktur repository

```text
python-version/
  calculate_shipping.py
  test_calculate_shipping.py
  requirements.txt
  README.md
java-maven-version/
  pom.xml
  src/main/java/id/ac/qa/ShippingCalculator.java
  src/test/java/id/ac/qa/ShippingCalculatorTest.java
  README.md
README.md
.gitignore
```

## Aturan bisnis

1. `subtotal <= 0` menghasilkan `INVALID_ORDER`.
2. `distance > 20` menghasilkan `OUT_OF_COVERAGE`.
3. `subtotal >= 500000` menghasilkan biaya `0`.
4. Pesanan member menghasilkan biaya `10000`.
5. Pesanan non-member menghasilkan biaya `20000`.

## Menjalankan Python

```powershell
cd python-version
python -m pip install -r requirements.txt
python -m unittest -v
python -m coverage run --branch -m unittest -v
python -m coverage report -m
python -m coverage html
```

Hasil yang diharapkan: 13 test berhasil, statement coverage fungsi 100%, dan branch coverage fungsi 100%. Buka laporan HTML pada `python-version/htmlcov/index.html`.

## Menjalankan Java Maven

Gunakan JDK 17 atau lebih baru yang kompatibel dengan target Java 17. Dari folder `java-maven-version`:

```powershell
cd java-maven-version
mvn test
mvn verify
```

Hasil yang diharapkan: 13 test berhasil. Laporan JaCoCo tersedia pada `java-maven-version/target/site/jacoco/index.html`. `mvn verify` juga gagal bila branch atau instruction coverage method `calculateShipping()` kurang dari 100%.

## Perbandingan alat

| Aspek | Python | Java |
|---|---|---|
| Framework test | `unittest` | JUnit 5 |
| Build/dependency | pip dan `requirements.txt` | Maven dan `pom.xml` |
| Coverage | coverage.py dengan `--branch` | JaCoCo Maven Plugin |
| Test method | `self.assertEqual(actual, expected)` | `assertEquals(expected, actual)` |
| Laporan HTML | `python-version/htmlcov/index.html` | `java-maven-version/target/site/jacoco/index.html` |

`unittest` adalah framework bawaan Python, sedangkan JUnit 5 adalah framework pengujian Java yang dikelola sebagai dependency Maven. coverage.py mengukur statement dan branch Python melalui command line; JaCoCo diintegrasikan ke lifecycle Maven dan menginstrumentasi bytecode Java.

## Upload ke GitHub

1. Buat repository kosong di GitHub.
2. Buka folder root ini di VS Code.
3. Jalankan pengujian Python dan Maven terlebih dahulu.
4. Pada Source Control VS Code, stage semua file, tulis commit message, lalu commit.
5. Pilih **Publish Branch**, login ke GitHub, dan pilih repository tujuan.

Alternatif melalui Git:

```powershell
git init
git add .
git commit -m "Add Python and Java shipping calculator unit tests"
git branch -M main
git remote add origin https://github.com/USERNAME/NAMA-REPOSITORY.git
git push -u origin main
```

Kedua implementasi dapat diuji terpisah dengan berpindah ke folder masing-masing, tetapi tetap berada dalam satu repository.
