

package com.mycompany.projeto_livro;

public class Projeto_Livro {

    public static void main(String[] args) {
        ClassPessoa[] pessoa1 = new ClassPessoa[2];
        ClassLivro[] livro1 = new ClassLivro[3];
        
        pessoa1[0] = new ClassPessoa("andré ", 22, "H ");
        pessoa1[1] = new ClassPessoa("Leticia ", 17, "M ");
        
        livro1[0] = new ClassLivro("falando de amor ", "marcos silva ", 200, pessoa1[0]);
        livro1[1] = new ClassLivro("Programação Java ", "junior mota ", 400, pessoa1[1]);
        livro1[2] =new ClassLivro("Histórias Do mundo ", "mara silva ", 250, pessoa1[0]);
        
        
        livro1[0].abrir();
        livro1[0].folhear(600);
       // livro1[0].avançarPag();
        System.out.println(livro1[0].detalhes());
        
        System.out.println(livro1[1].detalhes());
        
    }
    
    
}
