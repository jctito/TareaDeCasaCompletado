package ejercicio2_6;
    public class CuentaBancaria {
        String nombresTitular;
        String apellidosTiular;
        int numeroCuenta;
        enum tipo {AHORROS,CORRIENTE}
        tipo tipoCuenta;
        float saldo=0;
        double interes;

        //constructor
        public CuentaBancaria(String nombresTitular, String apellidosTiular, int numeroCuenta, tipo tipoCuenta, float saldo,double interes) {
            this.nombresTitular = nombresTitular;
            this.apellidosTiular = apellidosTiular;
            this.numeroCuenta = numeroCuenta;
            this.tipoCuenta = tipoCuenta;
            this.saldo = saldo;
            this.interes = interes;
        }
        //metodo
        void imprimir(){
            System.out.println("Nombres titular: "+nombresTitular);
            System.out.println("Apellidos titular: "+apellidosTiular);
            System.out.println("Numero de cuenta: "+numeroCuenta);
            System.out.println("Tipo de cuenta: "+tipoCuenta);
            System.out.println("Saldo: "+saldo);
        }

        void consultarSaldo(){
            System.out.println("El saldo actual es:"+saldo);
        }
        boolean consignar (int valor){
            if (valor>=0){
                saldo = saldo+valor;
                System.out.println("Se ha consignado: "+ valor+" en la cuenta, el nuevo saldo es: "+saldo);
                return true;
            }else {
                System.out.println("El valor a consignar debe ser mayor a cero.");
                return false;
            }
        }
        boolean retirar(int valor){
            if ((valor>=0)&&(valor<=saldo)){
                saldo = saldo-valor;
                System.out.println("Se ha retirado: "+valor+ " saldo actual: "+saldo);
                return true;
            } else {
                System.out.println("No tiene suficiente dinero para retirar.");
                return false;
            }
        }
        double interes(double inte){
            inte=(saldo*inte)+saldo;
            System.out.println("El interes anual sera: "+ inte );
            return inte;
        }
        double nuevointe(double nueint){
            nueint=interes+saldo;
            System.out.println("Nuevo interes: "+ nueint);
            return nueint;

        }

        void comprarCuentas(CuentaBancaria cuenta){
            if (saldo>=cuenta.saldo){
                System.out.println("el saldo de la cuenta actual es mayor o igual al saldo de la cuenta pasada como parametro.");
            } else {
                System.out.println("El saldo de la cuenta actual es menor al saldo de la cuenta pasada como parametro");
            }
        }

        void transferencia(CuentaBancaria cuenta,int valor){
            if (retirar(valor)){
                cuenta.consignar(valor);
            }
        }
        boolean activa(){
            if (saldo>0){
                System.out.println("La cuenta esta activa.");
                return true;
            } else if (saldo<=0) {
                System.out.println("La cuenta esta inactiva");
            }
            return false;
        }
    }

