public class Main1{

    public void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }
    class Coche{
        public int puertas = 0;

        public void AgregarPuerta() {
            this.puertas++;
        }
    }
}
