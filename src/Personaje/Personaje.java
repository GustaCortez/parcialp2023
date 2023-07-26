package Personaje;

public class  Personaje {
    private String nombre;
    private String descripcion;
    private long tamaño;
    private Integer poder;
    private Integer vida;

    public void desplazarse() {
        System.out.println("caminar");

    }

    public Integer mostrarVida(int vida) {
        return vida;
    }

    public void mostrarPoder(Integer poder) {
        this.poder = poder;
    }
}
