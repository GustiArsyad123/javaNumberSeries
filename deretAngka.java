//public class deretAngka+1 {

import java.util.Scanner;
   
public class deretAngka {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##Program Java Membuat Deret Angka + 1##");
    System.out.println("========================================");
    System.out.println();
      
    int jumlah_deret,i;
     
    System.out.print("Input jumlah deret yang diinginkan: ");
    jumlah_deret = input.nextInt();
    System.out.println();
  
    for (i=1; i<=jumlah_deret; i++) {
      System.out.print(i + " ");
    }
     
    System.out.println();
  }
}
//}
