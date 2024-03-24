public class Mahasiswa {
    //Atribut class mahasiswa
    private String nim;
    private String nama;
    
    //Konstruktor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    //Method untuk mendapatkan nilai dari nama dan nim
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }
}


