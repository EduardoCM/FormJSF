package com.oracle.jsf.controller;

import com.oracle.jsf.model.Cliente;
import com.oracle.jsf.service.ClienteService;
import com.oracle.jsf.service.ClienteServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@RequestScoped
public class ClienteMB {
    
    private Cliente cliente;
    
    private ClienteService clienteService;
    
    private static List<Cliente> lstCliente = new ArrayList<>();
 
    private Map<String, String> lstEstado = new HashMap<String, String>();   
    @PostConstruct
    public void init(){
        cliente = new Cliente();
    }
    public ClienteMB(){
        
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Map<String, String> getLstEstado() {
        return lstEstado;
    }

    public void setLstEstado(Map<String, String> lstEstado) {
        this.lstEstado = lstEstado;
    }

    public List<Cliente> getLstCliente() {
        return lstCliente;
    }

    public void setLstCliente(List<Cliente> lstCliente) {
        ClienteMB.lstCliente = lstCliente;
    }
    
    

  

    
    public void guardar(){
        clienteService = new ClienteServiceImpl();     
        System.out.println("::::: Persona ::::: " + cliente);
        clienteService.insertarPersona(cliente);
        ClienteMB.lstCliente.add(cliente);
        cliente = new Cliente();
    }
    
    public void eliminarCliente(Cliente cliente){
        clienteService = new ClienteServiceImpl();
        System.out.println("Eliminando Persona:: " + cliente);
        clienteService.eliminarCliente(9);
        ClienteMB.lstCliente.remove(cliente);
    }
    
    
    public void cargarEstados(AjaxBehaviorEvent event) {
        
        System.out.println("========== Pais ==========" + cliente.getPais());
        
        switch(cliente.getPais()){
            
            case "1":
                lstEstado.put("Uno", "1");
                lstEstado.put("Dos", "2");
                break;
            case "2":
                lstEstado.put("Tres", "3");
                lstEstado.put("Cuatro", "4");
                break;
                
            case "3":
                lstEstado.put("Cinco", "5");
                lstEstado.put("Seis", "6");
                break;
        }
        
        
    }
    
}
