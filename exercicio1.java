
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        /*Implementar um programa que conte a quantidade de vogais de um texto. */
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um texto: ");

        String texto = entrada.nextLine();
        entrada.close();

        char[] vogais = {'a','e','i','o','u'}; 

        char[] vetortxt = texto.toLowerCase().toCharArray();

        int count = 0;
        

    for (int i = 0; i < texto.length(); i++) {

        for (int j = 0; j < vogais.length; j++) {
            
            if (vetortxt[i] == vogais[j]){
                count++;
                break;
            }


        }
        
    }

        System.out.println("A frase: " + texto + " Possui " + count + " Vogais!");







    }
    
}
