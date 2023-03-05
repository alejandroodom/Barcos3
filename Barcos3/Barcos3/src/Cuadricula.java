import java.util.Arrays;

public class Cuadricula {
    private final int TAMANO = 10;
    private final char BARCO = 'x';
    private final char AGUA = '~';

    private char[][] tablero = new char[TAMANO][TAMANO];

    public Cuadricula() {
        for (char[] a : tablero) {
            Arrays.fill(a, AGUA);
        }
    }

    public boolean depositarBarco(int fila, int columna) {
        if (fila < 0 || fila >= TAMANO || columna < 0 || columna >= TAMANO) {
            return false;
        }
        if (tablero[fila][columna] == BARCO) {
            return false;
        }
        tablero[fila][columna] = BARCO;
        return true;
    }

    public boolean disparar(int fila, int columna) {
        if (fila < 0 || fila >= TAMANO || columna < 0 || columna >= TAMANO) {
            return false;
        }
        if (tablero[fila][columna] == BARCO) {
            tablero[fila][columna] = AGUA;
            return true;
        } else {
            return false;
        }
    }

    public void visualizacion() {
        System.out.print("  ");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int fila = 0; fila < TAMANO; fila++) {
            System.out.print(fila + " ");
            for (int columna = 0; columna < TAMANO; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
