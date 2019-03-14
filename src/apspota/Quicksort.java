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
public class Quicksort {
    

 public int particionar(int lista[],int inicio,int fim){
      
   int i = inicio+1;  
   int j = fim;
   
   while(i <= j){
       
       if(lista[i] < lista[inicio]){
           i++;
       
   }else{
           if(lista[j] > lista[inicio]){
               j--;
           }else{
              int aux = lista[i];
              lista[i]=lista[j];
              lista[j]= aux;
              i++;
              j--;

           }

       }

    } 
   int cont;
     int aux = lista[inicio];
               lista[inicio] = lista[j];
               lista[j] = aux;
               
               cont = +1;
               System.out.println("Quicksort : " + cont);
               
     return j;

 }

    
    public void quickSort(int lista[], int inicio,int fim){
    int meio;

    if (inicio < fim){
        meio = particionar(lista,inicio,fim);
    
     quickSort(lista,inicio,meio-1);
     quickSort(lista,meio+1,fim);
    } 
    }
    
    public void imprime(int[]v){
    
    for(int i =0;i<v.length;i++){
    System.out.println("Vetor ordenado HeapSort: " + v[i] + "");
    
    }
}
}
    

