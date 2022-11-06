import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();

        int nvolteado=0;
        while(n>0){
            nvolteado=nvolteado*10+(n%10);
            n/=10;
        }

        int digito=0;

        while(nvolteado>0){
            digito=nvolteado%10;

            if(digito==0){
                System.out.print("-");
            }
            if(digito==1){
                System.out.print("|");
            }
            if(digito==2){
                System.out.print("||");
            }
            if(digito==3){
                System.out.print("|||");
            }
            if(digito==4){
                System.out.print("||||");
            }
            if(digito==5){
                System.out.print("|||||");
            }
            if(digito==6){
                System.out.print("||||||");
            }
            if(digito==7){
                System.out.print("|||||||");
            }
            if(digito==8){
                System.out.print("||||||||");
            }
            if(digito==9){
                System.out.print("|||||||||");
            }
            System.out.print("-");
            nvolteado/=10;
        }

        sc.close();
        
    }
}
