public class Automovil {
    private String marca;
    private String modelo;
    private int anio;

    public static final int ANIO_PRIMER_AUTOMOVIL = 1886;//constante

    //constructor de automovil
    public Automovil(String marca, String modelo, int anio) {

        //se asegura de que no se deje vacio
        if (marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("marca no puede ser nulo ni estar vacio");
        }

        //se asegura de que no se deje vacio
        if (modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("modelo no puede ser nulo ni estar vacio");
        }

        // se asegura de que no se ponga un año antes del primer automovil
        if (anio < ANIO_PRIMER_AUTOMOVIL){
            throw new IllegalArgumentException("año imposible McFly");
        }

        this.marca = marca;//asigna la marca
        this.modelo = modelo;//asigna el modelo
        this.anio = anio;//asigna el año
    }

    //muestra informacion
    public void mostrarInformacion(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Año fabricacion: " + anio);
        System.out.println("Años desde el primer automovil: " + (anio-ANIO_PRIMER_AUTOMOVIL));
    }

    //recoge la marca
    public String getMarca() {
        return marca;
    }

    //pone la marca
    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("marca no puede ser nulo ni estar vacio");
        }
        this.marca = marca;
    }

    //recoge el modelo
    public String getModelo() {
        return modelo;
    }

    //pone el modelo
    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("modelo no puede ser nulo ni estar vacio");
        }
        this.modelo = modelo;
    }

    //recoge el año
    public int getAnio() {
        return anio;
    }

    //pone el año
    public void setAnio(int anio) {
        if (anio < ANIO_PRIMER_AUTOMOVIL){
            throw new IllegalArgumentException("año no puede ser antes del primer automovil");
        }
        this.anio = anio;
    }

    //cambia el toString
    @Override
    public String toString() {
        return "automovil [" +
                "marca=" + marca +
                ", modelo=" + modelo +
                ", anio=" + anio + "]";
    }
}