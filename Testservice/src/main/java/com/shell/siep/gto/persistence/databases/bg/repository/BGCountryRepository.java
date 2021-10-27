package com.shell.siep.gto.persistence.databases.bg.repository;

import com.shell.siep.gto.persistence.databases.bg.model.BGCountry;
import com.shell.siep.gto.persistence.repository.GTOCountryRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

@Repository
public interface BGCountryRepository extends GTOCountryRepository<BGCountry> {

    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="300"))
    Iterable<BGCountry> findAll();
}
