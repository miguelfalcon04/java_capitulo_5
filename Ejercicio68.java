import java.util.Scanner;
public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long n = sc.nextLong();
        long save = n;

        long volteado=0;

        while(n>0){
            volteado=volteado*10+(n%10);
            n/=10;
        }

        int op=0;
        System.out.printf("Dislocando el %d sale el ",save);
        while(volteado>0){
            op=(int)volteado%10;
            if(op%2==0){
                op+=1;
            }
            else{
                op-=1;
            }
        System.out.print(op);
        volteado/=10;
        }

        sc.close();
    }
}
