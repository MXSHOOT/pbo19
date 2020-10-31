public class PerulanganKetiga {
    public static void main(String[] args) {
        int i=2;
        //lakuin dulu baru kondisi untuk do kalau while kondisi dulu baru dijalanin
        do {
            int nilai = i+1;
            System.out.println("Nilai = "+nilai);
            i++;
            //iterasi 0, i=0; i<10 ? Benar, 0+1 = 1; tampilkan teks nilai; i+1 = 1
            //iterasi 1, i=0; i<10 ? Benar, 1+1 = 2; tampilkan teks nilai; i+1 = 2
            //iterasi 2, i=0; i<10 ? Benar, 2+2 = 3; tampilkan teks nilai; i+1 = 3
            //iterasi 3, i=0; i<10 ? Benar, 3+1 = 4; tampilkan teks nilai; i+1 = 4
            //..
            //iterasi 9, i=0; i<10 ? Benar, 9+1 = 10; tampilkan teks nilai; i+1 = 10
            //iterasi ke 10, i=10; i<10 ? 10+1 = 11 i<10 ? salah
        }
        while(i<10);
    }
}
