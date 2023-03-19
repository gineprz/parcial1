public class Main {

    public static void main(String[] args) {


        System.out.print("datos del vendedor ");
        vendedor vendedor1 = new vendedor("juan", "5 horas", "****", "" );
        System.out.println((vendedor1.getNombre()+ "_"+ vendedor1.getTiempo()+ "_"+ vendedor1.getValoracion()+"_"+ vendedor1.getValoracion() ));
        System.out.print("datos del comprador ");
        comprador  comprador1 = new comprador("pepe ",  "pepe@gmail.com ",  "arraijan calle las flores ,casa 67");
        System.out.println((comprador1.getNombre()+ "_"+ comprador1.getCorreo()+ "_"+"_"+ comprador1.getDirrecion() ));

        System.out.print("lista de productos  ");
        Producto producto_1 = new Producto("pepsi ", "soda ", "soda  ", "bebida saborizada");
        Producto producto_2 = new Producto("carne", "", "", "cerdo");
        Producto producto_3 = new Producto("jugo", "", "", "naranja");
        Producto producto_4 = new Producto("galleta", "", "", "galleta maria");
        Producto producto_5 = new Producto("helado", "", "", "sabor fresa");
        System.out.println(producto_1.getNombre() + "_" + producto_1.getResena() + "_" +producto_1.getDirrecion() + "_" + producto_1.getDescripcion() );
        System.out.println(producto_2.getNombre() + "_" + producto_2.getResena() + "_" +producto_2.getDirrecion() + "_" + producto_2.getDescripcion() );
        System.out.println(producto_3.getNombre() + "_" + producto_3.getResena() + "_" +producto_3.getDirrecion() + "_" + producto_3.getDescripcion() );
        System.out.println(producto_4.getNombre() + "_" + producto_4.getResena() + "_" +producto_4.getDirrecion() + "_" + producto_4.getDescripcion() );
        System.out.println(producto_5.getNombre() + "_" + producto_5.getResena() + "_" +producto_5.getDirrecion() + "_" + producto_5.getDescripcion() );


    }

}