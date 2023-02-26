package coreJava_Questions;

public class C13_MDA_IstenenSayilariCarptirma {
    //Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki
    // son elemanlarin carpimini  ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
    public static void main(String[] args) {

        int arr [][] = {{1,2,3}, {4,5}, {6}};

        int multiplication = 1;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (j== arr[i].length-1){
                    multiplication *= arr[i][j];
                }
            }
        }
        System.out.println("multiplication : " + multiplication);


    }
}
