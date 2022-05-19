 import java.util.Scanner;

public class deretAngkaKuadrat {
   
   
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Membuat Deret Angka Kuadrat  ##");
    System.out.println("========================================");
    System.out.println();
      
    int jumlah_deret,i;
     
    System.out.print("Input jumlah deret yang diinginkan: ");
    jumlah_deret = input.nextInt();
    System.out.println();
  
    for (i=1; i<=jumlah_deret; i++) {
      System.out.print(i*i + " ");
    }
     
    System.out.println();
  }
}

