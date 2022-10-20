import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int npos = 0;
        int nneg= 0;
        for (int i=1; i<=10; i++){
            System.out.print("Introduzca el " + i + "º numero: ");
            int n = s.nextInt();
            if (n>0){
                npos++;
            }
            if (n<0){
                nneg++;
            }
            }
            System.out.print("Hay "+npos + " números positivos y "+ nneg + " números negativos");
            s.close();
        }
    }

