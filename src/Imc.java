import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas "));

        Persona[] personas = new Persona[cantidadPersonas];
        Double [] imc = new Double [cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.println("Ingrese el nombre: ");
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
            System.out.println("Ingrese la altura (en metros): ");
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese si altura en metros"));
            System.out.println("Ingrese el peso (en kilogramos): ");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en Kilogramos"));

            personas[i] = new Persona(nombre, altura, peso);
        }

        System.out.println("Resultados:");

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("IMC: " + personas[i].calcularIMC(imc));
            System.out.println();
        }
    }
}

class Persona {
    private String nombre;
    private double altura;
    private double peso;

    public Persona(String nombre, double altura, double peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String calcularIMC(Double [] imc) {
    	
    	double calculo = peso / (altura * altura);
    	String result = null;
    	if (calculo < 18) {
    		result =  "Anorexia";
    	}
    	else if (calculo>= 18 && calculo < 20) {
    		result = "Delgadez";
    	}
    	else if (calculo >= 20 && calculo < 27) {
    		result =  "Normalidad";
    	}
    	else if (calculo >= 27 && calculo < 30	) {
    		result = "Obesidad (Grado 1)";
    	}
    	else if (calculo >= 30 && calculo < 35	) {
    		result = "Obesidad (Grado 2)";
    	}
    	else if (calculo >= 35 && calculo < 40	) {
    		result = "Obesidad (Grado 1)";
    	}
    	else if (calculo >= 40	) {
    		result = "Obesidad Morbida";
    	}
    	
    	return result;
    }



	}


