package com.oracle.jsf.service;

import com.oracle.jsf.dao.ClienteDAO;
import com.oracle.jsf.dao.ClienteDaoImpl;
import com.oracle.jsf.model.Cliente;


public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO clienteDao;
    
    @Override
    public void insertarPersona(Cliente cliente) {
       clienteDao = new ClienteDaoImpl();
       clienteDao.insertarPersona(cliente);
    }

    @Override
    public Cliente buscarCliente(int codigoCliente) {
       clienteDao = new ClienteDaoImpl();
       return clienteDao.buscarCliente(codigoCliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        clienteDao = new ClienteDaoImpl();
        clienteDao.actualizarCliente(cliente);
    }

    @Override
    public void eliminarCliente(int codigoCliente) {
      clienteDao = new ClienteDaoImpl();
      clienteDao.eliminarCliente(codigoCliente);
    }
    
}
