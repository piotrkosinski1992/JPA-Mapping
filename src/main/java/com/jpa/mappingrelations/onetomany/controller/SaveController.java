package com.jpa.mappingrelations.onetomany.controller;

import com.jpa.mappingrelations.onetomany.RowEntity;
import com.jpa.mappingrelations.onetomany.VinEntity;
import com.jpa.mappingrelations.onetomany.repo.RowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class SaveController {

    @Autowired
    private RowRepo rowRepo;

    @PostMapping
    public void saveRow(@RequestBody RowEntity row) {
        Collection<VinEntity> vinEntities = row.getVins();
        vinEntities.forEach(vinEntity -> vinEntity.setRow(row));
        rowRepo.save(row);


    }

    @DeleteMapping("/{keyField}")
    public void deleteByKeyField(@PathVariable String keyField) {
        rowRepo.deleteById(keyField);
    }
}
