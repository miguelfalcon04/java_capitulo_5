import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n =s.nextInt();
        System.out.print("Introduzca un segundo número: ");
        int n2 =s.nextInt();
        for(int i=1; i<n;i++){
            if(i%n2!=0){
                System.out.print(i+" ");
            }
        }
    s.close();
    }
}
