package com.shell.siep.gto.persistence.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


@NoRepositoryBean
public interface GTOCountryRepository<T> extends PagingAndSortingRepository<T, T> {
   List<T> findAllByCountryName(String countryName);
}
