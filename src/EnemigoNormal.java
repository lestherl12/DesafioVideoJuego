class EnemigoNormal implements Enemigo {
    private int puntosDeVida;

    public EnemigoNormal() {
        this.puntosDeVida = 50; // Establece una cantidad inicial de puntos de vida para el enemigo normal
    }

    @Override
    public void atacar() {
        System.out.println("El Enemigo Normal ataca al jugador.");

    }

    @Override
    public void recibirDaño(int cantidad) {
        puntosDeVida -= cantidad;
        System.out.println("El Enemigo Normal recibe " + cantidad + " puntos de daño.");

        if (puntosDeVida <= 0) {
            System.out.println("El Enemigo Normal ha sido derrotado.");
        }
    }

    @Override
    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
