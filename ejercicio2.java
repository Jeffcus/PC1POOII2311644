import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int totalPuntos = 0;
        System.out.println("Total de puntos en temp");
        System.out.println("-1 para terminar");
        while(true){
            try{
             System.out.println("Introduccir puntos del juego o -1 para terminar");
             String input=scanner.nextLine();
             
             if (input.equals("-1")) {
                break;
            }

            int puntos = Integer.parseInt(input);
            totalPuntos += puntos;
        } catch (NumberFormatException e) {
            System.out.println("error, usted debe ingresar un número válido.");
            System.exit(0);
        }
    }

    System.out.println("Los puntos totales son " + totalPuntos + ".");
    scanner.close();
    }
    
}
