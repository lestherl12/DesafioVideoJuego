class EnemigoJefe implements Enemigo {
    private int puntosDeVida;

    public EnemigoJefe() {
        this.puntosDeVida = 100; // Establece una cantidad inicial de puntos de vida para el jefe
    }

    @Override
    public void atacar() {
        System.out.println("El Enemigo Jefe ataca con un poderoso ataque especial.");
        // Implementa aquí la lógica de ataque del jefe
    }

    @Override
    public void recibirDaño(int cantidad) {
        puntosDeVida -= cantidad;
        System.out.println("El Enemigo Jefe recibe " + cantidad + " puntos de daño.");

        if (puntosDeVida <= 0) {
            System.out.println("El Enemigo Jefe ha sido derrotado.");
        }
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
