package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros {

    private List<Livro> livroList;

    // constructor
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    // metodos

    public void adicionarLivro(String titulo, String autor, int ano) {
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro liv : livroList){

                if (liv.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(liv);
                }

            }
    }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro liv : livroList){
                if (liv.getAno() >= anoInicial && liv.getAno() <= anoFinal){
                    livrosPorIntervaloAno.add(liv);
                }

            }
        }

        return livrosPorIntervaloAno;

    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()){
            for (Livro liv : livroList){
                if (liv.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = liv;
                    break; // Encontrou primeiro livro -> break
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Imbecil Coletivo", "Olavo de Carvalho", 1994);
        catalogoLivros.adicionarLivro("Imbecil Coletivo", "Olavo de Carvalho", 1994);
        catalogoLivros.adicionarLivro("Nova Era e a Revolução Cultural", "Olavo de Carvalho", 1993);
        catalogoLivros.adicionarLivro("For The Love of Physics", "Walter Lewin", 2012);
        catalogoLivros.adicionarLivro("A Ilha do Conhecimento", "Marcelo Gleiser", 2015);

        //System.out.println(catalogoLivros.pesquisarPorAutor("Walter Lewin"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(1960, 2000));
       // System.out.println(catalogoLivros.pesquisarPorTitulo("A Ilha do Conhecimento"));


    }
}
