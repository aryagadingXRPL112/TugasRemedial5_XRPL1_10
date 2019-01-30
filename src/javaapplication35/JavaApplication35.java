package javaapplication35;

public class JavaApplication35 {

        public static void main(String[] args) {
       char[] huruf = {'S','M','K','T','E','L','K','O','M','M','A','L','A','N','G'};
     int Hitung = 0;
     for (int i=0; i<huruf.length; i++) {
         if (huruf[i] == 'A') Hitung++;
 
     }
     System.out.println("Jumlah 'A' yang ada di kalimat tersebut adalah: "+ Hitung);
     
    }
    
}
