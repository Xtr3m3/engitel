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
@Table(name="archivo")
public class Archivo extends Model {

    @Column(name="arc_ruta",nullable=false)
    String ruta;
    @ManyToOne
    @JoinColumn(name="sol_id",nullable=false)
    public Solicitud solicitud;
}
