class FabricaEnemigoJefe extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new EnemigoJefe();
    }
}
