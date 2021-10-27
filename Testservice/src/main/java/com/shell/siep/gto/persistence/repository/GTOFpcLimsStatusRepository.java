package com.shell.siep.gto.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface GTOFpcLimsStatusRepository<T> extends PagingAndSortingRepository<T, T> {
    List<T> findAllByMeasSampleId(String sampleId);
}
