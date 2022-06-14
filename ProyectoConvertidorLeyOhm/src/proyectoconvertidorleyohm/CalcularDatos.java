//Autores: Juan Jutinico, Rubiel Alzate, Vanesa Rojas.

package proyectoconvertidorleyohm;
import javax.swing.*;

public class CalcularDatos {
    
    double voltaje, corriente, resistencia;
    double potencia;
    
    public CalcularDatos(){
    }
    
    
    //inicio metodo voltaje
    public void voltaje(double i, double r){
        voltaje=i*r;
    }//fin voltaje
    
    
    
    
    //inicio metodo corriente
    public void corriente(double v, double r){
    
    if(r!=0){
    corriente=v/r;
    }
    else{ 
    JOptionPane.showMessageDialog(null, "La resistencia debe ser distinta de 0","Error de calculo",JOptionPane.ERROR_MESSAGE);
    }
    }//fin corrienete
    
    
    
    
    //inicio metodo resistencia
    public void resistencia(double v, double i){
    
       if(i!=0){
       resistencia=v/i;
       }  
       else{
       JOptionPane.showMessageDialog(null, "La corriente debe ser distinta de 0","Error de calculo",JOptionPane.ERROR_MESSAGE);
       }
    }//fin resistencia
    
    
    
    
    //inicio metodo potencia
    public void potencia(double v, double i, double r, int n1, int n2, int n3){
    
    if(n1 == 1){
    potencia=i*i*r;
    }
    if(n2 == 1){
    potencia=(v*v)/r;
    }
    if(n3 == 1){
    potencia=i*v;
    }
    
    }//fin potencia
}
