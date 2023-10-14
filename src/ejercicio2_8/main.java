package ejercicio2_8;

public class main {
   public static void main(String[] args) {
      Avion a1= new Avion("airbus",4);
      Avion a2;
      Avion a3 =new Avion("Boeign",4);
      a2=a1;
      a1.imprimirFabricante();
      a2.imprimirFabricante();
      a1.setFabricante("Douglas");
      a1.imprimirFabricante();
      a2.imprimirFabricante();
      a1.cambiarFabricante(a2);
      a2.imprimirFabricante();
      Avion  a4=new Avion("LLoyd",6);
      Avion a5;
      a5=a4;
      a4.imprimirFabricante();
      a5.imprimirFabricante();
      a5.setFabricante("Stealth");
      a4.imprimirFabricante();
      a5.imprimirFabricante();

   }

}