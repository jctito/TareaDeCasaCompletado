package ejercicio2_2;

    enum TipoPlaneta{
        GASEOSO,
        TERRESTRE,
        ENANO
    }
    public class Planeta {
        private String nombre;
        private int cantidaddeSatelites;
        private double masa;
        private double volumen;
        private double diametro;
        private double destanciaMediadelSol;
        private TipoPlaneta tipo;
        private boolean observableSimpleVista;
        public  Planeta (String nombre,int cantidaddeSatelites, double masa,double volumen,double diametro,double destanciaMediadelSol,TipoPlaneta tipo, boolean observableSimpleVista) {
            this.nombre = nombre;
            this.cantidaddeSatelites = cantidaddeSatelites;
            this.masa = masa;
            this.volumen = volumen;
            this.diametro = diametro;
            this.destanciaMediadelSol = destanciaMediadelSol;
            this.tipo = tipo;
            this.observableSimpleVista = observableSimpleVista;
        }
        public void imprimirInformacion() {
            System.out.println("Nombre: " +nombre);
            System.out.println("Cantidad de Satelites: " +cantidaddeSatelites);
            System.out.println("Masa; " +masa + " Kg. ");
            System.out.println("Volumen: " +volumen + " Kg.");
            System.out.println("Diametro: " +diametro + " Kg.");
            System.out.println("Distancia Media del Sol: " +destanciaMediadelSol+ "Kg");
            System.out.println("Tipo Planeta: " +tipo);
            System.out.println("Es observable a simple vista: " +observableSimpleVista);
        }
        public double calcularDensidad(){
            return masa/ volumen;
        }
        public boolean esPlanetaExterior(){
            return destanciaMediadelSol>100;
        }
    }

