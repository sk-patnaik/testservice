package com.shell.siep.gto.persistence.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface GTOSampleRepository<T, S> extends JpaSpecificationExecutor<T>, PagingAndSortingRepository<T, S> {
    List<Object[]> findNamesByWellIds(List<String> wellIds);
    List<Object[]> findNamesByCountries(List<String> countries);
    List<T> findByFpcWellWellIds(List<String> wellIds, List<String> sampleTypes, Pageable pageable);
    List<T> findByFpcWellWellIds(List<String> wellIds,  Pageable pageable);
    List<T> findAllBySampleIds(List<String> sampleIds, Pageable pageable);
    List<T> findAllBySampleIds(List<String> sampleIds, List<String> sampleTypes, Pageable pageable);
    List<T> findSamplesBySampleIds(List<String> sampleIds);
    List<T> findByCountry(List<String> countries, Pageable pageable);
    List<T> findByCountry(List<String> countries, List<String> sampleTypes, Pageable pageable);
    List<Object[]> findSampleId(String toUpperCase);
}
