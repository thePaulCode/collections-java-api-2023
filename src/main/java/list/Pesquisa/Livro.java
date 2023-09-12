package main.java.list.Pesquisa;

public class Livro {

    // atributos
    private String titulo;
    private String autor;
    private int ano;

    // constructor

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // getters and setters


    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
