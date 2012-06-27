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
@Table(name="usuario_engitel")
public class Usuario_Engitel extends Model{

    @Column(name="uen_cargo",nullable=false)
    public String cargo;
    @JoinColumn(name="usu_id",nullable=false)
    public Usuario usuario;
}
