package ejercicio2_4;

import java.lang.Math;
    class Circulo {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        public double calcularArea() {
            return Math.PI * radio * radio;
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

    class rectangulo {
        private double base;
        private double altura;

        public rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return base * altura;
        }

        public double calcularPerimetro() {
            return 2 * (base + altura);
        }
    }

    class Cuadrado {
        private double lado;

        public Cuadrado(double lado) {
            this.lado = lado;
        }

        public double calcularArea() {
            return lado * lado;
        }

        public double calcularPerimetro() {
            return 4 * lado;
        }
    }
    class TrianguloRectangulo {
        private double base;
        private double altura;
        public TrianguloRectangulo(double base, double altura){
            this.base = base;
            this.altura= altura;
        }
        public double calcularArea(){
            return 0.5 *base *altura;
        }
        public double calcularPerimetro(){
            double hipotenusa = calcularHipotenusa();
            return base +altura +hipotenusa;
        }
        public double calcularHipotenusa(){
            return Math.sqrt(base*base+altura+altura);
        }
        public String detrminarTipo(){
            if(base==altura){
                return "Equlatereo";
            } else if (base== altura || base == calcularHipotenusa()||altura==calcularHipotenusa()) {
                return "Equilatero";
            }else{
                return "Escaleno";
            }
        }
    }

