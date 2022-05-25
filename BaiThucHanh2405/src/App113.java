/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTH2405;
import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class app113 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Số phần tử muốn nhập  : ");
        int n = sc.nextInt();
        HashSet<String> hashSetString = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("tên trái cây thứ " + (i+1) + ": ");
            String x = sc.nextLine();
            hashSetString.add(x);
        }
    }
}