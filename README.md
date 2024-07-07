# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengecekan nomer voucher kartu menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan Nomer voucher kartu, dan memberikan output berupa informasi detail dari Nomer voucher tersebut seperti nama kartu, Kuota, Daerah, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Voucher`, `SubVoucher`, dan `MainVoucher` adalah contoh dari class.

```bash
public class Voucher {
    ...
}

public class SubVoucher extends Voucher {
    ...
}

public class MainVoucher {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `vcr[i] = new SubVoucher(name, novchr);` adalah contoh pembuatan object.

```bash
vcr[i] = new SubVoucher(name, novchr);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `npm` adalah contoh atribut.

```bash
String name;
String novchr;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Voucher` dan `SubVoucher`.

```bash
public Voucher(String name, String novchr) {
    this.name = nama;
    this.novchr = novchr;
}

public SubVoucher(String name, String novchr) {
    super(nama, novchr);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setName` dan `setNovchr` adalah contoh method mutator.

```bash
public void setName(String name) {
    this.name = name;
}

public void setNovchr(String novchr) {
    this.novchr = novchr;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getName`, `getNovchr`, `getNamaKartu`, `getKuota`, `getDaerah`, dan `getNoReg` adalah contoh method accessor.

```bash
public String getName() {
    return name;
}

public String getNovchr() {
    return npm;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `name` dan `novchr` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String name;
private String novchr;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SubVoucher` mewarisi `Voucher` dengan sintaks `extends`.

```bash
public class SubVoucher extends Voucher {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Voucher` merupakan overloading method `displayInfo` dan `displayInfo` di `SubVoucher` merupakan override dari method `displayInfo` di `Voucher`.

```bash

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getNamaKartu`,`getKuota`,`getDaerah`,`getNoReg`.

```bash

public String getNamaKartu() {
    switch(getNovchr().substring(0, 2)) {
           case "01":
                return "Indosat";
            case "02":
                return "XL";
            case "03":
                return "Smartfren ";
            case "04":
                return "IM3";
            case "05":
                return "Telkomsel";
            default:
                return "Tidak terdaftar dilayanan kami";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < vcr.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama anda yang ke" + (i + 1) + ": ");
String name = scanner.nextLine();

System.out.println("\nData vcr:");
System.out.println(vcr.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SubVoucher[] vcr = new SubVoucher[2];` adalah contoh penggunaan array.

```bash
SubVoucher[] vcr = new SubVoucher[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (StringIndexOutOfBoundsException x) {
    System.out.println("Kesalahan format voucher: " + x.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Hidayat
NPM: 2210010354

#100 Point
