package com.oracle.jsf.service;

import com.oracle.jsf.model.Cliente;

/**
 *
 * @author edcastillo
 */
public interface ClienteService {
    
    public void insertarPersona(Cliente cliente);
    
    public Cliente buscarCliente(int codigoCliente);
    
    public void actualizarCliente(Cliente cliente);
    
    public void eliminarCliente(int codigoCliente);
    
}
