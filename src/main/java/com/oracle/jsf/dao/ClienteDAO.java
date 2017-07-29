package com.oracle.jsf.dao;

import com.oracle.jsf.model.Cliente;

public interface ClienteDAO {
    
    public void insertarPersona(Cliente cliente);
    
    public Cliente buscarCliente(int codigoCliente);
    
    public void actualizarCliente(Cliente cliente);
    
    public void eliminarCliente(int codigoCliente);
    
    
}
