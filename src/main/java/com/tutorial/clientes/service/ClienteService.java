package com.tutorial.clientes.service;

import com.tutorial.clientes.ClienteMapper;
import com.tutorial.clientes.dto.ClienteDTO;
import com.tutorial.clientes.model.Cliente;
import com.tutorial.clientes.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteMapper clienteMapper;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO save(ClienteDTO clienteDTO){
        Cliente cliente = mapper.map(clienteDTO, Cliente.class);
        return mapper.map(clienteRepository.save(cliente), ClienteDTO.class);
    }

    public List<ClienteDTO> getClientes(){
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes.stream().map(cliente -> mapper.map(cliente, ClienteDTO.class))
                .collect(Collectors.toList());
    }

    public ClienteDTO getCliente(Integer id){
       Cliente cliente = clienteRepository.findById(id).get();
       return mapper.map(cliente, ClienteDTO.class);
    }

    public ClienteDTO update(Integer id, ClienteDTO clienteDTO){
        Cliente cliente = clienteRepository.findById(id).get();
        mapper.map(clienteDTO, cliente);
        Cliente updateCliente = clienteRepository.save(cliente);
        return mapper.map(updateCliente, ClienteDTO.class);
    }

    public void delete(Integer id) {
        clienteRepository.deleteById(id);
    }
}
