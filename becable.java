    public class persona implements Becable {
        private String nombre;
        private double salario;
        private boolean tieneBeca;


        @Override
        public void asignarBeca(double monto) {
            this.salario += monto;
            this.tieneBeca = true;
        }

        @Override
        public void renovarBeca() {
            this.salario += 1000.0;
        }
    }


