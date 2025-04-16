import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//    String str = "Sample String";
//
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }

//        System.out.print("Halo Dunia");    // output: Halo Dunia (tanpa pindah baris)
//        System.out.println("Halo Dunia");   // output: Halo Dunia, lalu pindah baris


//        String teks = "Belajar";
//        String terbalik = "";
//        for (int i = teks.length() - 1; i >= 0; i--) {
//            terbalik += teks.charAt(i);
//        }
//        System.out.println(terbalik);  // Output: rajaleB

//        String kalimat = "Mencari dalam string";
//        char cari = 'i';
//        int jumlah = 0;
//        for (int i = 0; i < kalimat.length(); i++) {
//            if (kalimat.charAt(i) == cari) {
//                jumlah++;
//            }
//        }
//        System.out.println("Jumlah huruf '" + cari + "': " + jumlah);
//        String str = "Parsing string ini";
//        ArrayList<String> kata = new ArrayList<>();

//        while (!str.isEmpty()) {
//            for (int i = 0; i < str.length(); i++) {
//                if (i == str.length() - 1) {
//                    kata.add(str);
//                    str = "";
//                    break;
//                } else if (str.charAt(i) == ' ') {
//                    kata.add(str.substring(0, i));
//                    str = str.substring(i + 1);
//                    break;
//                }
//            }
//        }
//        for (String s : kata) {
//            System.out.println(s + " ");
//        }
//        String kalimat = "Belajar Java itu menyenangkan";
//        String[] kata = kalimat.split(" ");
//// Hasilnya adalah array yang berisi setiap kata
//
//        String[] token = kalimat.split("[aiueo]");
//
//        System.out.println(Arrays.toString(token));
//        System.out.println(Arrays.toString(kata));


        String teks = "Belajar Java itu asik";
        System.out.println(teks.contains("Java"));            // true
        System.out.println(teks.indexOf("asik"));               // mengembalikan indeks di mana "asik" muncul
        System.out.println(teks.indexOf("a", 5));               // mencari 'a' dari indeks ke-5
}}

