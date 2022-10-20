import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca su número: ");
        int nprimo = s.nextInt();
        boolean n = true;
        int i = 1;
        while(i<nprimo-1 && n){
            i++;
            if(nprimo%i==0){
                n=false;
            }else{
                n=true;
            }
            if(n){
                System.out.print(nprimo+ " es primo");
            }else{
                System.out.print(nprimo + " no es primo");
            }
        }
    s.close();
    }
}
