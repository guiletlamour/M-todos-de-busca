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
public class BubbleSort {
   
    
public  void Ordena(int []v) {

     int cont;
         for (int i =0; i < v.length;i++){
        if (i!= v.length-1){
            if (!(v[i]<= v[i+1])){
                int aux = v[i];
                v[i] = v[i+1];
                v[i+1] = aux;    
                cont =  +1;
                System.out.println("Troca " + cont);
}
        }
         }
         
         if (!ordenadoSN(v)) {
 
          Ordena(v);
 

     }   
  
}

public boolean ordenadoSN(int[] v) {
 
        for (int i = 0; i < v.length; i++) {
        
            if (i != v.length - 1) {
              
                if (!(v[i] <= v[i + 1])) {
 
                    return false;
                }
            }
 
        }
        return true;
    }

public void imprime(int []v){
    
    for(int i =0;i<v.length;i++){
       System.out.println("Vetor ordenado BubbleSort: " + v[i] + "");
    }
}
}