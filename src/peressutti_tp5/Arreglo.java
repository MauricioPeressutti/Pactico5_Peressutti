/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peressutti_tp5;

/**
 *
 * @author Usuario
 */
public class Arreglo {

    public void sumarLista(int[] arr) {
        int suma = 0;
        for(int i = 0; i < arr.length; i++){
            suma += arr[i];
        }
        
        System.out.println("Suma de los enteros del arreglo: " + suma);
        System.out.println("El promedio es: " + (suma/arr.length));
    }

    public int buscarMayor(int[][] m) {
        int mayor = 0;
        for (int x=0;x<m.length;x++) {
            for (int y=0;y<m[x].length;y++) {
                if (m[x][y] > mayor) {
                    mayor = m[x][y];
                }
            }                
        }
        return mayor;
    }

    public int cuentaVocales(String palabra) {
        int contador = 0;
        for(int x=0;x<palabra.length();x++) {
            if ((palabra.charAt(x)=='a') || (palabra.charAt(x)=='e') || (palabra.charAt(x)=='i') || (palabra.charAt(x)=='o') || (palabra.charAt(x)=='u')){ 
        contador++;
            }
        }
        return contador;
    }

    public int cuentaCaracter(String palabra, char c) {
        int contador = 0;
        
        for(int i =0; i<palabra.length() ; i++){
            if(palabra.charAt(i) == c){
                contador++;
            }
        }
        
        return contador;
    }
}