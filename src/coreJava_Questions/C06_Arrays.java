package coreJava_Questions;

import java.util.Arrays;

public class C06_Arrays {

    //Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini
    // bir soldaki konuma tasiyacak bir program yazin.
    // Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

    public static void main(String[] args) {
         int arr[] = {1,2,3};
         int temp = arr[0];  // index'i 1 olani index'i 0 olana atayacagiz

        for (int i = 0; i < arr.length-1 ; i++) {      //=> loop un dısında arr'nin son elementı temp olsun ve temp atayalım,
                                                        // yani 1'i 3'un yerine atamis olduk
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));

        //yukarida degistirdigimiz array'i
        // ilk durumuna getirmek icin saga kaydiralim

         temp = arr[arr.length-1];

        for (int i = arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }


}
