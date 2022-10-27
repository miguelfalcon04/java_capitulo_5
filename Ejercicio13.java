import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mas = 0;
        int menos=0;
        for (int i=0; i<10;i++){
        System.out.print("Introduzca un numero: ");
        int n = s.nextInt();
        if(n>0){
            mas+=1;
        }
        if (n<0){
            menos+=1;
        }
        }
        System.out.print("Hay "+ mas + " números positivos y "+ menos + " números negativos");
        s.close();
    }
}

