import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int n2 = sc.nextInt();

        long numero= n1;
        long volteado1=0;
        int longitud=0;

        if(numero==0){
            longitud=1;
        }

        while(numero>0){
            volteado1=(volteado1*10)+(numero%10);
            numero=numero/10;
            longitud=longitud+1;
        }

        numero=n2;
        long volteado2=0;
        while(numero>0){
            volteado2=(volteado2*10)+(numero%10);
            numero=numero/10;
        }

        long resultadopar=0;
        long resultadoimpar=0;
        int digito;

        for(int i =0; i<longitud; i++){
            digito=(int)(volteado1%10);
            if(digito%2==0){
                resultadopar=resultadopar*10+digito;
            }
            else{
                resultadoimpar=resultadoimpar*10+digito;
            }
            digito=(int)(volteado2%10);
            if(digito%2==0){
                resultadopar=resultadopar*10+digito;
            }
            else{
                resultadoimpar=resultadoimpar*10+digito;
            }
            volteado1=volteado1/10;
            volteado2=volteado2/10;
        }
    System.out.println("El numero formado por los digitos pares es: "+resultadopar);
    System.out.println("El numero formado por los digitos impares es: "+resultadoimpar);
    sc.close();
    }
}