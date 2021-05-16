package com.devsuperior.dsclient.services;

import com.devsuperior.dsclient.entities.Client;
import com.devsuperior.dsclient.respositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    public ClientRepository repository;

    @Transactional(readOnly = true)
    public List<Client> findAll(){
        return repository.findAll();
    }
}
