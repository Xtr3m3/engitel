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
 * @author Romell
 */
@Entity
public class Solicitud_Estado extends Model{
    
    @Column(name="ses_antes",nullable=false)
    public String antes;
    @Column(name="ses_despues",nullable=false)
    public String despues;
    @Column(name="ses_fecha_modificacion",nullable=false)
    public Date fecha_modificacion;
    @ManyToOne
    @JoinColumn(name="sol_id",nullable=false)
    public Solicitud solicitud;
    @ManyToOne
    @JoinColumn(name="uen_id",nullable=false)
    public Usuario_Engitel usuario_engitel;
    
}
