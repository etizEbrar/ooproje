import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        motosiklet motor1 = new motosiklet("54","48.350","2009","HONDA CBF250","BENZİN");
        motosiklet motor2 = new motosiklet("175","330.350","2022","KAWASAKİ NİNJA1100H","BENZİN");
        motosiklet motor3 = new motosiklet("128","118.350","2012","HONDA CBR600R","BENZİN");
        motosiklet motor4 = new motosiklet("35","18.350","1996","JAWA 150H","BENZİN");


        jeep jeep1  = new jeep("130","50.240","1996","MİTSUBİSHİ L200","DİZEL");
        jeep jeep2 = new jeep("160","154.540","2010","BMW X1","DİZEL");
        jeep jeep3 = new jeep("180","368.740","2022","AUDİ Q3","DİZEL");
        jeep jeep4 = new jeep("145","58.240","1998","LADA NİRVANA","BENZİN");
        jeep jeep5 = new jeep("160","216.750","2015","HYUNDAİ TUCSON","BENZİN");
        jeep jeep6 = new jeep("180","420.740","2022","MERCEDES G CLASS","BENZİN");
        /*BEYGİR,BÜTÇE,YİL,MODEL,YAKİT */
        otomobil otomobil = new otomobil ("120","100.250","2003","AUDİ A6","DİZEL");
        otomobil otomobil2 = new otomobil ("140","250.000","2012","MERCEDES CLA","DİZEL");
        otomobil otomobil3 = new otomobil ("160","80.000","1996","BMW 320D","DİZEL");
        otomobil otomobil4 = new otomobil ("110","340.000","2021","TOYOTA COROLLA","DİZEL");
        otomobil otomobil5 = new otomobil ("120","100.250","2003","AUDİ A6","BENZİNLİ");
        otomobil otomobil6 = new otomobil ("140","250.000","2012","MERCEDES CLA","BENZİNLİ");
        otomobil otomobil7 = new otomobil ("160","80.000","1996","BMW 320D","BENZİNLİ");
        otomobil otomobil8 = new otomobil ("110","340.000","2021","TOYOTA COROLLA","BENZİNLİ");




        Scanner scan = new Scanner (System.in);
        int aractercih;
        int yakitercih,yiltercih;
        int bütce;
        System.out.println("***HOŞGELDİNİZ***");
        System.out.println("1.Suv  ------  2.Otomobil ----- 3.Motorsiklet ");
        System.out.print("Araç Türü Tercihiniz: ");
        aractercih = scan.nextInt();
        if(aractercih<1 || aractercih>3) {
            do {
                System.out.println("YANLIŞ ARAÇ TÜRÜ GİRİŞİ TEKRAR DENEYİNİZ!");
                aractercih=scan.nextInt();
            }
            while(aractercih<1 || aractercih>3);
        }

        System.out.println("1.Dizel  2.Benzin");
        System.out.print("Yakıt Türü Tercihiniz: ");
        yakitercih=scan.nextInt();
        if(yakitercih<1 || yakitercih>2) {
            do {
                System.out.println("YANLIŞ YAKIT TÜRÜ GİRİŞİ TEKRAR DENEYİNİZ!");
                yakitercih=scan.nextInt();
            }
            while(yakitercih<1 || yakitercih>2);
        }
        System.out.println("1.(1980-2000) 2.(2001-2010) 3.(2011-2022)");
        System.out.println("Üretim Yıl Aralığını Giriniz:");
        yiltercih=scan.nextInt();
        if(yiltercih<1 || yiltercih>3) {
            do {
                System.out.println("YANLIŞ ÜRETİM YILI GİRİŞİ TEKRAR DENEYİNİZ!");
                yiltercih=scan.nextInt();
            }
            while(yiltercih<1 || yiltercih>3);
        }
        System.out.println("1.( - 100.000)  2.(100.001 - 300.000) 3.(300.001 - )");
        System.out.println("BÜTÇE SIKALANIZI GİRİNİZ: ");
        bütce=scan.nextInt();
        if(bütce<1 || bütce>3) {
            do {
                System.out.println("YANLIŞ ÜRETİM YILI GİRİŞİ TEKRAR DENEYİNİZ!");
                bütce=scan.nextInt();
            }
            while(bütce<1 || bütce>3);
        }
        /*BEYGİR,BÜTÇE,YİL,MODEL,YAKİT */
        if(aractercih==1 && yakitercih==1 && yiltercih==1 && bütce==1) {
            System.out.println("***Size Uygun Araç Bulundu!***");
            System.out.println("Beygir Bilgisi: " +jeep1.getBeygir());
            System.out.println("Araç Fiyatı: "+jeep1.getBütce()+"TL");
            System.out.println("Araç Model Yılı: "+jeep1.getYiltercih());
            System.out.println("Araç Modeli: "+jeep1.getModel());
            System.out.println("Araç Yakıt Türü: "+jeep1.getYakit());
        }





    }
}