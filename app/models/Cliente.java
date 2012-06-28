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
@Table(name="cliente")
public class Cliente extends Model{
    
    @Column(name="cli_empresa",nullable=false)
    public String empresa;
    @Column(name="cli_direccion",nullable=false)
    public String direccion;
    @Column(name="cli_departamento",length=45)
    public String departamento;
    @Column(name="cli_provincia",length=45)
    public String provincia;
    @Column(name="cli_distrito",length=45)
    public String distrito;
    @Column(name="cli_ruc",length=45)
    public String ruc;
    @Column(name="cli_codigo_activacion",nullable=false)
    public String codigo_activacion;
    @JoinColumn(name="usu_id",nullable=false)
    public Usuario usuario;
    
}
