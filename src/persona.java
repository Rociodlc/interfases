    public class persona {
        private String nombre;
        private String fechaContratacion;
        private double salario;

        public persona(String nombre, String fechaContratacion, double salario) {
            this.nombre = nombre;
            this.fechaContratacion = fechaContratacion;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getFechaContratacion() {
            return fechaContratacion;
        }

        public void setFechaContratacion(String fechaContratacion) {
            this.fechaContratacion = fechaContratacion;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }


