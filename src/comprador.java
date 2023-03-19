public class comprador extends Main {

       private String Nombre;
       private  String Correo;
       private  String Dirrecion;

       //Constructor
       public comprador (String Nombre , String Correo, String Dirrecion ){
              this.Nombre = Nombre;
              this.Correo = Correo;
              this.Dirrecion  = Dirrecion;
       }

       public String getNombre() {
              return Nombre;
       }

       public void setNombre(String nombre) {
              Nombre = nombre;
       }

       public String getCorreo() {
              return Correo;
       }

       public void setCorreo(String correo) {
              Correo = correo;
       }

       public String getDirrecion() {
              return Dirrecion;
       }

       public void setDirrecion(String dirrecion) {
              Dirrecion = dirrecion;
       }

}

