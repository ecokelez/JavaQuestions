package coreJava_Questions;

import java.util.Scanner;

public class C05_WhileLoop {
        /*
          Kullanicidan tam sayilar alin
          kullanici cift sayi girdigi muddetce sayiyilari yazdirin
          tek sayi girdiginde islemi bitirin
         */

    // While ıle yapalım

    // Loop un icerısınde variable olusturmuyoruz,
    // 1- Her seferınde yemı bır olusturma ıslemı yapmak
    // özellıkle Scanner , String gıbı yerlerde ram' ı doldurabılır,

    //  2- loop ıcerısnde olusturdugumuz varıable' ları loop dıısnda kullanamayız, bu nendenle
    // loop ' un ıcerısınde kuulanacagımız varıable' ları loop' un dısında hazırlıyoruz


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        while (num%2 == 0){
            System.out.println("Lutfen bir sayi giriniz");
            num = input.nextInt();

            if (num%2 == 0){
                System.out.println("The entered number is an even number " + num);
            } else
                System.out.println("The entered number is an odd number");
            }


               //===> do-while'in dezavantaji : ilk calistirma kontrol yapilmadan oldugu icin
               // loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir

        do {
            System.out.println("Please enter a number");
            num = input.nextInt();

            if (num%2 == 0){
                System.out.println("The entered number is an even number " + num);
            } else
                System.out.println("The entered number is an odd number");
        } while (num%2 == 0);




        }

    }











