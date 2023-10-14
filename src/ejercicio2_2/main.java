package ejercicio2_2;

    import static ejercicio2_2.TipoPlaneta.GASEOSO;
import static ejercicio2_2.TipoPlaneta.TERRESTRE;

    public class main {
        public static void main(String[] args) {
            Planeta planeta1= new Planeta("Marte", 2,6.42,1.63,6779,225, TipoPlaneta.TERRESTRE,true);
            Planeta planeta2= new Planeta("Jupiter", 79,1.89,1.43,139822,778,TipoPlaneta.GASEOSO,true );

            System.out.println("Planeta 1: ");
            planeta1.imprimirInformacion();
            System.out.println("Densidad: " +planeta1.calcularDensidad()+" Kg/m3");
            System.out.println("¿Es un planeta exterior? " +planeta1.esPlanetaExterior());

            System.out.println("\n Planeta 2: ");
            planeta2.imprimirInformacion();
            System.out.println("Densidad: " +planeta2.calcularDensidad()+ " Kg/m3");
            System.out.println("¿Es un planeta Exterior? " +planeta2.esPlanetaExterior());
        }
    }

