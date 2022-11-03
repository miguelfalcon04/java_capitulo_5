import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura para pintar la U: ");
        int altura = sc.nextInt();

        for(int i=1;i<altura;i++){
            System.out.print("*");
            for(int j=1;j<=altura-2;j++){
                System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
        }

        for(int j=1;j<=altura;j++){
            System.out.print("*");
        }
    sc.close();
    }
}
