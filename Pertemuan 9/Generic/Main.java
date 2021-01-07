class Main {
    @SuppressWarnings("unchecked")
    public static void main(String args []) {
        Data dataInteger = new Data (8, 20);
        Data <String> dataString = new Data <String> ("Nurul", "Fikri");

        dataInteger.showData();
        dataString.showData();

        // ListData <String, Integer> ListDataInteger = new ListData <String, Integer> ("Umur", 15);
        

        // ListDataInteger.ListDataLama();
        // ListDataInteger.ListDataBaru("Nama", "Fikri");

        // ListData <String, Boolean> ListDataString = new ListData <String, Boolean> ("Nilai", true);
        // ListDataString.ListDataLama();
        // ListDataString.ListDataBaru("Nilai", 89);
    }
}