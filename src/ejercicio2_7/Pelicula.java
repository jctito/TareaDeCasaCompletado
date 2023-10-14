package ejercicio2_7;
    public class Pelicula {
        private String nombre, director;
        public enum tipo {ACCION,COMEDIA,DRAMA,SUSPENSO};
        tipo genero;
        enum  tipo2 {ACCION,COMEDIA,DRAMA,SUSPENSO}
        tipo genero2;
        enum tipo3{ACCION,COMEDIA,DRAMA,SUSPENSO}
        tipo genero3;
        private int duracion;
        private int año;
        private double calificacion;
        // constructores

        public Pelicula(String nombre, String director, tipo accion, tipo genero, tipo genero2, tipo genero3, int duracion, int año, double calificacion) {
            this.nombre = nombre;
            this.director = director;
            this.genero = genero;
            this.genero2 = genero2 ;
            this.genero3 = genero3;
            this.duracion = duracion;
            this.año = año;
            this.calificacion = calificacion;
        }


        //getter setters


        public tipo getGenero2() {
            return genero2;
        }

        public void setGenero2(tipo genero2) {
            this.genero2 = genero2;
        }

        public tipo getGenero3() {
            return genero3;
        }

        public void setGenero3(tipo genero3) {
            this.genero3 = genero3;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public tipo getGenero() {
            return genero;
        }

        public void setGenero(tipo genero) {
            this.genero = genero;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public double getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(double calificacion) {
            this.calificacion = calificacion;
        }

        //metodos
        public void imprimir(){
            System.out.println("Nombre: "+nombre);
            System.out.println("Director: "+director);
            System.out.println("Genero: "+genero);
            System.out.println("Duracion: "+duracion);
            System.out.println("Año: "+año);
            System.out.println("Calificacion: "+ calificacion);
        }
        boolean esPeliculaEpica(){
            if (duracion>=180){
                return true;
            }else {
                return false;
            }
        }

        private String calcularValoracion (){
            if (calificacion>=0 && calificacion<=2){
                return "*";
            } else if (calificacion>2 && calificacion<=5) {
                return "**";
            } else if (calificacion>5 && calificacion <=7) {
                return "***";
            } else if (calificacion>7 && calificacion<=8) {
                return "****";
            } else if (calificacion>8 && calificacion<=10) {
                return "*****";
            }else {
                return "Sin valorar.";
            }
        }
        boolean esSimilar(Pelicula pelicula){
            if (pelicula.genero ==genero && pelicula.calcularValoracion()==calcularValoracion()){
                return true;
            } else {
                return false;
            }
        }
        public  String imprimircartel(){
            System.out.println("---- "+nombre+" ----");
            System.out.println(calcularValoracion());
            System.out.println(genero+" - "+genero2+" - "+genero3);
            System.out.println(director);
            return " ";
        }

    }

