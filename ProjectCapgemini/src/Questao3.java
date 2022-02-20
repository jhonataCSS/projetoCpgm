public class Questao3 {

 public static void main(String[] args) {
     
     String palavra = "ovo";
     char[] anagra= palavra.toCharArray();
     for(int i = 0; i < palavra.length(); i++) {
         for(int j = 1; j < palavra.length(); j++) {
             if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
                 if(palavra.charAt(i) == palavra.charAt(i+1)) {
                  System.out.println("["+ i + ","+ j   +"]");
                 } else {
                  String y = palavra.substring(i, j);                 
                  String z = palavra.substring(i + 1, j + 1);
                  String n = String.valueOf(anagra[i]);
                  String m = String.valueOf(anagra[j+1 > palavra.length()? j+1 : j]);
                  System.out.println("["+ y + "," + z  +"]");
                  System.out.println("["+ n + ","+ m  +"]");
                  }
             }
         }
     }  
 }

}