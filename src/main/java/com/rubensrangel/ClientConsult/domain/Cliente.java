package com.rubensrangel.ClientConsult.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_cliente")
@Data
public class Cliente implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String tipoPessoa;

    private String name;

    private String cpfCnpj;

    private String email;

    @ManyToOne
    @JoinColumn(name = "arquivoXml")
    private ArquivoXml arquivoXml;

    public Cliente() {
    }

    public Cliente(Integer id, String tipoPessoa, String name, String cpfCnpj, String email, ArquivoXml arquivoXml) {
        Id = id;
        this.tipoPessoa = tipoPessoa;
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.arquivoXml = arquivoXml;
    }
}