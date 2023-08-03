public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato p1 = new Contato();
        p1.nome = "LUCAS";
        p1.numero = "123";

        Contato p2 = new Contato();
        p2.nome = "BRUNO";
        p2.numero = "456";

        Contato p3 = new Contato();
        p3.nome = "RAFAEL";
        p3.numero = "789";

        agenda.contatos = new Contato[] {p1, p2, p3};

        System.out.println("Lista da agenda:");
        agenda.imprimirLista();

        Contato lucas = agenda.buscarPorNome("LUCAS");
        System.out.println("Detalhes:");
        lucas.detalhar();
        lucas.ligar();
        agenda.deletar(p2);

        System.out.println("Lista agenda:");
        agenda.imprimirLista();
    }
}