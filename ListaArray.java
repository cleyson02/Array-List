import java.util.Scanner;

public class ListaArray implements EstruturaDeDados {
    private int[] elementos;
    private int contador;
    private int chave;

    public ListaArray() {
        elementos = new int[7];
        contador = 0;
    }

    @Override
    public boolean insert(int chave) {
        if (contador < this.elementos.length) {
            this.elementos[contador] = chave;
            contador += 1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(int chave) {
        for (int i = 0; i < elementos.length; i++) {
            if (chave == elementos[i]) {
                elementos[i] = 0;
                for (int j = i; j < contador - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }
                contador -= 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        for (int i = 0; i < elementos.length; i++) {
            if (chave == elementos[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        int chave = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] <= elementos[0]) {
                chave = elementos[i];
            }
        }
        return chave;
    }

    @Override
    public int maximum() {
        int chave = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] > chave) {
                chave = elementos[i];
            }
        }
        return chave;
    }

    @Override
    public int sucessor(int chave) {
        int a = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (chave == elementos[i]) {
                a = elementos[i + 1];
            }
        }
        return a;
    }

    @Override
    public int prodessor(int chave) {
        int a = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (chave == elementos[i]) {
                a = elementos[i - 1];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        ListaArray x = new ListaArray();
        x.insert(10);
        x.insert(30);
        x.insert(5);
        x.insert(100);
        x.insert(55);
        x.insert(77);
        x.insert(3);

        System.out.println(x.maximum());
        System.out.println(x.minimum());
        System.out.println(x.sucessor(100));
        System.out.println(x.prodessor(30));
    }
}