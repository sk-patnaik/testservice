package com.shell.siep.gto.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface GTOAnalysisRepository<T> extends PagingAndSortingRepository<T, T> {
    public List<T> findAllBySampleIdIn(List<String> sampleId);
}
