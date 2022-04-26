package com.rubensrangel.ClientConsult.resources.utils;

import com.rubensrangel.ClientConsult.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscritaArquivos {

    @Autowired
    private Cliente cliente;


}

        //ArquivoXml arquivoXml = new ArquivoXml();

//
//
//        File diretorio = new File("src/test/resources/");
//        File[] arquivos = diretorio.listFiles();
//
//        List<File> listaXml = new ArrayList<File>();
//
//        for (contador = 0; contador < arquivos.length; contador++) {
//            if (arquivos[contador].isDirectory()) {
//                continue;
//
//                try (FileWriter fw = new FileWriter(finalPath)) {
////                    fw.write(OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(jCustomer));
//            } else {
//
//            }
//    }
//}

//        for (i = 0; i < listaXml.size(); i++) {
//            } else {
//                listaXml.add(arquivos[contador]);
//                System.out.println(arquivos[contador]);
//
//                String novoDirerio = ("src/test/resources/jsonbulk/");
//                String finalPath = novoDirerio + arquivos[contador].getName().replace(".xml", ".json");
//
//                try (FileWriter fw = new FileWriter(finalPath)) {
//                    fw.write(OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(jCustomer));
//                }
//            }

