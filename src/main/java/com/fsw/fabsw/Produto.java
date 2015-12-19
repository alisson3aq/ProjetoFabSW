package com.fsw.fabsw;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prodito")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(generator = "seq", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "nmProtudo", nullable = true, length = 70)
    private String produto;
    @OneToMany
    @Column(name = "idInsumo", nullable = true)
    private Insumos insumo;

    public Produto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Insumos getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumos insumo) {
        this.insumo = insumo;
    }

}
