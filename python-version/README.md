# Implementasi Python

Implementasi ini menggunakan Python `unittest` dan `coverage.py`. Fungsi `calculate_shipping()` mengikuti aturan bisnis materi Pertemuan 9 tanpa perubahan.

## Menjalankan 13 test case

Jalankan dari folder `python-version`:

```powershell
python -m unittest -v
```

## Menjalankan coverage branch

```powershell
python -m coverage run --branch -m unittest -v
python -m coverage report -m
python -m coverage html
```

Perintah terakhir membuat laporan HTML di `htmlcov/index.html`. Target fungsi adalah 100% statement coverage dan 100% branch coverage.
