package ejercicio2_3;

    public class main {
        public static void main(String[] args) {
            Automovil automovil = new Automovil("toyota", 2023, 2.0, "Gasolina", "Suv", 4, 5, 200, "Azul");
            automovil.mostrarInformacio();
            automovil.setVelocidadActual(100);
            automovil.acelerar(20);
            System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " Km/h");
            automovil.desacelerar(50);
            System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " Km/h");
            automovil.frenar();
            System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " km/h");
            double tiempoEstimado = automovil.calcularTiempoEstimadoLlegada(500);
            if (tiempoEstimado >= 0) {
                System.out.println("Tiempo estimado de llegada: " + tiempoEstimado + " horas.");
            }
        }
    }
