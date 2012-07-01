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
@Table(name="producto_sevicio")
public class Producto_Servicio extends Model{
    
    @Column(name="pos_nombre",nullable=false)
    public String nombre;
    @JoinColumn(name="sbc_id",nullable=false)
    public Sub_Categoria sub_categoria;

}
