public class Questao2 {
 public static void main(String[] args) {
  
  System.out.println(verificarSenha("Gbh5!n"));
 }
 
 
 public static boolean verificarSenha(String senha) {
     if (senha.length() < 6) { System.out.println (6- senha.length());
     
     }else {
      System.out.println("Sua senha é forte");
     }
     
     boolean numero = false;
     boolean maiuscula = false;
     boolean minuscula = false;
     boolean simbolo = false;
     for (char c : senha.toCharArray()) {
          if (c >= '0' && c <= '9')  {
              numero = true;
          } else if (c >= 'A' && c <= 'Z') {
              maiuscula = true;
          } else if (c >= 'a' && c <= 'z') {
              minuscula = true;
          } else {
              simbolo = true;
          }
     }
     return numero && maiuscula && minuscula && simbolo;
 }
}