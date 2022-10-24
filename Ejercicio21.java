import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nintroducido;
        int nelemento=0;
        int nelementoimpar=0;
        int simpar=0;
        int mpar=0;
        System.out.println("Introduce un numero negativo para terminar con el bucle: ");
        do{
            nintroducido = s.nextInt();
            if (nintroducido>0){
                nelemento++;
            }
            if ((nintroducido%2)==1){
                simpar+=nintroducido;
                nelementoimpar+=1;
            }
            else{
                if(nintroducido>mpar){
                    mpar=nintroducido;
                }
            }
        } while (nintroducido>0);
        System.out.println("Se han introducido "+nelemento+ " numeros");
        System.out.println("La media de los numeros impares es: "+(simpar/nelementoimpar));
        System.out.println("El mayor de los pares es "+mpar);
        s.close();
    }
}
