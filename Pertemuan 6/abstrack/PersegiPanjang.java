class PersegiPanjang extends BangunDatar {
   double panjang;
   double lebar;

   public PersegiPanjang(int panjang, int lebar) {
       this.panjang = panjang;
       this.lebar = lebar;
   }

   @Override
   double luas() {
       double nilai = this.panjang * this.lebar;
       return nilai;
   }

   @Override
   double keliling() {
       double nilai = 2*(panjang+lebar);
       return nilai;
   }
}
