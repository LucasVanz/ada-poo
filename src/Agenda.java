public class Agenda {
    Contato[] contatos;

    public void deletar(Contato contato) {
        Contato[] novaLista = new Contato[contatos.length - 1];
        int posicao = 0;
        for (int i = 0; i < contatos.length; i++){
            if (!contato.nome.equals(contatos[i].nome) && !contato.numero.equals(contatos[i].numero)){
                novaLista[posicao] = contatos[i];
                posicao++;
            }
        }
        contatos = novaLista;
    }

    public Contato buscarPorNome(String nome) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i].nome.equals(nome)){
                return contatos[i];
            }
        }
        return null;
    }

    public void imprimirLista(){
        System.out.println();
        for (Contato x : contatos){
            System.out.println(x.nome);
        }
        System.out.println();
    }
}
