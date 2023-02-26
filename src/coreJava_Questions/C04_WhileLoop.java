package coreJava_Questions;

import java.util.Scanner;

public class C04_WhileLoop {
      /*
         kullanicidan toplanmak uzere sayilar alin
        sayilarin toplami 500'u gecince
        sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

         13 sayi girdinz ve toplamlari 567

      */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num = 0;
        int sum = 0;
        int count = 0;

        while (sum<500){
            System.out.println("Herhangi bir sayi giriniz");
            num = input.nextInt();
            sum+= num;
            count++;
        }
        System.out.println(count + " quantity of enter number, all of sum : "+ sum);

    }
}
