package com.rubensrangel.ClientConsult.resources;

import com.rubensrangel.ClientConsult.domain.Cliente;
import com.rubensrangel.ClientConsult.domain.Telefone;
import com.rubensrangel.ClientConsult.repositories.ArquivoXmlRepo;
import com.rubensrangel.ClientConsult.repositories.ClienteRepo;
import com.rubensrangel.ClientConsult.repositories.TelefoneRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
@Slf4j
public class OpcoesUsuario {

    @Autowired
    private ArquivoXmlRepo arquivoXmlRepo;

    @Autowired
    private ClienteRepo clienteRepo;

    @Autowired
    private TelefoneRepo telefoneRepo;

    @Scheduled(fixedDelay = 2000)
    public void opcoesUsuario() throws InterruptedException {
        Thread.sleep(1000);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i != 2; i++) {
            //log.info("This is a test.");
            System.out.println(" Qual opção deseja realizar?");
            System.out.println("1 - Criar clientes e montar Xml via console, 2 - Ler Arquivo e Gravar no Banco, 3 - Para Localizar ver Lista de Cadastro, 4 - para Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Integer incluirNovoCLiente = null;
                    do {
                        criaCliente();
                        System.out.println("Incluir novo Clinte? digite 0 para não");
                        incluirNovoCLiente = scanner.nextInt();
                    } while (incluirNovoCLiente != 0);


//                        case 2:
//
//                        case 3:
//
                case 4:
                    System.exit(0);

                default:
                    System.out.println("opcao invalida");
            }

        }
    }

    public void criaCliente() {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo de Pessoa:");
        String tipoPessoa = scanner.next();
        cliente.setTipoPessoa(tipoPessoa);

        System.out.println("Nome:");
        String nome = scanner.next();
        cliente.setName(nome);

        System.out.println("CPF/CNPJ:");
        String cpfCnpj = scanner.next();
        cliente.setCpfCnpj(cpfCnpj);

        System.out.println("Email:");
        String email = scanner.next();
        cliente.setEmail(email);

        clienteRepo.save(cliente);


        int adicionarTelefones;

        do {
            telefoneLista(cliente);
            System.out.println("Incluir novo Telefone? digite 0 para não");
            adicionarTelefones = scanner.nextInt();
        } while (adicionarTelefones != 0);
    }

    public void telefoneLista(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DDD:");
        Integer ddd = scanner.nextInt();
        System.out.println("Numero:");
        String numero = scanner.next();

        List<Telefone> telefones = new ArrayList<>();


        Telefone telefone = new Telefone(null, ddd, numero, cliente);
        telefones.add(telefone);

        telefoneRepo.saveAll(telefones);
    }


    public void criaArquivoXml() {
        File File = new File("src/test/java/resources");

    }
}
