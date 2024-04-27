package com.tutorial.clientes.mapper;

import com.tutorial.clientes.dto.ClienteDTO;
import com.tutorial.clientes.model.Cliente;

import java.util.List;

public interface ClienteMapper {

    Cliente toCliente(ClienteDTO clienteDTO);

    ClienteDTO toClienteDto(Cliente cliente);

    List<ClienteDTO> toClienteDtos(List<Cliente> clientes);

    void updateCliente(Cliente cliente, ClienteDTO clienteDTO);
}
