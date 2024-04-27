//NOMBRE: Marvin Francisco Pérez Hernandez
//CARNET: 2024-1657U

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num1,num2,num3,menor1,menor2,mayor,sumamenores,diferencia;
        //definir scanner
        Scanner entrada = new Scanner (System.in);
try {   //usar try para evitar que se ingrese números no deseados
    // pedir primer número y segundo número
        System.out.println("INGRESE EL PRIMER NUMERO");
            num1 = entrada.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
            num2 = entrada.nextInt(); 
             //while para que no se pueda repetir los números 
            while (num1 == num2) {
                System.out.println("Los numeros deben ser diferentes el uno del otro");
                System.out.println("INGRESE EL SEGUNDO NUMERO");
                num2 = entrada.nextInt();
                //ingresar tres números enteros diferentes el uno al otro
            }
         System.out.println("INGRESE EL TERCER NUMERO");
            num3 = entrada.nextInt(); 
            while (num3 == num2  || num3 == num1) {
                System.out.println("LOS NUMEROS DEBEN SER DIFERENTES EL UNO DEL OTRO");
                System.out.println("INGRESE EL TERCER NUMERO");
                num3 = entrada.nextInt();
                
            }
         //sumar los 2 más pequeños;
         if(num1<num2 && num1<num3){
            menor1=num1;
            if (num2 < num3){
                menor2=num2;
                mayor = num3;
            } //sumar los 2 más grandes 
            else {menor2 =num3;
            mayor = num2;}
          // tres números que sean mayor
         } else if (num2 <num1 && num2< num3){
            menor1=num2;
            if (num1 < num3){
                menor2 = num1;
                mayor = num3;
            }
            else {menor2 = num3;
            mayor = num1;}
           } else {
            menor1= num3;
            if (num1 < num2){
                menor2= num1;
                mayor = num2;
            }
            else {menor2 =num2;
            mayor = num1;}
           }
         
            sumamenores = menor1+menor2;
            diferencia = mayor - menor2;
            System.out.println("La suma de los menores es: "+sumamenores);
            System.out.println("La diferecnia de los mayores es: "+diferencia);
            System.out.println("El mayor es: "+ mayor);
         


       
    } catch (InputMismatchException ex) {
        System.out.println("Debe ingresar obligatoriamente un número entero.");
    }
    }

    @Override
    public String toString() {
        return "App []";
    }
    
}
