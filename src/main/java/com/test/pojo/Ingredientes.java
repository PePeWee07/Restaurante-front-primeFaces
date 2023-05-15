/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.pojo;

import java.util.Date;
import java.time.OffsetDateTime;
/**
 *
 * @author pepew
 */
public class Ingredientes {

   private Long idIngrediente;
    private Proveedores proveedores;
    private String nombreIngrediente;
    private Long cantidadDisponible;
    private OffsetDateTime fechaCaducidad;

    public long getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(long idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public long getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(long cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public OffsetDateTime getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(OffsetDateTime fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

   
    
}
