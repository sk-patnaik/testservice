package com.shell.siep.gto.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GTOSampleTypeRepository<T> extends CrudRepository<T, T> {
    List<T> findSampleTypes();
}
