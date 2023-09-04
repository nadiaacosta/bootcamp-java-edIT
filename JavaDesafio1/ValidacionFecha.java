package JavaDesafio1;

import java.util.Scanner;

public class ValidacionFecha {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el dia de la fecha a validar");
	        String dia = scanner.nextLine();
	        
	        System.out.println("Ingrese el mes de la fecha a validar");
	        String mes = scanner.nextLine();
	        
	        System.out.println("Ingrese el año de la fecha a validar");
	        String anio = scanner.nextLine();

	        
	        int diaInt = Integer.parseInt(dia);
	        int mesInt = Integer.parseInt(mes);
	        int anioInt = Integer.parseInt(anio);
	        
	        if (validarFecha(diaInt, mesInt, anioInt)) {
	            System.out.println("La fecha es válida!");
	        } else {
	        	
	            System.out.println("La fecha no es válida");
	        }
	    }
	    
	    
	  public static boolean validarFecha(int dia, int mes, int anio){
	    	
	        if (mes == 2) {
	            if (esBisiesto(anio)) {
	                if (dia < 1 || dia > 29) {
	                    return false;
	                }
	            } else {
	                if (dia < 1 || dia > 28) {
	                    return false;
	                }
	            }
	        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
	            if (dia < 1 || dia > 30) {
	                return false;
	            }
	        } else {
	            if (dia < 1 || dia > 31) {
	                return false;
	            }
	        }
	    	
	    	
	        if (mes < 1 || mes > 12) {
	            return false;
	        }
	        
	        
	    	 if (anio < 1900 || anio > 2099) {
	             return false;
	         }
	    	 
	    	 return true;

	    }
	    
	    
	    public static boolean esBisiesto(int anio) {
	        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	    }
	    
}
