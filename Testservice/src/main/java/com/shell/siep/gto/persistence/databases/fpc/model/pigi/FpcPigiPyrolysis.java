package com.shell.siep.gto.persistence.databases.fpc.model.pigi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcChnos;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiPyrolysis;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="FPC_ROCK_PYRO", schema="gfs")
public class FpcPigiPyrolysis extends FpcDatabaseObject implements GTOPigiPyrolysis {

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name= "REQUEST_ID")
	private String requestId;

	@Column(name = "RP_GAS")
	private Double freeGas;

	@Column(name = "RP_DIST")
	private Double distillableHC;

	@Column(name = "RP_PYRO")
	private Double prolizableHC;

	@Column(name = "RP_CO2")
	private Double organicCO2;

	@Column(name = "RP_TMAX")
	private Integer tmax;

	@Column(name = "RP_LAB")
	private String laboratory;

	@Column(name = "RP_DATE")
	private Date acquisitionDate;


	@OneToOne
	@JsonIgnore
	@JoinColumn(updatable=false,insertable=false, name="SAMPLE_ID", referencedColumnName="SAMPLE_ID")
	@JoinColumn(updatable=false,insertable=false, name="REQUEST_ID", referencedColumnName="REQUEST_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private FpcChnos gasComposition;

	@Override
	public Double getHydrogen() {
		return (gasComposition== null)? null: gasComposition.getChnosH();
	}

	@Override
	public Double getCarbon() {
		return (gasComposition== null)? null: gasComposition.getChnosC();
	}

	@Override
	public Double getNitrogen() {
		return (gasComposition== null)? null: gasComposition.getChnosN();
	}

	@Override
	public Double getSulphur() {
		return (gasComposition== null)? null: gasComposition.getChnosS();
	}

	@Override
	public Double getOxygen() {
		return (gasComposition== null)? null: gasComposition.getChnosO();
	}

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_PYROYSIS;
	}
}
