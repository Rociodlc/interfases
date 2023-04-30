    public class persona implements Becable {
        private String nombre;
        private double salario;
        private boolean tieneBeca;



        public void asignarBeca(double monto) {
            this.salario += monto;
            this.tieneBeca = true;
        }


        public void renovarBeca() {
            this.salario += 1000.0; // Ejemplo de incremento de salario en la renovación de la beca
        }
    }


