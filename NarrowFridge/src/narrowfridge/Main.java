/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narrowfridge;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
   private static final Scanner teclado = new Scanner(System.in); // lo dejamos afuera por codeforce
    public static void main(String[] args) {
        refrigerador();
    }
    
    public static void refrigerador() {
    	int nBotellas = teclado.nextInt();
    	int h = teclado.nextInt();
    	int[] botellas = new int[nBotellas];
    	for(int i = 0;i < nBotellas;i++) {
    		botellas[i] = teclado.nextInt();
    	}
    	
    	int left = 0;
    	int right = nBotellas + 1;
    	while(right - left > 1) {
    		int mid = (right + left )/ 2; //
    		int[] part = Arrays.copyOf(botellas, mid);
    		if(verificarArray(part, h)) {
    			left = mid;
    		} else {
    			right = mid;
    		}
    	}
    	System.out.println(left);
    }
    
    public static boolean verificarArray(int[] arreglo, long altura) {// lo dejamos como long para las pruebas de codeforce
    	Arrays.sort(arreglo);
    	for(int i = arreglo.length - 1;i >= 0;i -= 2) {
    		altura -= arreglo[i];
    	}
    	return altura >= 0;
    }
}