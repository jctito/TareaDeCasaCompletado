package ejercicio2_6;
    public class main {
        public static void main(String[] args) {
            CuentaBancaria cuenta1 = new CuentaBancaria ("juancho","juanki",123456, CuentaBancaria.tipo.AHORROS,0,0.12);
            CuentaBancaria cuenta2= new CuentaBancaria("juan","juanqui",45678954, CuentaBancaria.tipo.AHORROS,0,0.12);
            CuentaBancaria cuenta3 = new CuentaBancaria("juanes","huarac",4225865, CuentaBancaria.tipo.CORRIENTE,0,0);
            cuenta1.imprimir();
            cuenta1.consignar(2000);
            cuenta2.consignar(1000);
            cuenta1.consignar(3000);
            cuenta1.comprarCuentas(cuenta2);
            cuenta1.transferencia(cuenta2,500);
            cuenta1.consultarSaldo();
            cuenta1.retirar(4000);
            System.out.println(cuenta1.interes(cuenta1.saldo));
            System.out.println("el interes sera: "+ cuenta1.interes);
            cuenta1.nuevointe(12);
            cuenta2.consultarSaldo();
            cuenta3.consultarSaldo();
            cuenta3.activa();

        }
    }

