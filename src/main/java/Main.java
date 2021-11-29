public class Main {
    public static void main(String[] args) {
        Trabajador trabajador=new Trabajador("Sebastian","Calfunao","20973990-9","isapre","modelo");


        Trabajador t1= new Trabajador("seba","calfunao","20973990-9","isapre","modelo");
        Trabajador t2= new Trabajador("Guillermo","Pincheira","12123123-4","isapre","capital");

        Trabajador.agregarTrabajador(t1);
        Trabajador.agregarTrabajador(t2);

        System.out.println(trabajador.trabajadores.size());
        System.out.println(trabajador.trabajadores);
        Ventana v1= new Ventana();
        v1.setVisible(true);



    }
}
