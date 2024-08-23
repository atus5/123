/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
  int n;
 
       
  Scanner scanner = new Scanner(System.in);
//  m = scanner.nextInt();
  n = scanner.nextInt();
  
 for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
  }
  // 28 / 2 = 14
  // 14 / 2 = 7
  // 7/7 = 1
 }
       
        
}
}            

