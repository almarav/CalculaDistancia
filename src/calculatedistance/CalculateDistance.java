/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatedistance;

import java.util.Scanner;

/**
 *
 * @author almeiro
 */
public class CalculateDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        calc distancia = new calc();
         Scanner sn = new Scanner(System.in);
        
        System.out.println("Digite coordenadas para celular en xc1: ");
        float xc1 = sn.nextInt();
        System.out.println("Digite coordenadas para celular en yc1: ");
        float yc1 = sn.nextInt();
        System.out.println("Digite coordenadas para antena en xa1: ");
        float xa1 = sn.nextInt();
        System.out.println("Digite coordenadas para antena en ya1: ");
        float ya1 = sn.nextInt();
        System.out.println("Digite coordenadas para central holi en xch: ");
        float xch = sn.nextInt();
        System.out.println("Digite coordenadas para central holi en ych: ");
        float ych = sn.nextInt();
        System.out.println("Digite coordenadas para antena en xa2: ");
        float xa2 = sn.nextInt();
        System.out.println("Digite coordenadas para antena en ya2: ");
        float ya2 = sn.nextInt();
        System.out.println("Digite coordenadas para xc2: ");
        float xc2 = sn.nextInt();
        System.out.println("Digite coordenadas para yc2: ");
        float yc2 = sn.nextInt();
        
        float d1 = distancia.calcularDistanciaClAl(xc1,yc1,xa1,ya1);
        float d2 = distancia.calcularDistanciaA1Ch(xa1,ya1,xch,ych);
        float d3 = distancia.calcularDistanciaChA2(xch,ych,xa2,ya2);
        float d4 = distancia.calcularDistanciaA2C2(xa2,ya2,xc2,yc2);
        
        float distanciaTotal = distancia.obtenerDistanciaTotal(d1, d2, d3, d4);
        
        System.out.println("La distancia total es: " + distanciaTotal);
        
    
    
      
        
        
    }
    

}

