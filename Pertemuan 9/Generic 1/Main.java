class Main {
    public static void main(String[] args) {
        Data <String, Integer> dataInt = new Data <String, Integer> ("Nilai", 70);
        Data <String, Boolean> dataStr = new Data <String, Boolean> ("Nurul", true);

        dataInt.showData();
        dataStr.showData();

        dataInt.showDataBaru("Adil");
        dataStr.showDataBaru(90);
    }
}
