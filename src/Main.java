public class Main {
    public static void main(String[] args) {
        // Creación de fábricas de personajes y enemigos
        FabricaPersonajes fabricaGuerrero = new FabricaGuerrero();
        FabricaPersonajes fabricaMago = new FabricaMago();

        // Creación de personajes y enemigos utilizando las fábricas correspondientes
        Personaje guerrero = fabricaGuerrero.crearPersonaje();
        Personaje mago = fabricaMago.crearPersonaje();

        FabricaEnemigos fabricaEnemigoNormal = new FabricaEnemigoNormal();
        FabricaEnemigos fabricaEnemigoJefe = new FabricaEnemigoJefe();

        Enemigo enemigoNormal = fabricaEnemigoNormal.crearEnemigo();
        Enemigo enemigoJefe = fabricaEnemigoJefe.crearEnemigo();

        // Prueba de interacciones entre personajes y enemigos
        System.out.println("Comienza la batalla:");

        guerrero.atacar();
        enemigoNormal.recibirDaño(10);
        enemigoJefe.atacar();
        guerrero.recibirDaño(15);
        guerrero.atacar();
        enemigoNormal.recibirDaño(10);

        System.out.println("Estado después de las interacciones:");

        imprimirEstadoPersonaje("Guerrero", guerrero);
        imprimirEstadoPersonaje("Mago", mago);
        imprimirEstadoEnemigo("Enemigo Normal", enemigoNormal);
        imprimirEstadoEnemigo("Enemigo Jefe", enemigoJefe);
    }

    private static void imprimirEstadoPersonaje(String nombre, Personaje personaje) {
        System.out.println(nombre + ":");
        System.out.println("Salud: " + personaje.getSalud());
        System.out.println("Energía: " + personaje.getEnergia());
        System.out.println();
    }

    private static void imprimirEstadoEnemigo(String nombre, Enemigo enemigo) {
        System.out.println(nombre + ":");
        System.out.println("Puntos de vida: " + enemigo.getPuntosDeVida());
        System.out.println();
    }
}
