package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    // constructor

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidadoSet(String nome, int codigoComvite){
        convidadoSet.add(new Convidado(nome, codigoComvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){

        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println("Número de convidados: "+convidadoSet);
    }

    // TESTES
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " +conjuntoConvidados.contarConvidados() + " convidados dentro do Set Convidados");

        conjuntoConvidados.adicionarConvidadoSet("Stella", 070224);
        conjuntoConvidados.adicionarConvidadoSet("Isaac", 210226);
        conjuntoConvidados.adicionarConvidadoSet("Ana", 070224);
        conjuntoConvidados.adicionarConvidadoSet("Paulo", 210290);

        System.out.println("Existem " +conjuntoConvidados.contarConvidados() + " convidados dentro do Set Convidados");

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(070224);
        conjuntoConvidados.exibirConvidados();

    }


}
