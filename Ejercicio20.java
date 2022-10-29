import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("De que altura quieres la piramide: ");
        int altura = sc.nextInt();
        System.out.print("Introduzca el caracter deseado para crear la pirámide: ");
        String c = System.console().readLine();
        for (int i = 1; i <= altura-1; i++) {
            for (int j = i; j <altura ; j++){
                System.out.print(" "); 
            }
            if(i!=1){
            System.out.print(c);
            }
            for (int k = 1; k < (i-1)*2 ; k++){
                System.out.print(" "); 
            }
            System.out.print(c);
            System.out.println("");
        }
        for(int i=1;i<=altura*2-1;i++){
            System.out.print(c);
        }
        sc.close();
    }
}