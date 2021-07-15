package calculatedistance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almeiro
 */
public class calc {
    
    public float calcularDistanciaClAl(float xc1, float yc1, float xa1, float ya1){
        float d1 = (float) Math.sqrt(Math.pow((xc1-yc1),2)+Math.pow((xa1-ya1),2));
        return d1;
    
    }
    
    public float calcularDistanciaA1Ch(float xa1, float ya1, float xch, float ych){
        float d2 = (float) Math.sqrt(Math.pow((xa1-ya1),2)+Math.pow((xch-ych),2));
        return d2;
    
    }
    
    public float calcularDistanciaChA2(float xch, float ych, float xa2, float ya2){
        float d3 = (float) Math.sqrt(Math.pow((xch-ych),2)+Math.pow((xa2-ya2),2));
        return d3;
    
    }

    public float calcularDistanciaA2C2(float xa2, float ya2, float xc2, float yc2){
        float d4 = (float) Math.sqrt(Math.pow((xa2-ya2),2)+Math.pow((xc2-yc2),2));
        return d4;
    
    }
     
    public float obtenerDistanciaTotal(float d1, float d2, float d3, float d4){
        float dt = d1+d2+d3+d4;
        return dt;
    
    }
}

