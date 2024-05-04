package com.tutorial.clientes.service;

import com.tutorial.clientes.dto.ClienteDTO;
import com.tutorial.clientes.mapper.ClienteMapper;
import com.tutorial.clientes.model.Cliente;
import com.tutorial.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author USUARIO
 */
@Service
public class ClienteServiceImple implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteMapper clienteMapper;


    @Override
    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toCliente(clienteDTO);
        return clienteMapper.toClienteDto(clienteRepository.save(cliente));
    }

    @Override
    public List<ClienteDTO> getClientes() {
        return clienteMapper.toClienteDtos(clienteRepository.findAll());
    }

    @Override
    public ClienteDTO getCliente(Integer clienteId) {
        Cliente cliente = clienteRepository.findById(clienteId).get();
        return clienteMapper.toClienteDto(cliente);
    }

    @Override
    public ClienteDTO update(Integer clienteId, ClienteDTO clienteDTO) {
        Cliente cliente = clienteRepository.findById(clienteId).get();
        clienteMapper.updateCliente(cliente, clienteMapper.toCliente(clienteDTO));
        return clienteMapper.toClienteDto(clienteRepository.save(cliente));
    }

    @Override
    public ClienteDTO delete(Integer clienteId) {
        Cliente cliente = clienteRepository.findById(clienteId).get();
        ClienteDTO clienteDTO = clienteMapper.toClienteDto(cliente);
        clienteRepository.deleteById(clienteId);
        return clienteDTO;
    }
}
