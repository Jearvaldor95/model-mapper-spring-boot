package com.tutorial.clientes;

import com.tutorial.clientes.dto.ClienteDTO;
import com.tutorial.clientes.model.Cliente;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteMapper {

    @Autowired
    private ModelMapper mapper;

    public Cliente toCliente(ClienteDTO clienteDTO){
        return mapper.map(clienteDTO, Cliente.class);
    }

    public ClienteDTO toClienteDto(Cliente cliente){
        return mapper.map(cliente, ClienteDTO.class);
    }

    public List<ClienteDTO> clienteDTOS(List<Cliente> clientes){
        return clientes.stream().map(cliente -> mapper.map(cliente, ClienteDTO.class))
                .collect(Collectors.toList());
    }

    public void updateCliente(Cliente cliente, ClienteDTO clienteDTO){
        mapper.map(clienteDTO, cliente);
    }
}
