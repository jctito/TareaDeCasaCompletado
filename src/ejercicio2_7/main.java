package ejercicio2_7;
    public class main {
        public static void main(String[] args) {
            Pelicula peli1 = new Pelicula("Gandhi","Richard Attenborough", Pelicula.tipo.ACCION, Pelicula.tipo.DRAMA,Pelicula.tipo.SUSPENSO,Pelicula.tipo.COMEDIA,191,1982,8.3);
            Pelicula peli2 = new Pelicula("Thor","Kennet Branagh", Pelicula.tipo.ACCION, Pelicula.tipo.SUSPENSO,Pelicula.tipo.COMEDIA,Pelicula.tipo.SUSPENSO, 115,2011,7.0);

            peli1.imprimir();
            System.out.println();
            peli2.imprimir();
            System.out.println();
            System.out.println("La Pelicula "+ peli1.getNombre()+" es epica: "+peli1.esPeliculaEpica());
            System.out.println();
            System.out.println("La Pelicula "+peli2.getNombre()+" es epica: "+peli2.esPeliculaEpica());
            System.out.println();
            System.out.println("La pelicula "+peli1.getNombre()+" y la pelicula "+peli2.getNombre()+" son similares: "+peli1.esSimilar(peli2));
            System.out.println();
            System.out.println(peli1.imprimircartel());

        }
    }
