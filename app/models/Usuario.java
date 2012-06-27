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
@Table(name="usuario")
public class Usuario extends Model{
    
    @Column(name="usu_nombre",nullable=false)
    public String nombre;
    @Column(name="usu_email",nullable=false)
    public String email;
    @Column(name="usu_contrasenia",nullable=false)
    public String contrasenia;
    @Column(name="usu_celular", length=45)
    public String celular;
    @Column(name="usu_telefono", length=45)
    public String telefono;
    
}
