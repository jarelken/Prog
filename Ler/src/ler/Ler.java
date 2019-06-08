package ler;
import java.util.ArrayList;
import java.util.Scanner;



public class Ler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Autor a1 = new Autor("Jarel",23);
        Autor a2 = new Autor("Flavo",20);
        
        ArrayList<Livro> livro = new ArrayList<>();
        
        System.out.println("Autores");
        
        System.out.println(a1.toString()+"\n"+a2.toString());
        
        
        for (int i = 0; i < 1; i++) {
            Livro l = new Livro();
            System.out.println("Livro "+(i+1));
            System.out.println("Nome do Livro: ");
            l.setNome(scan.next());
            System.out.println("Ano do Livro:");
            l.setAno(scan.nextInt());
            System.out.println("Edição do Livro");
            l.setEdicao(scan.nextInt());
            System.out.println("Digite o nome do autor: ");
            String nome = scan.next();
            if(a1.getNome().equals(nome)){
                l.setAutor(a1);
                livro.add(l);
            }else if(a2.toString().contains(nome)){
                l.setAutor(a2);
                livro.add(l);
            }else{
                System.out.println("Autor Inválido");
                i--;
            }
        }
        System.out.println("Digite o nome do autor para procurar livros: ");
        String aut = scan.next();
        for (int i = 0; i < livro.size(); i++) {
            if(livro.get(i).getAutor().getNome().equals(aut)){
                System.out.println(livro.get(i).toString());
            }
            
        }
    }
}
   
