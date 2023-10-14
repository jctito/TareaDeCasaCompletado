package ejercicio2_5;
    public class main{
        public static void main(String[] args){

            CuentaBncaria CuentaBancaria = new CuentaBncaria("juan","juanes",12345678,"AHORROS",
                    0);
            CuentaBancaria.imprimirInformacion();
            CuentaBancaria.consignar(200000);
            CuentaBancaria.consignar(300000);
            CuentaBancaria.retirar (400000);
        }
    }

