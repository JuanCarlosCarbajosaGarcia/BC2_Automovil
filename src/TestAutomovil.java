public class TestAutomovil {
    public static void main(String[] args) {
        Automovil coche = new Automovil("volvo","XC40",2017);

        coche.mostrarInformacion();

        System.out.println("año primer automovil: "+Automovil.ANIO_PRIMER_AUTOMOVIL);

        System.out.println(coche);

        System.out.println("marca: "+coche.getMarca());
        System.out.println("modelo: "+coche.getModelo());
        System.out.println("año: "+coche.getAnio());

        //coche.setAnio(1850);
        //coche.setMarca("");
        //coche.setModelo("");
    }
}
