import java.util.Scanner;
   
public class deretAngka3 {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Membuat Deret Angka Start dari 7  ##");
    System.out.println("========================================");
    System.out.println();
      
    int jumlah_deret,i;
     
    System.out.print("Input jumlah deret yang diinginkan: ");
    jumlah_deret = input.nextInt();
  
    for (i=1; i<=jumlah_deret; i++) {
      System.out.print(6+i + " ");
    }
     
    System.out.println();
  }
}