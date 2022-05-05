import java.util.Scanner;
public class Practica2{
    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(!salir){
            System.out.println("\n1 -- Clase Gato");
            System.out.println("2 -- Clase Perro");
            System.out.println("3 -- Clase Humano");
            System.out.println("4 -- Salir");
            System.out.println("Elija una de las opciones: ");
            opcion = menu.nextInt();

            switch(opcion){
                case 1:
                    Gato.datosEntradaobj1();
                    Gato.datosEntradaobj2();
                    Gato.datosEntradaobj3();
                    break;
                case 2:
                    Perro.datosEntradaPobj1();
                    Perro.datosEntradaPobj2();
                    Perro.datosEntradaPobj3();
                    break;
                case 3:
                    Humano.datosEntradaHobj1();
                    Humano.datosEntradaHobj2();
                    Humano.datosEntradaHobj3();
                    break;
                case 4: salir = true;
                    break;
                default: System.out.println("Elija una opcion entre 1 y 4");
                    break;
            }
        }
    }
}


class Gato{
    String ng;
    int eg;

    public Gato(String ng, int eg){
        this.ng = ng;
        this.eg = eg;
    }
    public static void datosEntradaobj1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 1---");
        System.out.println("Introduzca el nombre del gato:"); String catName = entrada.nextLine();
        System.out.println("Introduzca la edad del gato:"); int catAge = entrada.nextInt();
        Gato Mascota1 = new Gato(catName, catAge);
        System.out.println("\nClase: Gato, Objeto 1");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Mascota1.ng);
        System.out.println("Edad: " + Mascota1.eg + "\n");
    }
    public static void datosEntradaobj2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 2---");
        System.out.println("Introduzca el nombre del gato:"); String catName = entrada.nextLine();
        System.out.println("Introduzca la edad del gato:"); int catAge = entrada.nextInt();
        Gato Mascota2 = new Gato(catName, catAge);
        System.out.println("\nClase: Gato, Objeto 2");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Mascota2.ng);
        System.out.println("Edad: " + Mascota2.eg + "\n");
    }
    public static void datosEntradaobj3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 3---");
        System.out.println("Introduzca el nombre del gato:"); String catName = entrada.nextLine();
        System.out.println("Introduzca la edad del gato:"); int catAge = entrada.nextInt();
        Gato Mascota3 = new Gato(catName, catAge);
        System.out.println("\nClase: Gato, Objeto 3");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Mascota3.ng);
        System.out.println("Edad: " + Mascota3.eg + "\n");
    }
}

class Perro{
    String np;
    int ep;

    public Perro(String np, int ep){
        this.np = np;
        this.ep = ep;
    }
    public static void datosEntradaPobj1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 1---");
        System.out.println("Introduzca el nombre del perro:"); String dogName = entrada.nextLine();
        System.out.println("Introduzca la edad del perro:"); int dogAge = entrada.nextInt();
        Perro Mascotap1 = new Perro(dogName, dogAge);
        System.out.println("\nClase: Perro, Objeto 1");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Mascotap1.np);
        System.out.println("Edad: " + Mascotap1.ep + "\n");
    }
    public static void datosEntradaPobj2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 2---");
        System.out.println("Introduzca el nombre del perro:"); String dogName = entrada.nextLine();
        System.out.println("Introduzca la edad del perro:"); int dogAge = entrada.nextInt();
        Perro Mascotap2 = new Perro(dogName, dogAge);
        System.out.println("\nClase: Perro, Objeto 2");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Mascotap2.np);
        System.out.println("Edad: " + Mascotap2.ep + "\n");
    }
    public static void datosEntradaPobj3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 3---");
        System.out.println("Introduzca el nombre del perro:"); String dogName = entrada.nextLine();
        System.out.println("Introduzca la edad del perro:"); int dogAge = entrada.nextInt();
        Perro Mascotap3 = new Perro(dogName, dogAge);
        System.out.println("\nClase: Perro, Objeto 3");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Mascotap3.np);
        System.out.println("Edad: " + Mascotap3.ep + "\n");
    }
}

class Humano{
    String nh;
    int eh;

    public Humano(String nh, int eh){
        this.nh = nh;
        this.eh = eh;
    }
    public static void datosEntradaHobj1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 1---");
        System.out.println("Introduzca el nombre de la persona: "); String personName = entrada.nextLine();
        System.out.println("Introduzca la edad de la persona: "); int personAge = entrada.nextInt();
        Humano Persona1 = new Humano(personName, personAge);
        System.out.println("\nClase: Humano, Objeto 1");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Persona1.nh);
        System.out.println("Edad: " + Persona1.eh + "\n");
    }
    public static void datosEntradaHobj2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 2---");
        System.out.println("Introduzca el nombre de la persona: "); String personName = entrada.nextLine();
        System.out.println("Introduzca la edad de la persona: "); int personAge = entrada.nextInt();
        Humano Persona2 = new Humano(personName, personAge);
        System.out.println("\nClase: Humano, Objeto 2");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Persona2.nh);
        System.out.println("Edad: " + Persona2.eh + "\n");
    }
    public static void datosEntradaHobj3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Objeto 3---");
        System.out.println("Introduzca el nombre de la persona: "); String personName = entrada.nextLine();
        System.out.println("Introduzca la edad de la persona: "); int personAge = entrada.nextInt();
        Humano Persona3 = new Humano(personName, personAge);
        System.out.println("\nClase: Humano, Objeto 3");
        System.out.println("---Atributos---");
        System.out.println("Nombre: " + Persona3.nh);
        System.out.println("Edad: " + Persona3.eh + "\n");
    }
}