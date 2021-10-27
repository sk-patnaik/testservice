package com.shell.siep.gto.persistence.databases.fpc.model.pigi;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcIsotopesGas;
import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcIsotopesRock;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiIsotopeParameters;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ISOTOPES_OIL", schema = "gfs")
public class FpcPigiIsotopeParameters extends FpcDatabaseObject implements GTOPigiIsotopeParameters, Serializable {

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "DC_O_TOP")
	private Double dcOOil;

	@Column(name = "DC_O_NSO")
	private Double  dcONso;

	@Column(name = "DC_O_SAT")
	private Double  dcOSat;

	@Column(name = "DC_O_ARO")
	private Double  dcOAro;

	@Column(name = "DC_O_ASPH")
	private Double  dcOAsph;

	@Column(name = "DD_O_WHO")
	private Double  ddOWho;

	@Column(name = "DS_O_WHO")
	private Double  dsOWho;

	@Column(name = "D_O_LAB")
	private String lab;

	@Column(name = "D_O_DATE")
	private Date doAcqDate;

	@OneToOne
	@JsonIgnore
	@JoinColumn(updatable=false,insertable=false, name="SAMPLE_ID", referencedColumnName="SAMPLE_ID")
	@JoinColumn(updatable=false,insertable=false, name="REQUEST_ID", referencedColumnName="REQUEST_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private FpcIsotopesRock isotopesRock;

	@Override
	public Double getDcRKer() {
		return (isotopesRock == null)? null: isotopesRock.getDcRKer();
	}

	@Override
	public Double getDcRCalcite() {
		return (isotopesRock == null)? null: isotopesRock.getDcRCalcite();
	}

	@Override
	public Double getDoRCalcite() {
		return (isotopesRock == null)? null: isotopesRock.getDoRCalcite();
	}

	@OneToOne
	@JsonIgnore
	@JoinColumn(updatable=false,insertable=false, name="SAMPLE_ID", referencedColumnName="SAMPLE_ID")
	@JoinColumn(updatable=false,insertable=false, name="REQUEST_ID", referencedColumnName="REQUEST_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private FpcIsotopesGas isotopesGas;

	@Override
	public Double getCsiaNc1() {
		return (isotopesGas == null)? null: isotopesGas.getCsiaNc1();
	}

	@Override
	public Double getCsiaNc2() {
		return (isotopesGas == null)? null: isotopesGas.getCsiaNc2();
	}

	@Override
	public Double getCsiaNc3() {
		return (isotopesGas == null)? null: isotopesGas.getCsiaNc3();
	}

	@Override
	public Double getCsiaNc4() {
		return (isotopesGas == null)? null: isotopesGas.getCsiaNc4();
	}

	@Override
	public Double getCsiaIc4() {
		return (isotopesGas == null)? null: isotopesGas.getCsiaIc4();
	}

	@Override
	public Double getDnGN2() {
		return (isotopesGas == null)? null: isotopesGas.getDnGN2();
	}

	@Override
	public Double getDdGNc1() {
		return (isotopesGas == null)? null: isotopesGas.getDdGNc1();
	}

	@Override
	public Double getDsGH2s() {
		return (isotopesGas == null)? null: isotopesGas.getDsGH2s();
	}

	@Override
	public Double getDcGCo2() {
		return (isotopesGas == null)? null: isotopesGas.getDcGCo2();
	}

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_ISOTOPE_PARAMETERS;
	}
}
