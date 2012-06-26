/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author Romelito
 */
@Entity
@Table(name="solicitud")
public class Solicitud extends Model{
    
    @Column(name="sol_tipo",nullable=false, length=45)
    String tipo;
    @Column(name="sol_asunto",nullable=false)
    String asunto;
    @Column(name="sol_descripcion",nullable=false)
    String descripcion;
    @Column(name="sol_estado",nullable=false, length=45)
    String estado;
    @ManyToOne
    @JoinColumn(name="cli_id",nullable=false)
    public Cliente cliente;
}
