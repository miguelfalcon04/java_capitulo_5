import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int nintroducido;
        float div=0;
        float suma=0;
        do{
            System.out.print("Para finalizar introduzca un numero negativo: ");
            nintroducido=s.nextInt();
            if (nintroducido>0){
                suma=suma+nintroducido;
                div=div+1;
            }
        }while(nintroducido>0);
        float calculo=suma/div;
        System.out.printf("La media de los numeros es: %.2f",calculo);
        s.close();
    }
}
