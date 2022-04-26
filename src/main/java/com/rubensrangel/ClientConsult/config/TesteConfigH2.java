package com.rubensrangel.ClientConsult.config;

import com.rubensrangel.ClientConsult.domain.ArquivoXml;
import com.rubensrangel.ClientConsult.domain.Cliente;
import com.rubensrangel.ClientConsult.domain.Telefone;
import com.rubensrangel.ClientConsult.repositories.ArquivoXmlRepo;
import com.rubensrangel.ClientConsult.repositories.ClienteRepo;
import com.rubensrangel.ClientConsult.repositories.TelefoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Date;


@Configuration
@Profile("test")
public class TesteConfigH2 implements CommandLineRunner {


    @Autowired
    private ArquivoXmlRepo arquivoXmlRepo;

    @Autowired
    private ClienteRepo clienteRepo;

    @Autowired
    private TelefoneRepo telefoneRepo;

    @Override
    public void run(String... args) throws Exception {

        Date dataHoje = new Date();
        File file1 = new File("src/test/java/resources/001_test.xml");
        byte[] fileConteudo1 = Files.readAllBytes(file1.toPath());
        File file2 = new File("src/test/java/resources/002_test.xml");
        byte[] fileConteudo2 = Files.readAllBytes(file2.toPath());

        ArquivoXml arquivoXml1 = new ArquivoXml(null, "0001", dataHoje, "texto", "src/resources", fileConteudo1);
        ArquivoXml arquivoXml2 = new ArquivoXml(null, "0001", dataHoje, "texto", "src/resources", fileConteudo2);

        arquivoXmlRepo.saveAll(Arrays.asList(arquivoXml1, arquivoXml2));

        Cliente cliente1 = new Cliente(null, "F", "Rubens", "10084612703", "rubens_rangel@hotmail.com", arquivoXml1);

        clienteRepo.saveAll(Arrays.asList(cliente1));

        Telefone telefone1 = new Telefone(null, 27, "9999999999", cliente1);
        telefoneRepo.save(telefone1);

    }
}

