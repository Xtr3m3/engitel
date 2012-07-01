/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author Software
 */
@Entity
@Table(name="sub_categoria")
public class Sub_Categoria extends Model{
    
    @Column(name="sbc_categoria",nullable=false)
    public String categoria;
    @Column(name="sbc_nombre",nullable=false)
    public String nombre;
    
}
