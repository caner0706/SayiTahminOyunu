package com.mycompany.sinavhazirlik;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        int sayı1=(int)(Math.random()*101);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1 ile 100 Arasında Sihirli Bir Sayı Tahmin Ediniz : ");
        
        int tahmin=-1;
        
        while(tahmin != sayı1){
            
            System.out.println("\nTahmin Ediniz : ");
            tahmin=scanner.nextInt();
            
            if(sayı1==tahmin){
                System.out.println("Evet Tahmininiz Doğru.Tebrikler:) ");
            }
            else if(sayı1<tahmin){
                System.out.println("Tahmininiz Çok Büyük.Biraz Küçültün...");
            }
            else{
                System.out.println("Tahmininiz Çok Küçük.Biraz Arttırın...");
            }
        }
        
        System.out.println("Oyunumzu Oynadığınız İçin Teşekkürler.Yine Bekleriz :)))");

    }
    
}
