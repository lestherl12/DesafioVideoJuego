class FabricaEnemigoNormal extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new EnemigoNormal();
    }
}