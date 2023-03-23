package ejercicioSillas;

public abstract class productoSofa implements Sofa{
    private int precio;
    private String cojin;
    private String marca;
    private String fabricante;


    public productoSofa(int precio, String cojin, String marca, String fabricante) {
        super();
        this.cojin = cojin;
        this.marca = marca;
        this.fabricante = fabricante;
    }



    @Override
    public String getCojin() {
        return cojin;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

}
