package com.devsuperior.dsclient.resources;

import com.devsuperior.dsclient.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> list = new ArrayList<>();
        list.add(new Client(1L,"Vitor","156.959.247.07",500.0, Instant.parse("2017-02-03T11:25:30.00Z"),1));
        return ResponseEntity.ok().body(list);
    }
}
