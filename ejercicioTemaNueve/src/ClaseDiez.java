public class ClaseDiez{

    public void main(String[] args) {                   //**invocamos metodos**
        Coche coche = new Coche();                       //creamos instancia de la clase(objeto)
        coche.Acelerar(50);               //para invocar metodo

        var resultado = suma(2, 5);
        System.out.println(resultado);
    }
//podemos agregar otra funcion dentro de main

    public static int suma(int operandoA, int operandoB) {
        return operandoA + operandoB;
    }

    interface Vehiculo{
        void Acelerar(int cuantaVelocidad);

        void Frenar(int cuantaVelocidad);
    }

    class Coche implements Vehiculo{
        public void Acelerar(int cuantaVelocidad) {
        }

        public void Frenar(int cuantaVelocidad) {
        }
    }
}


