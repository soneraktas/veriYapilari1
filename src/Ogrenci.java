public class Ogrenci {
    int Not1;
    int Not2;
    int Not3;
    int Ortalama;
    String isim;

    public Ogrenci(int not1, int not2, int not3, String isim) {
        Not1 = not1;
        Not2 = not2;
        Not3 = not3;
        this.isim = isim;
        // Ortalama nesne üretilirken hesaplansın ki her yerde hazır olsun
        Ortalama = (int) ((not1+not2+not3) /3);
    }//end constracter

}//end class
