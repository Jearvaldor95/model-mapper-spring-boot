package com.tutorial.clientes.mapper;

import com.tutorial.clientes.dto.ClienteDTO;
import com.tutorial.clientes.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ClienteMapperImple implements ClienteMapper{
    @Override
    public Cliente toCliente(ClienteDTO clienteDTO) {
        if (clienteDTO == null){
            return  null;
        }

        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getIdCliente());
        cliente.setNombre(clienteDTO.getNombreCliente());
        cliente.setApellidos(clienteDTO.getApellidosCliente());
        cliente.setNumIdentificacion(clienteDTO.getIdentificacionCliente());
        cliente.setTelefono(clienteDTO.getTelefonoCliente());
        cliente.setDireccion(clienteDTO.getDireccionCliente());
        cliente.setEmail(clienteDTO.getEmailCliente());

        return cliente;
    }

    @Override
    public ClienteDTO toClienteDto(Cliente cliente) {
        if (cliente == null){
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setIdCliente(cliente.getId());
        clienteDTO.setNombreCliente(cliente.getNombre());
        clienteDTO.setApellidosCliente(cliente.getApellidos());
        clienteDTO.setIdentificacionCliente(cliente.getNumIdentificacion());
        clienteDTO.setTelefonoCliente(cliente.getTelefono());
        clienteDTO.setDireccionCliente(cliente.getDireccion());
        clienteDTO.setEmailCliente(cliente.getEmail());

        return clienteDTO;
    }

    @Override
    public List<ClienteDTO> toClienteDtos(List<Cliente> clientes) {
        if (clientes == null){
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>(clientes.size());
        for (Cliente cliente : clientes){
            list.add(toClienteDto(cliente));
        }
        return list;
    }

    @Override
    public void updateCliente(Cliente cliente, ClienteDTO clienteDTO) {

        if(clienteDTO == null)
        {
            return;
        }

        cliente.setId(clienteDTO.getIdCliente());
        cliente.setNombre(clienteDTO.getNombreCliente());
        cliente.setApellidos(clienteDTO.getApellidosCliente());
        cliente.setNumIdentificacion(clienteDTO.getIdentificacionCliente());
        cliente.setTelefono(clienteDTO.getTelefonoCliente());
        cliente.setDireccion(clienteDTO.getDireccionCliente());
        cliente.setEmail(clienteDTO.getEmailCliente());


    }
}
