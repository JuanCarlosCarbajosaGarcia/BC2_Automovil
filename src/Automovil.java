public class Automovil {
    private String marca;
    private String modelo;
    private int anio;

    public static final int ANIO_PRIMER_AUTOMOVIL = 1886;

    public Automovil(String marca, String modelo, int anio) {

        if (marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("marca no puede ser nulo ni estar vacio");
        }

        if (modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("modelo no puede ser nulo ni estar vacio");
        }

        if (anio < ANIO_PRIMER_AUTOMOVIL){
            throw new IllegalArgumentException("año imposible");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInformacion(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Año fabricacion: " + anio);
        System.out.println("Años desde el primer automovil: " + (anio-ANIO_PRIMER_AUTOMOVIL));
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("marca no puede ser nulo ni estar vacio");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("modelo no puede ser nulo ni estar vacio");
        }
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < ANIO_PRIMER_AUTOMOVIL){
            throw new IllegalArgumentException("año no puede ser antes del primer automovil");
        }
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "automovil [" +
                "marca=" + marca +
                ", modelo=" + modelo +
                ", anio=" + anio + "]";
    }
}