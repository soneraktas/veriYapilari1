import java.util.Scanner;
import java.util.ArrayList;

Scanner tarayici  = new Scanner(System.in);
ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
Ogrenci ogrenci;


void main() {

    int tercih;
    while (true){
        System.out.println("\n*** ANA MENU ***");
        System.out.println("1 ) Öğrenci Ekle");
        System.out.println("2 ) Öğrencileri Listele");
        System.out.println("3 ) ismini girdiğiniz öğrenci kaydını Listele");
        System.out.println("4 ) ismini girdiğiniz öğrenci kaydını sil");
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
        } else if (tercih==3) {
            ogrenciKaydiniListele();
        } else if (tercih==4) {
            ogrenciKaydiSil();
        }

    }//end while

}//end main


void ogrenciEkle(){

    System.out.print("Öğrencinin ismini girin...:");
    String ogrenciIsmi=tarayici.nextLine();
    System.out.println("ogrenci ismi...:"+ogrenciIsmi);

    System.out.print("Öğrencinin 1. notunu girin...:");
    int not1 = tarayici.nextInt();
    tarayici.nextLine();// next int den sonra next line diyerek \n temizliyoruz

    System.out.print("Öğrencinin 2. notunu girin...:");
    int not2 = tarayici.nextInt();
    tarayici.nextLine();// next int den sonra next line diyerek \n temizliyoruz

    System.out.print("Öğrencinin 3. notunu girin...:");
    int not3 = tarayici.nextInt();
    tarayici.nextLine();// next int den sonra next line diyerek \n temizliyoruz

    System.out.println("örencinin notları...:"+not1+"\t"+not2+"\t"+not3);

    ogrenciler.add(new Ogrenci(not1,not2,not3,ogrenciIsmi));
}//end ogrenciEkle


void ogrencileriListele(){

    if (ogrenciler.isEmpty()){
        System.out.println("Listelenecek öğrenci bulunamadı.");
        return;
    }//end if

    System.out.println("\n--- ÖĞRENCİ LİSTESİ ---");
    for (Ogrenci gecici : ogrenciler){
        System.out.println("İsim: " + gecici.isim + "\t Ortalama: " + gecici.Ortalama);
    }//end for

}//end ogrencileriListele


void ogrenciKaydiniListele(){

    boolean aranilanOgrenciBulunduMu=false;
    if (ogrenciler.isEmpty()) {
        System.out.println("Listelenecek öğrenci bulunamadı.");
        return;
    }//end if

    System.out.print("kaydını görmek istediğiniz öğrenci ismini girin...:");
    String ogrenciIsmi=tarayici.nextLine();

    for (Ogrenci gecici : ogrenciler){

        if (gecici.isim.equalsIgnoreCase(ogrenciIsmi)){
            aranilanOgrenciBulunduMu=true;
            System.out.println(ogrenciIsmi+" nin kayıtları listeleniyor");
            ogrenci=gecici;
            System.out.println("öğrencinin ismi...:"+ogrenci.isim);
            System.out.println("öğrencinin 1 .notu...:"+ogrenci.Not1);
            System.out.println("öğrencinin 2. notu...:"+ogrenci.Not2);
            System.out.println("öğrencinin 3. notu...:"+ogrenci.Not3);
            System.out.println("öğrencinin ortalaması...:"+ogrenci.Ortalama);
            if (ogrenci.Ortalama<50){
                System.out.println("öğrenci kaldı");
            }else {
                System.out.println("öğrenci geçti");
            }//end else
        }//end if

    }//end for
    if (aranilanOgrenciBulunduMu==false){
        System.out.println(ogrenciIsmi+" isminde bir öğrenci kaydı bulunamadı.");
    }//end if

}//end ogrenciKaydiniListele


void ogrenciKaydiSil(){
    if (ogrenciler.isEmpty()) {
        System.out.println("Öğrenci kaydı boş... silinecek herhangi kayıtlı öğrenci yok");
        return;
    }//end if

    System.out.print("kaydının silmek istediğiniz öğrenci ismini girin...:");
    String ogrenciIsmi = tarayici.nextLine();
    System.out.println("silmek istediğiniz öğrenci...:"+ogrenciIsmi);

    // removeIf true dönerse listeden eleman silinmiştir
    boolean kayitSilindimi = ogrenciler.removeIf(o -> o.isim.equalsIgnoreCase(ogrenciIsmi));
    if (kayitSilindimi==true){
        System.out.println(ogrenciIsmi+" isimli öğrenci kaydı başarılı bir şekilde silindi");
    }else {
        System.out.println(ogrenciIsmi+" isimli öğrenci kayıtdı  silinemedi");
        System.out.println("öğrenci ismini yanlış yazmış olabilirsiniz tüm öğrenci kayıtlarını listeletip \n öğrencinin sistemde kayıtlı olup olmadığını kontrol edin ...");
    }


}//end ogrenciKaydiSil