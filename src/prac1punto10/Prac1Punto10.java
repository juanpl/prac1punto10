package prac1punto10;
import java.util.Scanner;
        
public class Prac1Punto10 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero de dos digitos y el programa le dira si pertenece a la serie de Fibonacci");
        numero=teclado.nextInt();
        if(numero==13||numero==21||numero==34||numero==55||numero==89){
            System.out.println("El numero pertenece a la serie de Fibonacci");
        }
        else{
            System.out.println("El numero no pertenece a la serie de Fibonacci");
        }
      
    }
    
}
