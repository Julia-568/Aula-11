package Aula11;

public class Livro {

  private String titulo;
  private Autor autor;

    public Livro(String titulo, String nomeAutor) {
        this.titulo = titulo;
        this.autor = new Autor(nomeAutor);
    }

    public void mostrarInfo() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor.getNome());
    }

}
