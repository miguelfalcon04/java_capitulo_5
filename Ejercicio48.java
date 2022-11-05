import java.util.Scanner;
public class Ejercicio48{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        long numero = sc.nextLong();

        boolean cero=false;
        boolean uno=false;
        boolean dos=false;
        boolean tres=false;
        boolean cuatro=false;
        boolean cinco=false;
        boolean seis=false;
        boolean siete=false;
        boolean ocho=false;
        boolean nueve=false;
        
        while(numero > 0){
            if(numero%10 == 0){
                cero=true;
            }
            if(numero%10 == 1){
                uno=true;
            }
            if(numero%10 == 2){
                dos=true;
            }
            if(numero%10 == 3){
                tres=true;
            }
            if(numero%10 == 4){
                cuatro=true;
            }
            if(numero%10 == 5){
                cinco=true;
            }
            if(numero%10 == 6){
                seis=true;
            }
            if(numero%10 == 7){
                siete=true;
            }
            if(numero%10 == 8){
                ocho=true;
            }
            if(numero%10 == 9){
                nueve=true;
            }
            numero/=10;
        }
        
        System.out.print("Dígitos que aparecen:");

        if(cero == true){
            System.out.print(" 0 ");
        }
        if(uno == true){
            System.out.print(" 1 ");
        }
        if(dos == true){
            System.out.print(" 2 ");
        }
        if(tres == true){
            System.out.print(" 3 ");
        }
        if(cuatro == true){
            System.out.print(" 4 ");
        }
        if(cinco == true){
            System.out.print(" 5 ");
        }
        if(seis == true){
            System.out.print(" 6 ");
        }
        if(siete == true){
            System.out.print(" 7 ");
        }
        if(ocho == true){
            System.out.print(" 8 ");
        }
        if(nueve == true){
            System.out.print(" 9 ");
        }

        System.out.println("");

        System.out.print("Dígitos que no aparecen:");

        if(cero == false){
            System.out.print(" 0 ");
        }
        if(uno == false){
            System.out.print(" 1 ");
        }
        if(dos == false){
            System.out.print(" 2 ");
        }
        if(tres == false){
            System.out.print(" 3 ");
        }
        if(cuatro == false){
            System.out.print(" 4 ");
        }
        if(cinco == false){
            System.out.print(" 5 ");
        }
        if(seis == false){
            System.out.print(" 6 ");
        }
        if(siete == false){
            System.out.print(" 7 ");
        }
        if(ocho == false){
            System.out.print(" 8 ");
        }
        if(nueve == false){
            System.out.print(" 9 ");
        }
        sc.close();
    }
}