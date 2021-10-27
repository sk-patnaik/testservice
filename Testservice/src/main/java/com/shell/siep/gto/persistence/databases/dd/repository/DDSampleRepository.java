package com.shell.siep.gto.persistence.databases.dd.repository;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.dd.model.DDSample;
import com.shell.siep.gto.persistence.repository.GTOSampleRepository;

@Repository
public interface DDSampleRepository extends GTOSampleRepository<DDSample, String> {

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from DDSample s where upper(s.shWellId) in :wellIds")
    List<Object[]> findNamesByWellIds(@Param("wellIds") List<String> wellIds);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from DDSample s where upper(s.well.country.countryName) in :countries")
    List<Object[]> findNamesByCountries(@Param("countries") List<String> countries);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from DDSample s join fetch s.sampleType " +
            "where s.shWellId in :wellIds and s.sampleType.parent in :sampleTypes")
    List<DDSample> findByFpcWellWellIds(@Param("wellIds") List<String> wellIds, @Param("sampleTypes") List<String> sampleTypes, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from DDSample s join fetch s.sampleType where s.shWellId in :wellIds")
    List<DDSample> findByFpcWellWellIds(@Param("wellIds") List<String> wellIds, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="500"))
    @Query(value = "select s from DDSample s join fetch s.sampleType where s.sampleId in :sampleIds")
    List<DDSample> findAllBySampleIds(@Param("sampleIds") List<String> sampleIds, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="500"))
    @Query(value = "select s from DDSample s join fetch s.sampleType where s.sampleId in :sampleIds " +
            "and s.sampleType.parent in :sampleTypes")
    List<DDSample> findAllBySampleIds(@Param("sampleIds") List<String> sampleIds, @Param("sampleTypes") List<String> sampleTypes, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from DDSample s join fetch s.sampleType where s.well.country.countryName in :countries")
    List<DDSample> findByCountry(@Param("countries") List<String> countries, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from DDSample s join fetch s.sampleType " +
            "where s.well.country.countryName in :countries and s.sampleType.parent in :sampleTypes")
    List<DDSample> findByCountry(@Param("countries") List<String> countries, @Param("sampleTypes") List<String> sampleTypes, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from DDSample s where upper(s.sampleId) like %:sampleId%")
    List<Object[]> findSampleId(@Param("sampleId") String sampleId);

    @Override
    @QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from DDSample s where s.sampleId in :sampleIds")
    List<DDSample> findSamplesBySampleIds(@Param("sampleIds") List<String> sampleIds);

}
