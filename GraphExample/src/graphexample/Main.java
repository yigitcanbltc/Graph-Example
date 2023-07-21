/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author yigit
 */
public class Main {
    
    public static void main(String[] args){
        String dosyaAdi = "graf.txt";
        String line;
        int satir=0,sutun=0,id=0;
        
        try(BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))){
            Graph graph = new Graph();
            while((line = br.readLine())!=null){
                graph.addNode(id);
                id++;
                satir++;
            }
            int [][] matrix = new int [satir][satir];
            int k=0;
            
            br.close();
            BufferedReader b_r = new BufferedReader(new FileReader(dosyaAdi));
            
            while ((line = b_r.readLine()) != null) {
            String[] values = line.split(" ");
            for (int j = 0; j < values.length; j++) {
                matrix[k][j] = Integer.parseInt(values[j]);
            }
            k++;
             }
            
            
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length;j++){
                    if(matrix[i][j]==1){    
                        graph.addEdge(i,j);
                    }                   
                }             
            }
            graph.printNeighbours();
            
        }
        catch(IOException e){
            System.out.println("Dosya Bulunamadi"+ e.getMessage());
        }
        
    }
}
