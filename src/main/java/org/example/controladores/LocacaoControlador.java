package org.example.controladores;

import org.example.entidades.Locacao;
import org.example.entidades.Locatario;
import org.example.entidades.Material;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class LocacaoControlador {

    private static Scanner scanner = new Scanner(System.in);

    public static Locacao cadastrarLocacao(List<Material> materiaisDisponiveis) {

        Locatario locatario = obterLocatario();

        System.out.println("Titulo do material: ");
        String tituloMaterial = scanner.nextLine();

        Material materialAAlugar = null;

        for (Material material : materiaisDisponiveis) {
            if (material.getTitulo().equals(tituloMaterial)) {
                materialAAlugar = material;
            }
        }

        if (materialAAlugar == null) {
            throw new RuntimeException("O material não existe ou não está disponível.");
        }

        materiaisDisponiveis.remove(materialAAlugar);

        return montarLocacao(locatario, materialAAlugar);
    }

    private static Locatario obterLocatario() {
        System.out.println("- Dados do Locatario -");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Endereco: ");
        String endereco = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        Locatario locatario = new Locatario(nome, endereco, email);
        return locatario;
    }

    private static Locacao montarLocacao(Locatario locatario, Material materialAAlugar) {
        Locacao locacao = new Locacao();

        locacao.setData(new Date());
        locacao.setLocatario(locatario);
        locacao.setMaterial(materialAAlugar);

        return locacao;
    }

    public static void imprimirLocacoes(List<Locacao> locacoes) {
        System.out.println("- Locações -");
        for (Locacao locacao : locacoes) {
            System.out.println("Material: " + locacao.getMaterial().getTitulo());
            System.out.println("Locatario: " + locacao.getLocatario().getNome());
        }
    }


}
