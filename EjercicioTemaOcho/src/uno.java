public class uno {

    public class main {

        public void main(String[] args) {
            Coche coche = new Coche();
            coche.velocidadMaxima = 100;
            coche.matricula = "AF123AB";
            CocheElectrico cocheElectrico = new CocheElectrico();
            cocheElectrico.matricula = "AE123AB";
            cocheElectrico.velocidadMaxima = 80;
            System.out.println(cocheElectrico.comprobarMatricula("XXX"));
        }
    }

    class Vehiculo {

        int velocidadMaxima;
        String matricula;

        public boolean comprobarMatricula(String matricula) {
            if (matricula == "XXX") {
                return true;
            }
            return false;
        }
    }

    class Coche extends Vehiculo {} //asi hemos creado una clase hija

    class CocheElectrico extends Coche {} //asi hemos creado una clase hija, de la hija
}