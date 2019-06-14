
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Jara
 */
public class Alyona {
    
        
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6};
        System.out.println(agregarBotellas(arreglo,6));
    }
    
    /**
     * Metodo que ordena el arreglo inicial de enteros. Es necesario para realizar el arreglo.
     * @param botellas es el arreglo ingresado para la prueba
     * @return retorna el mismo arreglo anterior pero ordenado.
     */
    public static int[] ordenar(int[] botellas){
        Arrays.sort(botellas);
        return botellas;                
    }
    
    /**
     * Metodo que agrega las botellas.
     * @param botellas esa el arreglo ordenado de los tamaños de las botellas.
     * @param tamaño es la altura máxima de donde se guardarán las botellas.
     * @return retorna el numero de botellas que se pudieron guardar.
     */
    public static int agregarBotellas(int[] botellas, int tamaño){
        boolean validador = true;
        int altura = 0;
        int numeroBotellas = 0;
        for(int i=0;i<botellas.length;i++){
            if(validador==true){
                altura+=botellas[i];
                if(altura<=tamaño){
                    numeroBotellas++;
                    validador = false;
                }else{
                    return numeroBotellas;
                }
            }else{
                altura+=botellas[i]-botellas[i-1];
                if(altura<=tamaño){
                    numeroBotellas++;
                    validador = true;
                }else{
                    return numeroBotellas;
                }
            }
        }
        return numeroBotellas;
    }
    
}
