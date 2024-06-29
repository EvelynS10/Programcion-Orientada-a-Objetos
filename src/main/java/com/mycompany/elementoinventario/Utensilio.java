public class Utensilio extends ElementoInventario{
    
    public Utensilio(int identificador, int cantidad, String tipo){
        super(identificador, cantidad);
        this tipo = tipo;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public void setMaterial(String material){
        this.material = material; 
    }
    
    public void descripcionUtensilio(){
        System.out.println(¨el utensilio esta hecho de: ¨ + getMaterial());
    }

}
