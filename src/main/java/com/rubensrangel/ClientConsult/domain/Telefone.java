package com.rubensrangel.ClientConsult.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_telefones")
@Data
public class Telefone {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer ddd;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    public Telefone() {
    }

    public Telefone(Long id, Integer ddd, String numero, Cliente cliente) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.cliente = cliente;
    }
}
