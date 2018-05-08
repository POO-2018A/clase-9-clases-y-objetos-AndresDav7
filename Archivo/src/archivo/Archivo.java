package archivo;

public class Archivo {
    
    private String nombre;
    private String tipo;
    private String fechaCreacion;
    private String contenido;
    
    public Archivo(String nombre, String fechaCreacion){
        this.nombre = nombre; 
        this.fechaCreacion = fechaCreacion;
    }
    
    public Archivo(String nombre, String tipo, String fechaCreacion){
        this.nombre=nombre;
        this.fechaCreacion = fechaCreacion;
        this.tipo=tipo;     
    }
    
    public Archivo(String nombre, String tipo, String fechaCreacion, String contenido){
        this.nombre=nombre;
        this.fechaCreacion = fechaCreacion;
        this.tipo=tipo;
        this.contenido=contenido;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getFechaCreacion(){
        return fechaCreacion;
    }
    
    public String getTipo(){
	return tipo;
    }
   
    public String getContenido(){
        return contenido;
    }

    public static void main(String[] args) {
        
        System.out.println(" ****** Deber Archivo ******");
      
        Archivo objeto1 = new Archivo("Deber","22/07/1992");
        System.out.println(" ****** Primer Objeto ******");
        System.out.println("Nombre Archivo = " + objeto1.getNombre());
        System.out.println("Fecha Creacion = " + objeto1.getFechaCreacion());
        
        Archivo objeto2 = new Archivo("Programa","ejecutable","26/11/2013");
        System.out.println(" ****** Segundo Objeto ****** ");
        System.out.println("Nombre Archivo = " + objeto2.getNombre());
        System.out.println("Fecha Creacion = " + objeto2.getFechaCreacion());
        System.out.println("Tipo Archivo = " + objeto2.getTipo());
  
        Archivo objeto3 = new Archivo("Compilador","ejecutable","27/07/2016","Completo");
        System.out.println(" ****** Tercer Objeto ******");       
        System.out.println("Nombre Archivo = " + objeto3.getNombre());
        System.out.println("Fecha Creacion = " + objeto3.getFechaCreacion());
        System.out.println("Tipo Archivo = " + objeto3.getTipo());
        System.out.println("Contenido = " + objeto3.getContenido());
        
    }
    
}