/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author Romelito
 */
@Entity
@Table(name="solicitud_auditoria")
public class Solicitud_Auditoria extends Model{
    
    @Column(name="soa_asunto",nullable=false)
    public String asunto;
    @Column(name="soa_descripcion",nullable=false)
    public String descripcion;
    @Column(name="soa_fecha_modificacion",nullable=false)
    public Date fecha_modificacion;
    @ManyToOne
    @JoinColumn(name="sol_id",nullable=false)
    public Solicitud solicitud;
}
