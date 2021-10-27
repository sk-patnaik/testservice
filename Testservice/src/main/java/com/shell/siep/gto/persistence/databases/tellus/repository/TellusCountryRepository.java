package com.shell.siep.gto.persistence.databases.tellus.repository;

import com.shell.siep.gto.persistence.databases.tellus.model.TellusCountry;
import com.shell.siep.gto.persistence.repository.GTOCountryRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

@Repository
public interface TellusCountryRepository extends GTOCountryRepository<TellusCountry> {
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="300"))
    Iterable<TellusCountry> findAll();
}
