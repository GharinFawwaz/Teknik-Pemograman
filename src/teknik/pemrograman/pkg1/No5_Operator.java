/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teknik.pemrograman.pkg1;

/**
 *
 * @author Gharin Fawwaz
 */

class No5_Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean result = (++a * 2 > b) && (b++ % 3 == 1);
        System.out.println("Hasil Boolean: " + result);
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}
