package ejercicio2_5;
    public class CuentaBncaria {
        private String nombreTitular;
        private String apellidosdTitular;
        private int numeroCuenta;
        private String tipoCuenta;
        private float saldo = 0;

        public CuentaBncaria(String nombreTitular, String apellidosdTitular, int numeroCuenta, String tipoCuenta, float saldo) {
            this.nombreTitular = nombreTitular;
            this.apellidosdTitular = apellidosdTitular;
            this.numeroCuenta = numeroCuenta;
            this.tipoCuenta = tipoCuenta;
            this.saldo = saldo;
        }

        public void imprimirInformacion() {
            System.out.println("nombre del titular =" + nombreTitular);
            System.out.println("apellido del titualar =" + apellidosdTitular);
            System.out.println("numero de cuenta=" + numeroCuenta);
            System.out.println("tipo de cuenta=" + tipoCuenta);
            System.out.println("saldo=" + saldo);
        }

        public void consultarSaldo() {
            System.out.println("el saldo actual es=" + saldo);
        }

        public   boolean consignar(int valor) {
            if (valor > 0) {
                saldo = saldo + valor;
                System.out.println("se ha consignado $" + valor + "en la cuenta. El nuevo saldo es $" + saldo);
                return true;
            } else {
                System.out.println("el valor a consignar debe ser mayor que cero");
                return false;
            }
        }

        public   boolean retirar(int valor) {
            if ((valor > 0) && (valor <= saldo)) {
                saldo = saldo - valor;
                System.out.println("se ha retirado $" + valor + "en la cuenta el nuevo saldo es $" + saldo);
                return true;
            } else {
                System.out.println("el valor a retirar dene ser menor que el saldo actual.");
                return false;
            }
        }
    }

