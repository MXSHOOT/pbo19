class aku01 {
    //pakai static bisa langsung berjalan diclass tersebut
    int angkaPertama;
    int angkaKedua;

    public void nilaiPertama(int nilaiPertama){
        angkaPertama = nilaiPertama;
    }

    public void nilaiKedua(int nilaiKedua) {
        angkaKedua = nilaiKedua;
    }
    // sudah dibuat jadi tidak perlu mengisi int lagi

    public int Pertambahan()//(int angkaPertama, int angkaKedua)
    {
        return angkaPertama+angkaKedua;
    }
    public int Pengurangan()//(int angkaPertama, int angkaKedua)
    {
        return angkaPertama*angkaKedua;
    }
}

// kalau sudah class dianggap method bukan fungsi
// public int nama lain dari nama fungsi yaitu method