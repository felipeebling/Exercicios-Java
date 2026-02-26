import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*Implementar um programa que conte a quantidade de consoantes de um texto. */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um texto: ");

        String texto = entrada.nextLine();
        entrada.close();

        char[] vogais = {'a','e','i','o','u'}; 

        char[] vetortxt = texto.toLowerCase().toCharArray();

        int countVogais = 0;
        int countEspacos = 0;
        boolean ok = false; 

        for (int i = 0; i < vetortxt.length; i++) {

            for (int j = 0; j < vogais.length; j++) {
                int temp = 0; 

                if (vetortxt[i] == ' '){
                    countEspacos++;
                    temp += 1;
                }
                

                if(vetortxt[i] == vogais[j]){
                    countVogais++;
                    temp+= 1;
                }

                if(temp > 0)
                    break;
                

                }

                     
                
            }
        

        int consoantes = vetortxt.length - ( countEspacos + countVogais);

        System.out.println( " vogais " + countVogais);
        System.out.println("espacos " + countEspacos);

    
        System.out.print(" A frase: " + texto + " Possui " + consoantes + " Consoantes! "  );
    
    }

    }
    

