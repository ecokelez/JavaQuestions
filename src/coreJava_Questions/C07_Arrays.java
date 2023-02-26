package coreJava_Questions;

public class C07_Arrays {
    // Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
    public static void main(String[] args) {
        String[] names={"Ersoy" ,"Mehmet","Elif", "Muhammet", "Mihrican"};

        writeTheLongestandShortestNames(names);

    }

    private static void writeTheLongestandShortestNames(String[] names) {
        String shortestName = names[0];
        String longestName = names[0];

        for (int i = 0; i < names.length ; i++) {

            if (names[i].length()> longestName.length()){
                longestName = names[i];
            }else if (names[i].length()< shortestName.length()){
                shortestName = names[i];
            }

        }

        System.out.println("The longest name : " + longestName);
        System.out.println("The shortest name : " + shortestName);

    }


}
