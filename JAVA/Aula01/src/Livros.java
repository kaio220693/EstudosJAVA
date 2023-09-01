public class Livros {
    String nome;
    String autor;
    String editora;
    int ano;

    public Livros(String nome, String autor, String editora, int ano){
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public void abrirLivro(){
        System.out.println("LIVRO ABERTO: "+ this.nome);
        System.out.println("AUTOR: "+ this.autor);
        System.out.println("EDITORA: "+ this.editora);
        System.out.println("ANO do LIVRO: "+ this.ano);
    }

    public void fecharLivro(){
        System.out.println("LIVRO FECHADO: "+ this.nome);
    }
}
