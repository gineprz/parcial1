public class vendedor extends Main {

    private String Nombre;
    private  String Tiempo;
    private  String Valoracion;
    private String Datos;


    //Constructor
    public vendedor (String Nombre, String Tiempo, String Vloracion, String Datos){
        this.Nombre = Nombre;
        this.Tiempo = Tiempo;
        this.Valoracion = Vloracion;
        this.Datos = Datos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String tiempo) {
        Tiempo = tiempo;
    }

    public String getValoracion() {
        return Valoracion;
    }

    public void setValoracion(String valoracion) {
        Valoracion = valoracion;
    }

    public String getDatos() {
        return Datos;
    }

    public void setDatos(String datos) {
        Datos = datos;
    }
}