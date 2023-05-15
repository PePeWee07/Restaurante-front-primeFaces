/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.pojo;

import java.time.OffsetDateTime;

/**
 *
 * @author pepew
 */
public class Empleados {
    private long id_empleado;
    private String nombre_empleado;
    private String puesto;
    private OffsetDateTime fecha_contratacion;
    private String telefono;

    public long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public OffsetDateTime getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(OffsetDateTime fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
