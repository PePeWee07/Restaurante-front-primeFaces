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
public class Ordenes {
   private long id_orden;
    private Menus menu;
    private Clientes cliente;
    private Empleados empleado;
    private long num_mesa;
    private OffsetDateTime fecha_pedido;
    private long cantidad; 

    public long getId_orden() {
        return id_orden;
    }

    public void setId_orden(long id_orden) {
        this.id_orden = id_orden;
    }

    public Menus getMenu() {
        return menu;
    }

    public void setMenu(Menus menu) {
        this.menu = menu;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public long getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(long num_mesa) {
        this.num_mesa = num_mesa;
    }

    public OffsetDateTime getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(OffsetDateTime fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
