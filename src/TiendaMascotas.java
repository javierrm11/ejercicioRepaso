import java.util.Scanner;

public class TiendaMascotas {
        Mascota[] inventario;
        int cantidadMascotas;
        public TiendaMascotas(){
            this.inventario = new Mascota[100];
            this.cantidadMascotas = 0;
        }

        public void agregarMascota(String nombre, int edad,String tipoAnimal){
            Mascota mascota = new Mascota( nombre, edad, tipoAnimal);
            inventario[cantidadMascotas]= mascota;
            cantidadMascotas++;
            System.out.println("La mascota " +nombre+" se ha añadido correctamente.");
        }
        public void venderMascota(String nombre) {
            for (int i = 0; i < cantidadMascotas; i++) {
                if (inventario[i].nombre.equals(nombre)){
                    inventario[i] = null;
                    for (int j = i; j < cantidadMascotas; j++) {
                        inventario[j] = inventario[j+1];

                    }
                    cantidadMascotas--;
                    System.out.println("La mascota se ha vendido correctamente");
                }
                else {
                    System.out.println("Este animal no existe en nuestra tienda");
                }
            }
        }

        public void mostrar() {
            if (cantidadMascotas == 0) {
                System.out.println("No hay mascostas");
            }
            else {
                for (int i = 0; i < cantidadMascotas; i++) {
                    System.out.println("Nombre: "+inventario[i].nombre+" Edad: " +inventario[i].edad+" Tipo Animal: "+ inventario[i].tipoAnimal);
                }
            }

        }

    public static void main(String[] args) {
            TiendaMascotas tienda = new TiendaMascotas();
            tienda.agregarMascota("juan",4,"perro");

            tienda.agregarMascota("mario",5,"gato");
            tienda.mostrar();

    }
}
