package com.shell.siep.gto.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface GTOWellRepository<T, S> extends JpaSpecificationExecutor<T>, PagingAndSortingRepository<T, S> {
    List<Object[]> findExistingIds(List<String> wellIds);
    List<Object[]> findExistingIds(List<String> countries, List<String> wellIds);
    List<Object[]> findIdsFromCountries(List<String> countries);
    List<Object[]> findWellId(String toUpperCase);
    List<Object[]> findWellIdWithLatLong(List<String> countries, List<String> wellIds);
    List<Object[]> findWellIdWithLatLongBySamples(List<String> countries, List<String> wellIds, List<String> sampleIds);
}
