/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.hipotenusu.hesaplayan.program;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class BasicHipotenusuHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int islem;
        int kenarBir,kenarIki,kenarUc;
double hipotenus,alan,u;

        System.out.println("Birinci işlem (Hipotenüs bulmak) için 1; İkinci işlem (Alan bulma) için 2 seçiniz:");
       islem = scanner.nextInt();

      if(islem == 1 ){
          System.out.println("Birinci dik kenarı giriniz:");
            kenarBir = scanner.nextInt();

            System.out.println("İkinci dik kenarı giriniz:");
            kenarIki = scanner.nextInt();
            hipotenus = Math.sqrt(kenarBir * kenarBir + kenarIki * kenarIki);
        System.out.println("hipotenus uzunluğu : " + hipotenus);

      }
       
      else if(islem == 2){
          System.out.println("Birinci  kenarı giriniz:");
            kenarBir = scanner.nextInt();
        
        System.out.println("İkinci  kenarı giriniz:");
            kenarIki = scanner.nextInt();
            System.out.println("Üçüncü kenarı giriniz:");
            kenarUc = scanner.nextInt();
            u = (kenarBir + kenarIki+kenarUc)/2.0;
            alan = Math.sqrt(u*(u-kenarBir )*( u-kenarIki)* (u-kenarUc));
            System.out.println("Üçgenin alani :  " + alan);
            
           
                    
      }
      else {
          System.out.println("Geçersiz işlem girdiniz  !!");
      }
      

      
        
        
        
        
        
       
        
    }
    
}
