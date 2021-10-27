package com.shell.siep.gto.persistence.databases.dd.model.pigi;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiMonoAromatic;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_AROMATIC")
public class DDPigiMonoAromatic extends DDDatabaseObject implements GTOPigiMonoAromatic, Serializable {

	@Column(name = "MA_MA_D27BBS")
	private Double maC27V20s;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MA_MA_R27BBS")
	private Double maC27I20s;

	@Column(name = "MA_MA_D28AAR_R28BBR")
	private Double maC28I20rC28V20r;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "MA_MA_R29ABR")
	private Double maC29Ii20r;

	@Column(name = "MA_MA_D29BBR_R29BBR")
	private Double maC29I20rC29V20r;

	@Column(name = "MA_MA_D29BBS_R29BBS")
	private Double maC29I20sC29V20s;

	@Column(name = "MA_MA_D27BBS_R27BBR")
	private Double maC27I20rC27V20r;

	@Column(name = "MA_MA_R28BBS")
	private Double maC28I20s;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_AROMATICS;
	}


}
