import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el numero para darle la vuelta: ");
        int n = s.nextInt();
        while(n>=1){
            System.out.print(n%10);
            n=n/10;
        }
    s.close();
    }
}
