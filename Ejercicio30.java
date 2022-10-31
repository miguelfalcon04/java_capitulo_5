import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la primera hora: ");
        int h1 = s.nextInt();
        System.out.print("Día: ");
        String f1 =s.next();
        int d1=0;
        switch (f1){
            case "lunes":
            d1=1;
            break;

            case "martes":
            d1=2;
            break;

            case "miercoles":
            d1=3;
            break;

            case "miércoles":
            d1=3;
            break;

            case "jueves":
            d1=4;
            break;

            case "viernes":
            d1=5;
            break;

            case "sabado":
            d1=6;
            break;

            case "sábado":
            d1=6;
            break;

            case "domingo":
            d1=7;
            break;

        }

        System.out.print("Por favor, introduzca la segunda hora: ");
        int h2 = s.nextInt();
        System.out.print("Día: ");
        String f2 = s.next();
        int d2=0;
        switch (f2){
            case "lunes":
            d2=1;
            break;

            case "martes":
            d2=2;
            break;

            case "miercoles":
            d2=3;
            break;

            case "miércoles":
            d2=3;
            break;

            case "jueves":
            d2=4;
            break;

            case "viernes":
            d2=5;
            break;

            case "sabado":
            d2=6;
            break;

            case "sábado":
            d2=6;
            break;

            case "domingo":
            d2=7;
            break;

        }

        for(int i=1; i<=7; i++){
            if(h1>24||h1<0||h2>24||h2<0){
                System.out.println("Deben ser unas horas validas");
                i=7;
            }
            if(h1<=24 && h1>=0 && h2<=24 && h2>=0 && d2>d1){
                int cal =d2-d1;
                int o1 = 24-h1;
                int o2 = 24-h2;
                System.out.print("Entre las "+ h1 +":00"+ " del "+ f1 + " y las "+ h2+":00" + " del "+ f2+ " hay " +((cal*24)+o1-o2)+ " horas");
                i=7;
            }
            else if(d1>d2){
                System.out.println("El segundo dia debe ser posterior al primero.");
                i=7;
            }
        }
        s.close();
    }
}
