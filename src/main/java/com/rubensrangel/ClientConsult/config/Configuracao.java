package com.rubensrangel.ClientConsult.config;

import com.rubensrangel.ClientConsult.domain.Cliente;
import com.rubensrangel.ClientConsult.domain.Telefone;
import com.rubensrangel.ClientConsult.repositories.ArquivoXmlRepo;
import com.rubensrangel.ClientConsult.repositories.ClienteRepo;
import com.rubensrangel.ClientConsult.repositories.TelefoneRepo;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Configuration
@Profile("test")
public class Configuracao implements CommandLineRunner {


    @Autowired
    private ArquivoXmlRepo arquivoXmlRepo;

    @Autowired
    private ClienteRepo clienteRepo;

    @Autowired
    private TelefoneRepo telefoneRepo;

    @Override
    public void run(String... args) throws Exception {

    }



}

