package com.shell.siep.gto.persistence.databases.dd.model.pigi;


import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiMaturity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_VR_HEADER")
public class DDPigiMaturity extends DDDatabaseObject implements GTOPigiMaturity, Serializable {

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "VR_MEAN")
	private Double meanValue;

	@Column(name = "VR_ST")
	private Double standardDeviation;

	@Column(name = "VR_NR_OBS")
	private Integer nrObservations;

	@Column(name = "VR_LAB")
	private String vendor;

	@Column(name = "JOB_DATE")
	private Date vendorDateOfService;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_MATURITY;
	}
}
