package coreJava_Questions;

public class C08_Arrays {
    // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
    //int[] sayılar = {3,5,7,6,1,4,9,5,2};

    public static void main(String[] args) {
        int[] numbers = {3,5,7,6,1,4,9,5,2};

        writeTheMaxNumbers(numbers);
    }

    private static void writeTheMaxNumbers(int[] numbers) {
        int maxNum = numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers.length>maxNum){
                maxNum  = numbers[i];
            }
        }
        System.out.println("Max number : " + maxNum);
    }

}
