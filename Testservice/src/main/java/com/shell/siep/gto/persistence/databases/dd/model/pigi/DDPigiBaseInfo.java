package com.shell.siep.gto.persistence.databases.dd.model.pigi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiBaseInfo;
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
@Table(name="FPC_SAMPLES")
public class DDPigiBaseInfo extends DDDatabaseObject implements GTOPigiBaseInfo {

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "EXT_SAMPLE_VENDOR")
	private String sampleVendor;

	@Column(name = "SH_CDATE")
	private Date collectionDate;

	@Column(name = "SH_DEPTH_TOP_M")
	private Double topDepth;

	@Column(name = "SH_DEPTH_BOT_M")
	private Double baseDepth;

	@Column(name = "SH_TVD_TOP_M")
	private Double topDepthTVD;

	@Column(name = "SH_TVD_BOT_M")
	private Double baseDepthTVD;

	@Column(name = "SH_SAMPLE_TYPE")
	private String sampleType;

	@Column(name = "SH_FORM")
	private String formationTop;

	@Column(name = "SH_FORM_BOT")
	private String formationBottom;

	@Column(name = "SH_LITHOLOGY")
	private String lithology;

	@Transient
	private String requestId;

	@ManyToOne
	@JsonIgnore
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "WELL_ID", referencedColumnName = "WELL_ID")
	private DDPigiWell well;

	@Override
	public Double getDerrickFloorElev() {
		return well.getWhDrElev();
	}

	@Override
	public Double getWaterDepth() {
		return well.getWhWaterDepth();
	}

	@Override
	public String getBasinName() {
		return well.getWhBasin();
	}

	@Override
	public String getWellName() {
		return well.getWellName();
	}

	@Override
	public Double getLat() {
		return well.getWhLat();
	}

	@Override
	public Double getLong() {
		return well.getWhLong();
	}

	@Override
	public String getCountry() {
		return well.getCountry().getCountryName();
	}

	@Override
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
	   	this.requestId = requestId;
	}

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_BASE_INFO;
	}
}
