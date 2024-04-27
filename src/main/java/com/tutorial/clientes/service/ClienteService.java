 
package com.tutorial.clientes.service;


import com.tutorial.clientes.dto.ClienteDTO;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface ClienteService {

    public ClienteDTO save(ClienteDTO clienteDTO);

    public List<ClienteDTO> getClientes();

    public ClienteDTO getCliente(Integer clienteId);

    public ClienteDTO update(Integer clienteId, ClienteDTO clienteDTO);

    public ClienteDTO delete(Integer clienteId);

    
}
