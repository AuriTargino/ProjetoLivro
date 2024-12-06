
package com.mycompany.projeto_livro;


public class ClassLivro implements InterfacePublicacao{

   
   private String titulo;
   private String autor;
   private int totPaginas;
   private float pagAtual;
   private boolean aberto;
   private ClassPessoa leitor;

    
    public String detalhes() {
        return "ClassLivro{" + "titulo = " + titulo + "\n, autor = " 
        + autor + "\n, totPaginas = " + totPaginas + ", pagAtual = " 
        + pagAtual + ",\n aberto = " + aberto + "\n, leitor = " + leitor.getNome() + 
              "\n, Idade = " + leitor.getIdade() +  
                "\n, Sexo = " + leitor.getSexo() + '}';
    }   

    public ClassLivro(String titulo, String autor, int totPaginas, ClassPessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual =0;
        this.leitor = leitor;
        
    }
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public ClassPessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(ClassPessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
       if(p > this.totPaginas){
           this.pagAtual = 0;
       }else{
           this.pagAtual = p;
       }
        
    }

    @Override
    public void avançarPag() {
       this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
