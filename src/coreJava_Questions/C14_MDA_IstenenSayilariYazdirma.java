package coreJava_Questions;

public class C14_MDA_IstenenSayilariYazdirma {
      /*
        Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};
        [0][0] + [1][1] + [2][2] ......
      */

    public static void main(String[] args) {
        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};
        int sum = 0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (i == j){
                    sum += sayilar[i][j];
                }

            }
        }
        System.out.println("sum : " + sum);
    }
}
