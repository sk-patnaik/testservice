package com.shell.siep.gto.persistence.databases.dd.repository;

import com.shell.siep.gto.persistence.databases.dd.model.DDCountry;
import com.shell.siep.gto.persistence.repository.GTOCountryRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

@Repository
public interface DDCountryRepository extends GTOCountryRepository<DDCountry> {

    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="300"))
    Iterable<DDCountry> findAll();
}
