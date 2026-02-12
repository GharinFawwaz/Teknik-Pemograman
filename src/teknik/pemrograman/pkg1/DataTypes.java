package teknik.pemrograman.pkg1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gharin Fawwaz
 */

import java.util.Scanner;
import java.math.BigInteger;

public class DataTypes {
    public static void main(String[] args) {
      
        try (Scanner sc = new Scanner(System.in)) {
            // Membaca jumlah kasus uji [cite: 24]
            int T = sc.nextInt();
            
            for (int i = 0; i < T; i++) {
                
                String s = sc.next();
                
                BigInteger n = new BigInteger(s);
                boolean bisaMuat = false;
                
                if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    if (!bisaMuat) System.out.println(s + " can be fitted in:");
                    System.out.println("* byte");
                    bisaMuat = true;
                }
                
                if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    if (!bisaMuat) System.out.println(s + " can be fitted in:");
                    System.out.println("* short");
                    bisaMuat = true;
                }
                
                if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    if (!bisaMuat) System.out.println(s + " can be fitted in:");
                    System.out.println("* int");
                    bisaMuat = true;
                }
                
                if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    if (!bisaMuat) System.out.println(s + " can be fitted in:");
                    System.out.println("* long");
                    bisaMuat = true;
                }
                
                if (!bisaMuat) {
                    System.out.println(s + " can't be fitted anywhere.");
                }
            }
        }
    }
}