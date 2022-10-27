import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int codigo = 1234;
        int oportu = 4;
        do{
            System.out.print("Introduzca la combinación: ");
            int comb = s.nextInt();
            if (codigo==comb){
                System.out.print("La caja fuerte se ha abierto satisfactoriamente");
                oportu=0;
            }
            else
            if(codigo!=comb){
                System.out.println("Lo siento, esa no es la combinación");
                oportu-=1;
            }
        }while(oportu>0);
        s.close();
    }
}
