package coreJava_Questions;

import java.util.Arrays;

public class C09_Arrays {
    //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
    // String[] sınıfLıstesı={"Alı CAN"};

    public static void main(String[] args) {
        String[] classList ={"Ali CAN"};
        String addName = "Ersoy Can";

        classList = addNewElementArray(classList,addName);
        System.out.println(Arrays.toString(classList));


    }

    private static String[] addNewElementArray(String[] classList, String addName) {
        String newClassList[] = new String[classList.length+1];    // [null],[null] olur cunku new String olusturdugumuz
                                                                    // ve yenı degerleri de yazmadıgımız ıcın

        // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        for (int i = 0; i < classList.length ; i++) {
            newClassList[i] = classList[i];
        }

        // son index'e ise eklenecek ismi atadim
        newClassList[newClassList.length-1] = addName;

        return newClassList;

    }






}
