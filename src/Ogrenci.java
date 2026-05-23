public class Ogrenci {
   public int Not1;
   public int Not2;
   public int Not3;
   public int Ortalama;
   public String isim;

    public Ogrenci(int not1, int not2, int not3, String isim) {
        Not1 = not1;
        Not2 = not2;
        Not3 = not3;
        this.isim = isim;
        // Ortalama nesne üretilirken hesaplansın ki her yerde hazır olsun
        Ortalama = (int) ((not1+not2+not3) /3);
    }//end constracter

}//end class
