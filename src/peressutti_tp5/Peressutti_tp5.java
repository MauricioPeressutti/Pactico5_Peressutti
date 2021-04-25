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
public class Peressutti_tp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        int arr[]= {10 , 3 , 8};
        int[][]  matriz = {{1,7},{3,8}};
        String sPalabra ="matambre";
        Arreglo miArreglo = new Arreglo();
        
        
       miArreglo.sumarLista(arr);
       
       System.out.println("" + miArreglo.buscarMayor(matriz));
       
       System.out.println("La palabra tiene: " + miArreglo.cuentaVocales(sPalabra));
       
       System.out.println("El caracter se repite: " + miArreglo.cuentaCaracter(sPalabra, 'm'));
        
    }
    
}
