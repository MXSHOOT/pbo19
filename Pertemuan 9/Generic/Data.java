class Data <T> {
    T dataPertama;
    T dataKedua;

    public Data (T dataPertama, T dataKedua) {
        this.dataPertama = dataPertama;
        this.dataKedua = dataKedua;
    }

    public void showData () {
        System.out.println("Data pertama adalah " + dataPertama);
        System.out.println("Data kedua adalah " + dataKedua);
    }
}