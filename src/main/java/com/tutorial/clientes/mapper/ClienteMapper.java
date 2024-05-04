package com.tutorial.clientes.mapper;

import com.tutorial.clientes.dto.ClienteDTO;
import com.tutorial.clientes.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mappings({
            @Mapping(target = "id", source = "idCliente"),
            @Mapping(target = "nombre", source = "nombreCliente"),
            @Mapping(target = "apellidos", source = "apellidosCliente"),
            @Mapping(target = "numIdentificacion", source = "identificacionCliente"),
            @Mapping(target = "direccion", source = "direccionCliente"),
            @Mapping(target = "telefono", source = "telefonoCliente"),
            @Mapping(target = "email", source = "emailCliente")
    })
    Cliente toCliente(ClienteDTO clienteDTO);

    @Mappings({
            @Mapping(target = "idCliente", source = "id"),
            @Mapping(target = "nombreCliente", source = "nombre"),
            @Mapping(target = "apellidosCliente", source = "apellidos"),
            @Mapping(target = "identificacionCliente", source = "numIdentificacion"),
            @Mapping(target = "direccionCliente", source = "direccion"),
            @Mapping(target = "telefonoCliente", source = "telefono"),
            @Mapping(target = "emailCliente", source = "email")
    })
    ClienteDTO toClienteDto(Cliente cliente);

    List<ClienteDTO> toClienteDtos(List<Cliente> clientes);

    void updateCliente(@MappingTarget Cliente cliente, Cliente clienteDTO);
}
