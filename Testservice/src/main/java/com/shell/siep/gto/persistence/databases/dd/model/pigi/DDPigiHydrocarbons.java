package com.shell.siep.gto.persistence.databases.dd.model.pigi;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilNiv;
import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilSulf;
import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilWax;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiHydrocarbons;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GAS_COMPOSITION")
public class DDPigiHydrocarbons extends DDDatabaseObject implements GTOPigiHydrocarbons, Serializable {

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "GAS_CO2")
	private Double co2AirFreeMol;

	@Column(name = "GAS_N2")
	private Double nitrogenAirFreeMol;

	@Column(name = "GAS_H2S")
	private Double h2sAirFreeMol;

	@Column(name = "GAS_H2")
	private Double hydrogenAirFreeMol;

	@Column(name = "GAS_HE")
	private Double heAirFreeMol;

	@Column(name = "GAS_NC1")
	private Double methaneAirFreeMol;

	@Column(name = "GAS_NC2")
	private Double ethaneAirFreeMol;

	@Column(name = "GAS_NC3")
	private Double propainAirFreeMol;

	@Column(name = "GAS_2MPR")
	private Double isoButaneAirFreeMol;

	@Column(name = "GAS_NC4")
	private Double normalButaneAirFreeMol;

	@Column(name = "GAS_NC5_PLUS")
	private Double c5FractionAirFreeMol;

	@Column(name = "GAS_2MB")
	private Double isoPentaneAirFreeMol;

	@Column(name = "GAS_NC5")
	private Double normalPentaneAirFreeMol;

	@Column(name = "GAS_NC6_PLUS")
	private Double c6FractionAirFreeMol;

	@Column(name = "GAS_SP_GR")
	private Double specificGravity;

	@OneToOne
	@JsonIgnore
	@JoinColumn(updatable=false,insertable=false, name="SAMPLE_ID", referencedColumnName="SAMPLE_ID")
	@JoinColumn(updatable=false,insertable=false, name="REQUEST_ID", referencedColumnName="REQUEST_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private DDOilNiv oilNiv;

	@Override
	public Double getNickel() {
		return (oilNiv == null)? null: oilNiv.getNi();
	}

	@Override
	public Double getVanadium() {
		return (oilNiv == null)? null: oilNiv.getV();
	}

	@OneToOne
	@JsonIgnore
	@JoinColumn(updatable=false,insertable=false, name="SAMPLE_ID", referencedColumnName="SAMPLE_ID")
	@JoinColumn(updatable=false,insertable=false, name="REQUEST_ID", referencedColumnName="REQUEST_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private DDOilSulf oilSulf;

	@Override
	public Double getSulphur() {
		return (oilSulf== null)? null: oilSulf.getSulfValue();
	}

	@OneToOne
	@JsonIgnore
	@JoinColumn(updatable=false,insertable=false, name="SAMPLE_ID", referencedColumnName="SAMPLE_ID")
	@JoinColumn(updatable=false,insertable=false, name="REQUEST_ID", referencedColumnName="REQUEST_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private DDOilWax oilWax;

	@Override
	public Double getWaxContent() {
		return (oilWax== null)? null: oilWax.getWaxValue();
	}

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_HYDROCARBONS;
	}
}
