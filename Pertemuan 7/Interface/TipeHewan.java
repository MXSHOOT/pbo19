interface TipeHewan {
    final static String tipePemakan = "Karnivora";

    public String tipeHewan();
    public String tipeAlam();

    default void umurHewan(int umur) {
        int totalUmur = umur+15;
        System.out.println("Umur hewan ini adalah = " + totalUmur);
    }
}