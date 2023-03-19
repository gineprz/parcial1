public class Producto extends Main{

        private String Nombre;
        private  String Resena;
        private  String Dirrecion;
        private  String Descripcion;

        public Producto (String Nombre, String Resena, String Dirrecion, String Descripcion) {
                this.Nombre = Nombre;
                this.Resena = Resena;
                this.Dirrecion = Dirrecion;
                this.Descripcion = Descripcion;
        }

        public String getNombre() {
                return Nombre;
        }

        public void setNombre(String nombre) {
                Nombre = nombre;
        }

        public String getResena() {
                return Resena;
        }

        public void setResena(String resena) {
                Resena = resena;
        }

        public String getDirrecion() {
                return Dirrecion;
        }

        public void setDirrecion(String dirrecion) {
                Dirrecion = dirrecion;
        }

        public String getDescripcion() {
                return Descripcion;
        }

        public void setDescripcion(String descripcion) {
                Descripcion = descripcion;
        }
}
