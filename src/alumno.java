    public class alumno extends persona {
        private String nombre;
        private String empresa;
        private int duracion;


        public alumno(String nombre, String fechaContratacion, double salario) {
            super(nombre, fechaContratacion, salario);
        }

        @Override
        public String getNombre() {
            return nombre;
        }

        @Override
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEmpresa() {
            return empresa;
        }

        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }
    }


