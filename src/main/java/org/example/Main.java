package org.example;


public class Main {
    public static void main(String[] args) {
        List<NotaMusical> musica = MusicaBeethovenFactory.quintaSinfonia();

        for (NotaMusical nota : musica) {
            System.out.println(nota);
        }
    }
}