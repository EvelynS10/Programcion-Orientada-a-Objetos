public class Ingrediente extends ElementoInventario {
    String nombre;
    private String fechaCaducidad;
    
    //Constructor
    public Ingrediente(int identificador, int cantidad, String nombre){
        super(identificador,cantidad);
        this.nombre = nombre;     
    }
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    
    public void setFechaCaducidad(String fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public void verificarCaducidad(){
        System.out.println(¨la fecha de caducidad es: ¨+getFechaCaducidad());
    }
}
