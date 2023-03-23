package ejercicioSillas;

public abstract class productoMesilla implements Mesilla{
    private int precio;
    private String tipoMaterial;
    private String color;
    private String modelo;
    private String forma;
    public productoMesilla(int precio, String tipoMaterial, String color, String modelo, String forma) {
        super();
        this.tipoMaterial = tipoMaterial;
        this.color = color;
        this.modelo = modelo;
        this.forma = forma;
    }
    @Override
    public String getTipoMaterial(){
        return tipoMaterial;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String modelo() {
        return modelo;
    }

    @Override
    public String getForma() {
        return forma;
    }
    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 0.85;
    }
}

