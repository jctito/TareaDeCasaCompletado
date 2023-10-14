package ejercicio2_4;
public class main{
        public static void main(String[] args) {
            Circulo circulo =new Circulo(2);
            rectangulo rectangulo1=new rectangulo(1,2);
            Cuadrado cuadrado= new Cuadrado(3);
            TrianguloRectangulo trianguloRectangulo= new TrianguloRectangulo(3,5);

            System.out.println("Area del circulo: " +circulo.calcularArea());
            System.out.println("Perimetro del circulo: " +circulo.calcularPerimetro());

            System.out.println("\nArea del rectangulo: " +rectangulo1.calcularArea());
            System.out.println("Perimetro del rectangulo: " +rectangulo1.calcularPerimetro());

            System.out.println("\nArea del cuadrado: " +cuadrado.calcularArea());
            System.out.println("Perimetro del cudrado: " +cuadrado.calcularPerimetro());

            System.out.println("\nArea del triangulo rectangulo: " +trianguloRectangulo.calcularArea());
            System.out.println("Perimetro del triangulo rectangulo: " +trianguloRectangulo.calcularPerimetro());
            System.out.println("Tipo de triangulo: " +trianguloRectangulo.detrminarTipo());
        }
    }

