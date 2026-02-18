package com.marketingagency.test;

import com.marketingagency.domain.Client;
import com.marketingagency.domain.Services;
import com.marketingagency.domain.Agency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client;
        Services services;
        Agency agency = new Agency();
        Scanner sc = new Scanner(System.in);
        int option, clientOption, admOption;
        double servicePrice;
        String clientName, clientAddress, clientContact, clientEmail, clientPass, clientArea, agencyContact, agencyAddress
                ,serviceName, serviceDesc;
        System.out.println("========== MENU ==========\nBem-vindo(a) ao sistema de marketing da Dominuz!");
        do {
            System.out.println("Escolha uma das opções abaixo e facilite a sua vida com o nosso sistema inteligente.\n1 - Cliente\t2 - Agência\n");
            option = sc.nextInt();
        } while (option != 1 && option != 2);
        // Um não pode ter acesso ao menu do outro.
        if (option == 1) {
            while (true) {
                System.out.println("========== CLIENTE ==========\n1 - Cadastrar\t2 - Logar");
                do {
                    clientOption = sc.nextInt();
                } while (clientOption != 1 && clientOption != 2);
                if (clientOption == 1) {
                    System.out.println("CADASTRO\nNome completo:");
                    sc.next();
                    clientName = sc.nextLine();
                    // Adicionar uma verificação
                    System.out.println("E-mail: ");
                    clientEmail = sc.nextLine();
                    System.out.println("Area de atuação: ");
                    clientArea = sc.nextLine();
                    System.out.println("Endereço: ");
                    clientAddress = sc.nextLine();
                    System.out.println("Senha: ");
                    clientPass = sc.nextLine();
                    client = new Client(clientName, clientEmail, clientAddress, clientPass, clientArea);
                    agency.getClients().add(client);
                    System.out.println("Successful registration!");
                } else if (clientOption == 2) {
                    System.out.println("LOG IN\nE-mail: ");
                    sc.next();
                    clientEmail = sc.nextLine();
                    System.out.println("Senha: ");
                    clientPass = sc.nextLine();
                    for (Client client1 : agency.getClients()) {
                        if (client1.getEmail().equals(clientEmail)) {
                            System.out.println("E-mail já cadastrado.");
                        } else {
                            System.out.println("Bem-vindo!");
                            System.out.println("========== DOMINUZ MARKETING DIGITAL ==========\nNossos serviços: ");
                        }
                    }
                } else {
                    break;
                }
            }
        } else if (option == 2) {
            do {
                System.out.println("========== AGÊNCIA ==========\n1 - Editar informações\n2 - Cadastrar Serviços\n3 - Criar time");
                admOption = sc.nextInt();
            } while (admOption != 1 && admOption != 2);
            if (admOption == 1){
                System.out.println("Contato: ");
                agencyContact = sc.nextLine();
                System.out.println("Endereço: ");
                agencyAddress = sc.nextLine();
                agency = new Agency();
                agency.setAgencyAddress(agencyAddress);
                agency.setAgencyContact(agencyContact);
                System.out.println("Alteração bem-sucedida!");
            } else if (admOption == 2){
                System.out.println("Nome do serviço: ");
                serviceName = sc.nextLine();
                System.out.println("Descrição: ");
                serviceDesc = sc.nextLine();
                System.out.println("Preço: ");
                servicePrice = sc.nextDouble();
                services = new Services(serviceName, serviceDesc, servicePrice);
                //agency.setServicesList(services.getServiceName(), services.getPrice());
            }
        }
    }
}
