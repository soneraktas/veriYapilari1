import java.util.Scanner;
import java.util.ArrayList;

Scanner tarayici  = new Scanner(System.in);
ArrayList<Ogrenci> ogrenciler = new ArrayList<>();


void main() {

    int tercih;
    while (true){
        System.out.println("\n*** ANA MENU ***");
        System.out.println("1 ) Öğrenci Ekle");
        System.out.println("2 ) Öğrencileri Listele");
        System.out.println("5 ) Çıkış");

        System.out.print("tercihiniz...:");
        tercih=tarayici.nextInt();
        tarayici.nextLine();// next int den sonra next line diyerek \n temizliyoruz
        if (tercih==5){
            break;
        }else if (tercih==1){
            ogrenciEkle();
        } else if (tercih==2) {
            ogrencileriListele();
        }

    }//end while

}//end main

void ogrenciEkle(){
    System.out.println("ogrenciEkle metodu çalıştı ...");
    System.out.print("Öğrencinin ismini girin...:");
    String ogrenciIsmi=tarayici.nextLine();
    System.out.println("ogrenci ismi...:"+ogrenciIsmi);


    System.out.print("Öğrencinin 1. notunu girin...:");
    int not1 = tarayici.nextInt();

    System.out.print("Öğrencinin 2. notunu girin...:");
    int not2 = tarayici.nextInt();

    System.out.print("Öğrencinin 3. notunu girin...:");
    int not3 = tarayici.nextInt();

    System.out.println("örencinin notları...:"+not1+"\t"+not2+"\t"+not3);

    ogrenciler.add(new Ogrenci(not1,not2,not3,ogrenciIsmi));
}//end ogrenciEkle



void ogrencileriListele(){
    System.out.println("ogrencileriListele metodu çalıştı");

    for (Ogrenci gecici : ogrenciler){
        System.out.print(gecici.isim+"\t");
        int ortalama = (int) ((gecici.Not1+gecici.Not2+gecici.Not3) /3);
        gecici.ortalama=ortalama;
        System.out.println("ortalaması ...:"+gecici.ortalama);
    }//end for

}//end ogrencileriListele