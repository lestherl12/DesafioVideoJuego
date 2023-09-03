class FabricaGuerrero extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new Jugador();
    }
}