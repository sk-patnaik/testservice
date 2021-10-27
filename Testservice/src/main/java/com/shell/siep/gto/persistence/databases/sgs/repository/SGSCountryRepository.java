package com.shell.siep.gto.persistence.databases.sgs.repository;

import com.shell.siep.gto.persistence.databases.sgs.model.SGSCountry;
import com.shell.siep.gto.persistence.repository.GTOCountryRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

@Repository
public interface SGSCountryRepository extends GTOCountryRepository<SGSCountry> {
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="300"))
    Iterable<SGSCountry> findAll();
}
