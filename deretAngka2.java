import java.util.Scanner;

class deretAngka2 {
   
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Membuat Deret Angka + 5  ##");
    System.out.println("========================================");
    System.out.println();
      
    int jumlah_deret,i;
     
    System.out.print("Input jumlah deret yang diinginkan: ");
    jumlah_deret = input.nextInt();
    System.out.println();
  
    for (i=1; i<=jumlah_deret; i++) {
      System.out.print(i*5 + " ");
    }
     
    System.out.println();
  }
}

