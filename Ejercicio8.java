import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = 0;
        System.out.print("Tabla del: ");
        int n = sc.nextInt(); 
        do{
            System.out.println(n +" * " + n2 + " = " + n*n2 );
            n2++;
        }while (n2<=10);
        sc.close();
    }
}
