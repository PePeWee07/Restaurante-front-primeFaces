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
public class Valoraciones {
    private long id_valoracion;
    private OffsetDateTime fecha_valoracion;
    private String hora_valoracion;
    private String comentario;
    private Clientes cliente;
    private Menus menu;

    public long getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(long id_valoracion) {
        this.id_valoracion = id_valoracion;
    }

    public OffsetDateTime getFecha_valoracion() {
        return fecha_valoracion;
    }

    public void setFecha_valoracion(OffsetDateTime fecha_valoracion) {
        this.fecha_valoracion = fecha_valoracion;
    }

    public String getHora_valoracion() {
        return hora_valoracion;
    }

    public void setHora_valoracion(String hora_valoracion) {
        this.hora_valoracion = hora_valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Menus getMenu() {
        return menu;
    }

    public void setMenu(Menus menu) {
        this.menu = menu;
    }
    
    
}
