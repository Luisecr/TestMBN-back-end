/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.test.testmodel.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Luis Enrique Cervantes Roldán
 */
@Entity
@Table(name = "tecnologias")
public class Tecnologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tecnologia_id")
    private Integer tecnologiaId;
    @Basic(optional = false)
    @Column(name = "nombre_tecnologia")
    private String nombreTecnologia;
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    @ManyToOne(optional = false)
    private Categoria categoriaId;

    public Tecnologia() {
    }

    public Tecnologia(Integer tecnologiaId) {
        this.tecnologiaId = tecnologiaId;
    }

    public Tecnologia(Integer tecnologiaId, String nombreTecnologia) {
        this.tecnologiaId = tecnologiaId;
        this.nombreTecnologia = nombreTecnologia;
    }

    public Integer getTecnologiaId() {
        return tecnologiaId;
    }

    public void setTecnologiaId(Integer tecnologiaId) {
        this.tecnologiaId = tecnologiaId;
    }

    public String getNombreTecnologia() {
        return nombreTecnologia;
    }

    public void setNombreTecnologia(String nombreTecnologia) {
        this.nombreTecnologia = nombreTecnologia;
    }

    public Categoria getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Categoria categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tecnologiaId != null ? tecnologiaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnologia)) {
            return false;
        }
        Tecnologia other = (Tecnologia) object;
        if ((this.tecnologiaId == null && other.tecnologiaId != null) || (this.tecnologiaId != null && !this.tecnologiaId.equals(other.tecnologiaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.model.entities.Tecnologias[ tecnologiaId=" + tecnologiaId + " ]";
    }
    
}
