package co.edu.uniquindio.poo;

public class ZonaParque {
    private String nombre;
    private Material material;
    private FiguraGeometrica figura;

    public FiguraGeometrica getFigura() {
        return figura;
    }

    public void setFigura(FiguraGeometrica figura) {
        this.figura = figura;
    }

    public ZonaParque(String nombre, Material material, FiguraGeometrica figura) {
        this.nombre = nombre;
        this.material = material;
        this.figura = figura;
    }

    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    
    public String getNombre() {
        return nombre;
    }
}