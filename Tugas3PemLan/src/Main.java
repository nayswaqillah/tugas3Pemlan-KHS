import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        ArrayList<MataKuliah> mataKuliahs = new ArrayList<>();

        System.out.println();
        System.out.println("Selamat Datang!");
        System.out.println("===========================================");
        System.out.print("Masukkan Nama            : ");
        String namaMahasiswa = scanner.nextLine();
        System.out.print("Masukkan NIM             : ");
        String nimMahasiswa = scanner.nextLine();
        System.out.println("===========================================");

        Mahasiswa mahasiswa = new Mahasiswa(nimMahasiswa, namaMahasiswa);
        mahasiswas.add(mahasiswa); //Menambahkan objek mahasiswa ke ArrayList
        
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMk = scanner.next();
        scanner.nextLine(); 
        System.out.print("Masukkan Mata Kuliah     : ");
        String namaMk = scanner.nextLine();
        System.out.print("Masukkan Nilai           : ");
        int nilaiAngka = scanner.nextInt();
        System.out.println();

        MataKuliah mataKuliah = new MataKuliah(kodeMk, namaMk, nilaiAngka);
        mataKuliahs.add(mataKuliah); //Menambahkan objek mata kuliah ke ArrayList

        System.out.println("===========================================");
        System.out.println("   INFORMASI KARTU HASIL STUDI MAHASISWA   ");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("NIM            : " + mahasiswa.getNim());
        System.out.println("Nama           : " + mahasiswa.getNama());
        System.out.println("Kode MK        : " + mataKuliah.getKodeMK());
        System.out.println("Nama MK        : " + mataKuliah.getMataKuliah());
        System.out.println("Nilai Huruf    : " + mataKuliah.konversiNilaiHuruf());

        scanner.close(); //Menutup scanner
    }
}


