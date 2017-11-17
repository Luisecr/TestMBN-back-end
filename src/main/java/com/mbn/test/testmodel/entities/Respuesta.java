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
@Table(name = "respuestas")

public class Respuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "respuesta_id")
    private Integer respuestaId;
    @Column(name = "teorico")
    private Integer teorico;
    @Column(name = "practico")
    private Integer practico;
    @Column(name = "proyecto")
    private Integer proyecto;
    @JoinColumn(name = "tecnologia_id", referencedColumnName = "categoria_id")
    @ManyToOne(optional = false)
    private Categoria tecnologiaId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;

    public Respuesta() {
    }

    public Respuesta(Integer respuestaId) {
        this.respuestaId = respuestaId;
    }

    public Integer getRespuestaId() {
        return respuestaId;
    }

    public void setRespuestaId(Integer respuestaId) {
        this.respuestaId = respuestaId;
    }

    public Integer getTeorico() {
        return teorico;
    }

    public void setTeorico(Integer teorico) {
        this.teorico = teorico;
    }

    public Integer getPractico() {
        return practico;
    }

    public void setPractico(Integer practico) {
        this.practico = practico;
    }

    public Integer getProyecto() {
        return proyecto;
    }

    public void setProyecto(Integer proyecto) {
        this.proyecto = proyecto;
    }

    public Categoria getTecnologiaId() {
        return tecnologiaId;
    }

    public void setTecnologiaId(Categoria tecnologiaId) {
        this.tecnologiaId = tecnologiaId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (respuestaId != null ? respuestaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Respuesta)) {
            return false;
        }
        Respuesta other = (Respuesta) object;
        if ((this.respuestaId == null && other.respuestaId != null) || (this.respuestaId != null && !this.respuestaId.equals(other.respuestaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.model.entities.Respuestas[ respuestaId=" + respuestaId + " ]";
    }
    
}
