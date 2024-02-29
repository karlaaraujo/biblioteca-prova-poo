package org.example.controladores;

import org.example.entidades.LivroDidatico;
import org.example.entidades.LivroParadidatico;
import org.example.entidades.Material;
import org.example.entidades.Revista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialControlador {

    private static Scanner scanner = new Scanner(System.in);

    public static List<Material> cadastrarMateriais(int quantidadeMateriais) {

        List<Material> materiais = new ArrayList<>();

        if (quantidadeMateriais <= 0) {
            throw new RuntimeException("A quantidade deve ser maior que 0.");
        }

        for (int i = 0; i < quantidadeMateriais; i++) {
            materiais.add(cadastrarMaterial(i));
        }

        return materiais;

    }

    private static Material cadastrarMaterial(int numeroMaterial) {
        String materialAtual = "Material " + (numeroMaterial + 1);

        System.out.println(materialAtual + " - Titulo: ");
        String titulo = scanner.nextLine();

        if (titulo.length() < 4) {
            throw new RuntimeException("O titulo deve ter no minimo 4 caracteres.");
        }

        System.out.println(materialAtual + " - Editora: ");
        String editora = scanner.nextLine();

        System.out.println(materialAtual + " - Ano: ");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.println(materialAtual + " - Tipo (1 - Livro didatico, 2 - Livro paradidatico, 3 - Revista): ");
        int tipo = Integer.parseInt(scanner.nextLine());

        switch (tipo) {
            case 1:
                return cadastrarLivroDidatico(titulo, editora, ano);
            case 2:
                return cadastrarLivroParadidatico(titulo, editora, ano);
            case 3:
                return cadastrarRevista(titulo, editora, ano);
        }

        return null;

    }

    private static Material cadastrarLivroDidatico(String titulo, String editora, int ano) {
        System.out.println("Nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();

        System.out.println("Tipo do livro: ");
        String tipoLivro = scanner.nextLine();


        LivroDidatico livro = new LivroDidatico();
        livro.setTitulo(titulo);
        livro.setAno(ano);
        livro.setEditora(editora);
        livro.setDisciplinaAssociada(nomeDisciplina);
        livro.setTipoLivro(tipoLivro);

        return livro;

    }

    private static Material cadastrarLivroParadidatico(String titulo, String editora, int ano) {
        System.out.println("Tipo do livro: ");
        String tipoLivro = scanner.nextLine();


        LivroParadidatico livro = new LivroParadidatico();
        livro.setTitulo(titulo);
        livro.setAno(ano);
        livro.setEditora(editora);
        livro.setTipoLivro(tipoLivro);

        return livro;

    }

    private static Material cadastrarRevista(String titulo, String editora, int ano) {

        System.out.println("isbn: ");
        int isbn = Integer.parseInt(scanner.nextLine());

        System.out.println("Volume: ");
        String volume = scanner.nextLine();

        System.out.println("Edicao: ");
        String edicao = scanner.nextLine();

        Revista revista = new Revista();
        revista.setTitulo(titulo);
        revista.setAno(ano);
        revista.setEditora(editora);
        revista.setIsbn(isbn);
        revista.setVolume(volume);
        revista.setEdicao(edicao);

        return revista;
    }


    public static void consultarMaterial(List<Material> materiais) {

        for (Material material : materiais){
            System.out.println("Titulo:" + material.getTitulo());
            System.out.println("Editora:" + material.getEditora());
            System.out.println("Ano:" + material.getAno());
            System.out.println(" " );
        }

    }
}
