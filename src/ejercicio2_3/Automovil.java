package ejercicio2_3;

    public class Automovil {
        private String marca;
        private int modelo;
        private double motor;
        private  String tipodecombustible;
        private String tipoAutomovil;
        private int numeroPuertas;
        private int cantidadAsientos;
        private int velocidadMaxima;
        private String color;
        private int velocidadActual;
        public Automovil(String marca, int modelo, double motor, String tipodecombustible, String tipoAutomovil, int numeroPuertas,int cantidadAsientos,int velocidadMaxima,String color ){
            this.marca=marca;
            this.modelo=modelo;
            this.motor=motor;
            this.tipodecombustible=tipodecombustible;
            this.tipoAutomovil=tipoAutomovil;
            this.numeroPuertas=numeroPuertas;
            this.cantidadAsientos=cantidadAsientos;
            this.velocidadMaxima=velocidadMaxima;
            this.color=color;
            this.velocidadActual= 0;
        }
        public int getVelocidadActual(){
            return velocidadActual;
        }
        public void setVelocidadActual(int velocidadActual){
            this.velocidadActual=velocidadActual;
        }
        public void acelerar(int cantidad){
            if(velocidadActual+cantidad <= velocidadMaxima){
                velocidadActual += cantidad;
                System.out.println("Velocidad actual: " +velocidadActual+" Km/h");
            }else{
                System.out.println("No se puede acelerar mas alla de la velocidad maxima ");
            }
        }
        public void desacelerar (int cantidad){
            if(velocidadActual-cantidad>= 0){
                velocidadActual -= cantidad;
                System.out.println("Velocidad actual: " +velocidadActual+ " Km/h");
            }else{
                System.out.println("No se puede desacelerar a una velocidad negativa. ");
            }
        }
        public void frenar(){
            velocidadActual =0;
            System.out.println("El automovil ha frenado. Velocidad acual: " +velocidadActual+ " Km/h");
        }
        public double calcularTiempoEstimadoLlegada(int distancia){
            if(velocidadActual>0){
                return (double) distancia / velocidadActual;
            }else{
                return -1;
            }
        }
        public void mostrarInformacio(){
            System.out.println("Marca: " +marca);
            System.out.println("Modelo: " +modelo);
            System.out.println("Tipo de combustible: " +tipodecombustible);
            System.out.println("Tipo de Automivil: " +tipoAutomovil);
            System.out.println("Numero de puertas: " +numeroPuertas);
            System.out.println("Numero de Asientos: " +cantidadAsientos);
            System.out.println("Velocidad Maxima: " +velocidadMaxima + " Km/h");
            System.out.println("Velocidad Acutal: " +velocidadActual + "Km/h");
        }
}
