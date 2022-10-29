public class Ejercicio22{
    public static void main(String[] args) {
        System.out.println("Se mostraran los numeros primos entre el 2 y el 100");
        boolean primo;
        for(int i=2;i<100;i++){
            primo=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    primo=false;
                }
            }
            if (primo){
                System.out.print(i+", ");
            }
        }
    }
}
