
package javaapplication1;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class buh {
    public static void main(String[] args) {
     
      int a,b, cong,tru,nhan,chia,chiaDu;
      Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 2 so ");
      a = scanner.nextInt();
      b = scanner.nextInt();
      cong = a + b;
      tru = a - b;
      nhan = a*b;
      chia = a / b;
      chiaDu = a % b;
        System.out.println("Cong: " + cong);
        System.out.println("Tru: " + tru);
        System.out.println("Nhan: " + nhan);
        System.out.println("Chia: " + chia);
        System.out.println("Chia du: " + chiaDu);
      
          }
      }
    
    
    
} 