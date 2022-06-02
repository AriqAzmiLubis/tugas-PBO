import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class kubus {
    public static void main(String[] args) {
        Scanner permukaankubus = new Scanner(System.in);
        System.out.println("===== Menghitung Luas Permukaan Kubus =====");
        
        System.out.println("Masukkan panjang sisi kubus : ");
        int sisi = permukaankubus.nextInt();
        System.out.println("Luas Permukaan Kubus  : " + 6 * (sisi*sisi));
    }
    
}
