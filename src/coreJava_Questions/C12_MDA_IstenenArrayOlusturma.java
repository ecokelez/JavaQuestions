package coreJava_Questions;

import java.util.Arrays;

public class C12_MDA_IstenenArrayOlusturma {
    //Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
    // birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan
    // ve yeni array’i  ekrana  yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
    // Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

    public static void main(String[] args) {
        int [][] input = { {1,2,3}, {4,5}, {6,7} };
        int newArray[] = new int[input.length];
        int sum = 0;

        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j < input[i] .length; j++) {
            sum += input[i][j];

            }
            newArray[i] = sum;   //===> ilk elemanı toladiktan sonra tekrar ikinci bir yeni eleman olusturmasi gerekiyor,
                                // bu nedenle toplami sıfırladik
            sum = 0;
        }
        System.out.println("new Array : " + Arrays.toString(newArray));
    }
}
