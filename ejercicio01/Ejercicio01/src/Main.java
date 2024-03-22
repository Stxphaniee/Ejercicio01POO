import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0, respuesta = 0, num1 = 0, num2 = 0;

        do {
            System.out.println("Ingresa tu opcion:");
            System.out.printf("1. Suma %n 2. Resta %n 3. Multiplicacion %n 4. Division %n 5. Salir %n Que desea realizar ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un numero: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa un numero: ");
                    num2 = sc.nextInt();
                    respuesta = suma(num1, num2);
                    System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + respuesta);
                    break;
                case 2:
                    System.out.println("Ingresa un numero: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa un numero: ");
                    num2 = sc.nextInt();
                    respuesta = resta(num1, num2);
                    System.out.println("La resta de " + num1 + " y " + num2 + " es igual a " + respuesta);
                    break;
                case 3:
                    System.out.println("Ingresa un numero: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa un numero: ");
                    num2 = sc.nextInt();
                    respuesta = multiplicacion(num1, num2);
                    System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es igual a " + respuesta);
                    break;
                case 4:
                    System.out.println("Ingresa un numero: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa un numero: ");
                    num2 = sc.nextInt();
                    if (num2 == 0) {
                        System.out.println("No es posible realizar esta division");
                    } else {
                        respuesta = division(num1, num2);
                        System.out.println("La division de " + num1 + " y " + num2 + " es igual a " + respuesta);
                    }
                    break;
                case 5:
                    System.out.println("Bye...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}

