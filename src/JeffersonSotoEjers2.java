import java.util.Scanner;

public class JeffersonSotoEjers2 {

    private Scanner scanner;

    public JeffersonSotoEjers2() {
        scanner = new Scanner(System.in);
    }

    // Utilizando estructura de control: if-else

    public void determinarSigno() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    public void verificarParImpar() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public void mostrarMayorDeTres() {
        System.out.println("Ingrese tres números:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }

    public void determinarBisiesto() {
        System.out.println("Ingrese un año:");
        int anio = scanner.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }

    // Utilizando estructura de control: bucles while

    public void imprimirNumerosAscendentes() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }

    public void imprimirNumerosHasta() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }
    }

    public void sumarNumerosPositivos() {
        int suma = 0;
        while (true) {
            System.out.println("Ingrese un número (negativo para salir):");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            suma += numero;
        }
        System.out.println("La suma de los números positivos es: " + suma);
    }

    public void generarSecuenciaFibonacci() {
        System.out.println("Ingrese un número:");
        int limite = scanner.nextInt();
        int a = 0, b = 1;
        while (a <= limite) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    // Utilizando estructura de control: bucles for

    public void imprimirNumerosPares() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public void mostrarTablaMultiplicar() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public void calcularSumaParesHasta() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        int suma = 0;
        for (int i = 2; i <= numero; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares es: " + suma);
    }

    public void calcularFactorial() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static void main(String[] args) {
        JeffersonSotoEjers2 ejercicios = new JeffersonSotoEjers2();

        // Llama a cada método según sea necesario para probar
        ejercicios.determinarSigno();
        ejercicios.verificarParImpar();
        ejercicios.mostrarMayorDeTres();
        ejercicios.determinarBisiesto();
        ejercicios.imprimirNumerosAscendentes();
        ejercicios.imprimirNumerosHasta();
        ejercicios.sumarNumerosPositivos();
        ejercicios.generarSecuenciaFibonacci();
        ejercicios.imprimirNumerosPares();
        ejercicios.mostrarTablaMultiplicar();
        ejercicios.calcularSumaParesHasta();
        ejercicios.calcularFactorial();
    }
}
