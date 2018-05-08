package persona;

import java.util.Scanner;

public class Persona {
    
    private String cedula;   
    
    public String getCedula(){
        return this.cedula;
    }
    
    public static int calcularDecena(int decena){
    int calcular;
    calcular = decena - (decena%10) + 10;
    return calcular;
}
    
    public void setCedula(String cedula){
        if(cedulaValida(cedula)){
            this.cedula = cedula;
            System.out.println("Cedula Valida");
        }else {
            System.out.println("Cédula no válida");
        }
    }
    
    private boolean cedulaValida(String cedula){
        //TODO implementar algoritmo de validacion cedula
      int coeficientes[] = {2,1,2,1,2,1,2,1,2};
      int sumT = 0;
       
      for(int i=0;i<9;i++){
           int m = cedula.charAt(i);
           
            
            if(m == 49){
                m = 1;
            }else if (m == 50){
                m = 2;
            }else  if (m == 51){
                m = 3;
            }else if (m == 52){
                m = 4;
            }else if (m == 53){
                m = 5;
            }else if (m == 54){
                m = 6;
            }else if (m == 55){
                m = 7;
            }else if (m == 56){
                m = 8;
            }else if (m == 57){
                m = 9;
            }else if (m == 48){
                m = 0;
            }
                    
            int n = m * coeficientes[i];
            
            if(n >9){
                n=n-9;
            }
       
            sumT = sumT + n;
            
            System.out.println("Digito" + (i+1) + " ="+ n);
            
            
        }
      System.out.println("Sumta total es : " + sumT);
      
      int last = calcularDecena(sumT) - sumT;
      
        System.out.println("El ultimo digito es = " + last);
        int u = cedula.charAt(9);
        if(u == 49){
                u = 1;
            }else if (u == 50){
                u = 2;
            }else  if (u == 51){
                u = 3;
            }else if (u == 52){
                u = 4;
            }else if (u == 53){
                u = 5;
            }else if (u == 54){
                u = 6;
            }else if (u == 55){
                u = 7;
            }else if (u == 56){
                u = 8;
            }else if (u == 57){
                u = 9;
            }else if (u == 48){
                u = 0;
            }
        
        if(last == u){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        
       Persona p = new Persona();   //Constructor de clase Persona
       
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Ingrese el Numero de cedula: ");
       String recibeCedula = scan.next();
       
       p.setCedula(recibeCedula);      
        
    }
    
}
