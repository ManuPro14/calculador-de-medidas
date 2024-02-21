package Universidad;
import java.util.Scanner;

public class convertidor_de_medidas {
    public static void main(String[] args) {

        Scanner umedida = new Scanner(System.in);
        System.out.println("Ingrese qué tipo de medida desea convertir: celcius, farenheit, metros, kilometros, libras, kilogramos");
        String medida = umedida.nextLine();

        if(medida.equals("celcius")){
            System.out.println("Ingrese la cantidad de grados celcius que desea convertir");
            double celcius = umedida.nextDouble();
            double farenheit = (celcius * 9/5) + 32;
            System.out.println(celcius + " grados celcius son " + farenheit + " grados farenheit");
        } else if (medida.equals("farenheit")) {
            System.out.println("Ingrese la cantidad de grados farenheit que desea convertir");
            double farenheit = umedida.nextDouble();
            double celcius = (farenheit - 32) * 5/9;
            System.out.println(farenheit + " grados farenheit son " + celcius + " grados celcius");
        } else if (medida.equals("metros")) {
            System.out.println("Ingrese la cantidad de metros que desea convertir");
            double metros = umedida.nextDouble();
            double kilometros = metros / 1000;
            System.out.println(metros + " metros son " + kilometros + " kilometros");
        } else if (medida.equals("kilometros")) {
            System.out.println("Ingrese la cantidad de kilometros que desea convertir");
            double kilometros = umedida.nextDouble();
            double metros = kilometros * 1000;
            System.out.println(kilometros + " kilometros son " + metros + " metros");
        } else if (medida.equals("libras")) {
            System.out.println("Ingrese la cantidad de libras que desea convertir");
            double libras = umedida.nextDouble();
            double kilogramos = libras / 2.2046;
            System.out.println(libras + " libras son " + kilogramos + " kilogramos");
        } else if (medida.equals("kilogramos")) {
            System.out.println("Ingrese la cantidad de kilogramos que desea convertir");
            double kilogramos = umedida.nextDouble();
            double libras = kilogramos * 2.2046;
            System.out.println(kilogramos + " kilogramos son " + libras + " libras");
        } else {
            System.out.println("La medida ingresada no es válida");
        }

        Scanner respuesta = new Scanner(System.in);
        System.out.println("Desea convertir otra medida? si/no");
        String respuestas = respuesta.nextLine();
        if(respuestas.equals("si")) {
            //que repita el programa desde el inicio
            convertidor_de_medidas.main(args);
        }else{
            System.out.println("Gracias por usar el programa");
        }
    }
}
