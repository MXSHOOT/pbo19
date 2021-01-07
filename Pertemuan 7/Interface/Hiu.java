public class Hiu implements Hewan, TipeHewan {
    
    @Override
    public String suaraHewan() {
        return "Gawwrrr Guraa";
    }

    @Override
    public String jenisMakanan() {
        return "Sayuran";
    }

    @Override
    public String tipeHewan() {
        return "Martil";
    }

    @Override
    public String tipeAlam() {
        return "Lautan";
    }

    public String tipeMakanan() {
        return TipeHewan.tipePemakan;
    }

    public void umurHiu(int umur) {
        TipeHewan.super.umurHewan(umur);
    }
    
}