package com.shell.siep.gto.persistence.databases.bg.repository;

import com.shell.siep.gto.persistence.databases.bg.model.BGSampleType;
import com.shell.siep.gto.persistence.repository.GTOSampleTypeRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface BGSampleTypeRepository extends GTOSampleTypeRepository<BGSampleType> {

    @QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="20"))
    @Query(value = "select t from BGSampleType t where t.parent is null")
    List<BGSampleType> findSampleTypes();
}
