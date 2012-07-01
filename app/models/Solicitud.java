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
    
    @Column(name="pos_tipo",nullable=false )
    public Producto_Servicio producto_servicio;
    @Column(name="sol_asunto",nullable=false)
    public String asunto;
    @Column(name="sol_descripcion",nullable=false)
    public String descripcion;
    @Column(name="sol_estado",nullable=false, length=45)
    public String estado;
    @ManyToOne
    @JoinColumn(name="cli_id",nullable=false)
    public Cliente cliente;
}
