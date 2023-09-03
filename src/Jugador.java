class Jugador implements Personaje {
    private int salud;
    private int energia;

    public Jugador() {
        this.salud = 100; // Establece una cantidad inicial de salud para el jugador
        this.energia = 50; // Establece una cantidad inicial de energía para el jugador
    }

    @Override
    public void atacar() {
        if (energia >= 10) {
            System.out.println("El Jugador realiza un ataque.");
            energia -= 10;
        } else {
            System.out.println("El Jugador no tiene suficiente energía para atacar.");
        }
    }

    @Override
    public void recibirDaño(int cantidad) {
        salud -= cantidad;
        System.out.println("El Jugador recibe " + cantidad + " puntos de daño.");

        if (salud <= 0) {
            System.out.println("El Jugador ha sido derrotado.");
        }
    }

    @Override
    public int getSalud() {
        return salud;
    }

    @Override
    public int getEnergia() {
        return energia;
    }
}
