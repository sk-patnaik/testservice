package com.shell.siep.gto.persistence.databases.sgs.repository;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.sgs.model.SGSSample;
import com.shell.siep.gto.persistence.repository.GTOSampleRepository;

@Repository
public interface SGSSampleRepository extends GTOSampleRepository<SGSSample, String> {

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from SGSSample s where upper(s.shWellId) in :wellIds")
    List<Object[]> findNamesByWellIds(@Param("wellIds") List<String> wellIds);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from SGSSample s where upper(s.well.country.countryName) in :countries")
    List<Object[]> findNamesByCountries(@Param("countries") List<String> countries);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from SGSSample s where s.shWellId in :wellIds and s.shSampleType in :sampleTypes")
    List<SGSSample> findByFpcWellWellIds(@Param("wellIds") List<String> wellIds, @Param("sampleTypes") List<String> sampleTypes, Pageable pageable);


    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from SGSSample s where s.shWellId in :wellIds")
    List<SGSSample> findByFpcWellWellIds(@Param("wellIds") List<String> wellIds, Pageable pageable);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="500"))
    @Query(value = "select s from SGSSample s where s.sampleId in :sampleIds")
    List<SGSSample> findAllBySampleIds(@Param("sampleIds") List<String> sampleIds, Pageable pageable);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="500"))
    @Query(value = "select s from SGSSample s where s.sampleId in :sampleIds and s.shSampleType in :sampleTypes")
    List<SGSSample> findAllBySampleIds(@Param("sampleIds") List<String> sampleIds, @Param("sampleTypes") List<String> sampleTypes, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from SGSSample s where s.well.country.countryName in :countries ")
    List<SGSSample> findByCountry(@Param("countries") List<String> countries, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from SGSSample s where s.well.country.countryName in :countries " + "and s.shSampleType in :sampleTypes")
    List<SGSSample> findByCountry(@Param("countries") List<String> countries, @Param("sampleTypes") List<String> sampleTypes, Pageable pageable);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from SGSSample s where upper(s.sampleId) like %:sampleId%")
    List<Object[]> findSampleId(@Param("sampleId") String sampleId);

    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="20"))
    @Query(value = "select distinct s.shSampleType from SGSSample s")
    List<String> findDistinctSampleType();

    @Override
    @QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from SGSSample s where s.sampleId in :sampleIds")
    List<SGSSample> findSamplesBySampleIds(@Param("sampleIds") List<String> sampleIds);


}
