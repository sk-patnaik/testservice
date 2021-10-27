package com.shell.siep.gto.persistence.databases.dd.repository;

import com.shell.siep.gto.persistence.databases.dd.model.DDSampleType;
import com.shell.siep.gto.persistence.repository.GTOSampleTypeRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface DDSampleTypeRepository extends GTOSampleTypeRepository<DDSampleType> {

    @QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="20"))
    @Query(value = "select t from DDSampleType t where t.parent is null")
    List<DDSampleType> findSampleTypes();
}
