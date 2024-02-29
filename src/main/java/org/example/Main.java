package org.example;

import org.example.entidades.Locacao;
import org.example.entidades.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.controladores.MaterialControlador.*;
import static org.example.controladores.LocacaoControlador.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Material> materiaisDisponiveis = new ArrayList<>();

        List<Locacao> locacoes = new ArrayList<>();

        while (true) {
            imprimirMenuOpcoes();

            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 4){
                break;
            }

            switch (opcao){
                case 1:
                    System.out.println("Informe a quantidade de materiais a serem adicionados: ");
                    int quantidadeMateriais = Integer.parseInt(scanner.nextLine());
                    materiaisDisponiveis.addAll(cadastrarMateriais(quantidadeMateriais));
                    break;
                case 2:
                    consultarMaterial(materiaisDisponiveis);
                case 3:
                    locacoes.add(cadastrarLocacao(materiaisDisponiveis));
                    imprimirLocacoes(locacoes);
            }

        }

    }

    private static void imprimirMenuOpcoes(){
        System.out.println("Opcoes: ");
        System.out.println("1 - Cadastrar materiais ");
        System.out.println("2 - Consultar materiais ");
        System.out.println("3 - Cadastrar locacao ");
        System.out.println("4 - Encerrar ");
        System.out.println("Digite a opção: ");
    }

}