package ejercicioSillas;

public abstract class productoSilla implements Silla {
    private int precio;
    private String modelo;
    private String color;
    private int numeroPatas;

    public productoSilla(int precio, int numeroPatas,String modelo, String color) {
        super();
        this.modelo = modelo;
        this.color = color;
    }


    @Override
    public int getPrecio() {
        return precio;
    }
    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }

    public int numeroPatas() {
        return 4;
    }
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    }


