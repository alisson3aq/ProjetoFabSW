package com.fsw.fabsw;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insumo")
public class Insumos implements Serializable {

    @Id
    @Column(name = "idInsumo")
    @GeneratedValue(generator = "seg", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "strDescicao", length = 70, nullable = false)
    private String descricao;
    @Column(name = "strUnidadeBasica", length = 30, nullable = false)
    private String unidadeBasica;

    public Insumos() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidadeBasica() {
        return unidadeBasica;
    }

    public void setUnidadeBasica(String unidadeBasica) {
        this.unidadeBasica = unidadeBasica;
    }

}
