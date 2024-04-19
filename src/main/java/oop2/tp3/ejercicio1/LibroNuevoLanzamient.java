package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamient extends Libro{
    public LibroNuevoLanzamient(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularCosto(int diasAlquilados) {
        double monto = (double) diasAlquilados * 3;
        return monto;
    }

    @Override
    public int calcularBonus(int diasAlquilados) {
        if (diasAlquilados>1){return 1;}
        return  0;}

}
