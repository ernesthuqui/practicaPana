package ejercicios1;

import java.util.Scanner;
import java.lang.Math;

/*
EJ. #1

INTEGRANTES
- Arteaga Arteaga Doménica Yanelly
- Mejía Chávez Jefferson Paúl
- Molina Guillén Fernando José
- Serrano Macías Ernesto David
- Zambrano Bravo Merly Paola

Paralelo: 'B'
 */
public class Ejercicios1 {

	public static void main(String[] args) {
//EJERCICIO 1
		double montoIva, monto, total, valorcliente, cambio;
		Scanner in = new Scanner(System.in);
		double totalCaja = -1;

		for (int i = 0; i < 2; i++) {
			System.out.println("Número de compra: " + i);
			System.out.print("Ingresa el monto de venta: ");

			monto = in.nextDouble();
			montoIva = (monto * 0.12);
			montoIva = (double) Math.round(montoIva * 100) / 100;
			total = monto + montoIva;
			System.out.println("IVA: " + montoIva);

			System.out.println("El total a pagar es: " + total);
			System.out.print("Ingresa el efectivo recibido: ");

			valorcliente = in.nextDouble();
			cambio = valorcliente - total;
			cambio = (double) Math.round(cambio * 100) / 100;
			System.out.println("Reciba su cambio: " + Math.abs(cambio));
			totalCaja += total;
		}
		System.out.println("Caja: " + totalCaja);


//EJERCICIO 2

        String nombre;
        char[] palindromo;
        int x= 0, y;

        System.out.print("Bienvenido, ingrese la palabra a analizar: ");
        nombre = in.next();
        //Cambiar todo a minúscula para que no exista ningún error al analizar
        nombre = nombre.toLowerCase();
        System.out.println(nombre + " Se analizará y se identifica como: ");
        palindromo = nombre.toCharArray();
        y= palindromo.length - 1;
        while (x < y) {
            if (palindromo[x] == palindromo[y]) {
                x--;
                y++;
            } else {
                System.out.println("NO ES PALÍNDROMO");
                break;
            }
        }
        if (x == y) {
            System.out.println("SI ES PALÍNDROMO");
        }
    

//EJERCICIO 3

		float radio, area, longitud;
		System.out.println("|------Longitud y Area------|");
		System.out.println("ingrese el radio de la circuferncia");
		radio = in.nextFloat();

		area = (float) (3.14 * (radio * radio));
		System.out.println("\nEl area es: " + area);

		longitud = (float) (2 * (3.14 * radio));
		System.out.println("\nLa longitud es: " + longitud);
	}

}
