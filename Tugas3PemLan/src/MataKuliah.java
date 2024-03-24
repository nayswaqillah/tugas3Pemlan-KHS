public class MataKuliah {
    private String kodeMK;
    private String mataKuliah;
    private int nilaiAngka;

    //Konstruktor
    public MataKuliah(String kodeMK, String mataKuliah, int nilaiAngka){
        this.kodeMK = kodeMK;
        this.mataKuliah = mataKuliah;
        this.nilaiAngka = nilaiAngka;
    }

    //Method untuk mendapatkan nilai dari kodeMK, mata kuliah, dan nilai angka
    public String getKodeMK() {
        return kodeMK;
    }
    public String getMataKuliah() {
        return mataKuliah;
    }
    public int getNilaiAngka() {
        return nilaiAngka;
    }
    
    //Untuk mengonversi nilai angka menjadi nilai huruf
    public String konversiNilaiHuruf(){
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka >=60 && nilaiAngka < 80) {
            return "B";
        } else if (nilaiAngka >=50 && nilaiAngka < 60) {
            return "C";
        } else if (nilaiAngka >=40 && nilaiAngka < 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
