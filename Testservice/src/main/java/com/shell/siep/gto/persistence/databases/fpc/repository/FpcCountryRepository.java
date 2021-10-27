package com.shell.siep.gto.persistence.databases.fpc.repository;

import com.shell.siep.gto.persistence.databases.fpc.model.FpcCountry;
import com.shell.siep.gto.persistence.repository.GTOCountryRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

@Repository
public interface FpcCountryRepository extends GTOCountryRepository<FpcCountry> {
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="300"))
    Iterable<FpcCountry> findAll();
}
