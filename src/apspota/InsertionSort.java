/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apspota;

/**
 *
 * @author gilvaneide.santos
 */
public class InsertionSort {
   
    public void Ordena(int []v){
        
    int cont = 0;
    for (int i = 0; i < v.length; i++) {
                
    int a = v[i];
    
    for (int j = i - 1; j >= 0 && v[j] > a; j--){
                        
     v[j + 1] = v[j];
     v[j] = a;
     cont = +1;
     
        System.out.println("Troca" + cont);
     
}
                }
    }
    
    public void imprimeVetor(int []v){
    
    for(int i =0;i<v.length;i++){
       System.out.println("Vetor ordenado Insertion Sort: " + v[i] + "");
}
    }
}
