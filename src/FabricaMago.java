class FabricaMago extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new Jugador(); // Puedes devolver una instancia de JugadorMago si lo deseas
    }
}