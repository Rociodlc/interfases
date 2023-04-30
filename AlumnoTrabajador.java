public class AlumnoTrabajador extends persona {
        private String puesto;
        private double salario;

        public AlumnoTrabajador(String nombre, String fechaContratacion, String puesto, double salario) {
            super(nombre, fechaContratacion);
            this.puesto = puesto;
            this.salario = salario;
        }

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }


