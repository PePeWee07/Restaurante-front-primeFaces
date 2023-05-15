/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.controller;

import com.test.pojo.Empleados;
import com.test.pojo.Ingredientes;
import com.test.pojo.Menus;
import com.test.pojo.Ordenes;
import com.test.pojo.Promociones;
import com.test.pojo.Proveedores;
import com.test.pojo.Valoraciones;
import com.test.service.SpringRestConsumer;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pepew
 */

@Named(value = "servidorController")
@ViewScoped
public class ServidorController implements Serializable{

    List<Promociones> lstPromociones = new ArrayList<>();
    public void callApiPromociones(){
        SpringRestConsumer restConsumer=new SpringRestConsumer();
        lstPromociones = (List<Promociones>) restConsumer.consumeApi("/promociones");
        addMessage(FacesMessage.SEVERITY_INFO, "Promociones", "La lista fue cargada correctamente");
    }
    
    List<Ingredientes> lstIngredientes = new ArrayList<>();
    public void callApiIngredientes(){
        SpringRestConsumer restConsumer = new SpringRestConsumer();
         lstIngredientes =  (List<Ingredientes>) restConsumer.consumeApi("/ingredientes");
         addMessage(FacesMessage.SEVERITY_INFO, "Ingredientes", "La lista fue cargada correctamente");
    }
    
     List<Proveedores> lstProveedores = new ArrayList<>();
    public void callApiProveedores(){
        SpringRestConsumer restConsumer = new SpringRestConsumer();
         lstProveedores =  (List<Proveedores>) restConsumer.consumeApi("/proveedores");
         addMessage(FacesMessage.SEVERITY_INFO, "Proveedores", "La lista fue cargada correctamente");
    }
    
    List<Menus> lstMenus = new ArrayList<>();
    public void callApiMenus(){
        SpringRestConsumer restConsumer = new SpringRestConsumer();
         lstMenus =  (List<Menus>) restConsumer.consumeApi("/menus");
         addMessage(FacesMessage.SEVERITY_INFO, "Menus", "La lista fue cargada correctamente");
    }
    
    List<Empleados> lstEmpleados = new ArrayList<>();
    public void callApiEmpleados(){
        SpringRestConsumer restConsumer = new SpringRestConsumer();
         lstEmpleados =  (List<Empleados>) restConsumer.consumeApi("/empleados");
         addMessage(FacesMessage.SEVERITY_INFO, "Empleados", "La lista fue cargada correctamente");
    }
    
    List<Ordenes> lstOrdenes = new ArrayList<>();
    public void callApiOrdenes(){
        SpringRestConsumer restConsumer = new SpringRestConsumer();
         lstOrdenes =  (List<Ordenes>) restConsumer.consumeApi("/ordenes");
         addMessage(FacesMessage.SEVERITY_INFO, "Ordenes", "La lista fue cargada correctamente");
    }
    
    List<Valoraciones> lstValoraciones = new ArrayList<>();
    public void callApiValoraciones(){
        SpringRestConsumer restConsumer = new SpringRestConsumer();
         lstValoraciones =  (List<Valoraciones>) restConsumer.consumeApi("/valoraciones");
         addMessage(FacesMessage.SEVERITY_INFO, "Valoraciones", "La lista fue cargada correctamente");
    }
    
            
       
    //OTROS METODOS
       
    public void limpiar(){
        lstPromociones.clear();
        addMessage(FacesMessage.SEVERITY_INFO, "Atención", "Lista Limpiada");
    }
    
    public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }
    
    
    
    //GET AND SET

    public List<Promociones> getLstPromociones() {
        return lstPromociones;
    }

    public void setLstPromociones(List<Promociones> lstPromociones) {
        this.lstPromociones = lstPromociones;
    }

    public List<Ingredientes> getLstIngredientes() {
        return lstIngredientes;
    }

    public void setLstIngredientes(List<Ingredientes> lstIngredientes) {
        this.lstIngredientes = lstIngredientes;
    }

    public List<Proveedores> getLstProveedores() {
        return lstProveedores;
    }

    public void setLstProveedores(List<Proveedores> lstProveedores) {
        this.lstProveedores = lstProveedores;
    }

    public List<Menus> getLstMenus() {
        return lstMenus;
    }

    public void setLstMenus(List<Menus> lstMenus) {
        this.lstMenus = lstMenus;
    }

    public List<Empleados> getLstEmpleados() {
        return lstEmpleados;
    }

    public void setLstEmpleados(List<Empleados> lstEmpleados) {
        this.lstEmpleados = lstEmpleados;
    }

    public List<Ordenes> getLstOrdenes() {
        return lstOrdenes;
    }

    public void setLstOrdenes(List<Ordenes> lstOrdenes) {
        this.lstOrdenes = lstOrdenes;
    }

    public List<Valoraciones> getLstValoraciones() {
        return lstValoraciones;
    }

    public void setLstValoraciones(List<Valoraciones> lstValoraciones) {
        this.lstValoraciones = lstValoraciones;
    }

    

    
    
}
