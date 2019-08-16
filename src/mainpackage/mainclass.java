package mainpackage;

import scannerpackage.scannerclass;

public class mainclass {
    public static void main(String[]args)    {
        System.out.print("Adınızı ve soyadınızı giriniz: ");

        scannerclass scannerclass =new scannerclass();
        String adsoyad = scannerclass.AdSoyadAl();
        System.out.println(adsoyad);
    }
}
