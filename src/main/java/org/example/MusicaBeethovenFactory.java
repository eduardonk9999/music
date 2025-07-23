
public class MusicaBeethovenFactory {

    public static List<NotaMusical> quintaSinfonia() {
        List<NotaMusical> musica = new ArrayList<>();

        Altura sol = new Altura("Sol", 4);
        Altura mib = new Altura("Mi♭", 4);
        Altura fa = new Altura("Fá", 4);
        Altura re = new Altura("Ré", 4);


        Duracao colcheia = new Duracao("Colcheia", 0.5);
        Duracao seminima = new Duracao("Semínima", 1.0);

        musica.add(new NotaMusical(sol, colcheia));
        musica.add(new NotaMusical(sol, colcheia));
        musica.add(new NotaMusical(sol, colcheia));
        musica.add(new NotaMusical(mib, seminima));

        musica.add(new NotaMusical(fa, colcheia));
        musica.add(new NotaMusical(fa, colcheia));
        musica.add(new NotaMusical(fa, colcheia));
        musica.add(new NotaMusical(re, seminima));

        return musica;

    }
}