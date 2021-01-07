class ListData <K, V> {
    K kunci;
    V nilai;

    public ListData (K kunci, V nilai) {
        this.kunci = kunci;
        this.nilai = nilai;
    }

    public void ListDataLama() {
        System.out.println("Kunci lama adalah = " + this.kunci);
        System.out.println("Nilai lama adalah = " + this.nilai);
    }

    public <K, V> void ListDataBaru (K kunci, V nilai) {
        System.out.println("Kunci baru adalah = " + kunci);
        System.out.println("Nilai baru adalah = " + nilai);
    }
}