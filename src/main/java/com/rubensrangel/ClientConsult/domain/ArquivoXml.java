package com.rubensrangel.ClientConsult.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_arquivoxml")
@Data
public class ArquivoXml implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String nomeArquivo;

    private Date dataGeracao;

    private String tipoDeArquivo;

    private String Diretorio;

    @Lob

    private byte[] conteudoArquivoXml;

    public ArquivoXml(Integer id, String nomeArquivo, Date dataGeracao, String tipoDeArquivo, String diretorio, byte[] arquivoXml) {
        Id = id;
        this.nomeArquivo = nomeArquivo;
        this.dataGeracao = dataGeracao;
        this.tipoDeArquivo = tipoDeArquivo;
        Diretorio = diretorio;
        conteudoArquivoXml = arquivoXml;
    }

    public ArquivoXml() {
    }
}