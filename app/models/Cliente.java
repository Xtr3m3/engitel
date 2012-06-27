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
@Table(name="cliente")
public class Cliente extends Model{
    
    @Column(name="cli_empresa",nullable=false)
    public String empresa;
    @JoinColumn(name="usu_id",nullable=false)
    public Usuario usuario;
    
}
