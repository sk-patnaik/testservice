package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcSaturate;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_SATURATE")
public class DDGcSaturate extends DDDatabaseObject implements GTOGcSaturate, Serializable {

	@Column(name = "GS_PRISTANE")
	private Double satPr;

	@Column(name = "GS_PHYTANE")
	private Double satPh;

	@Column(name = "GS_QC")
	private String satQc;

	@Column(name = "GS_METHOD")
	private String satMethod;

	@Column(name = "JOB_ID")
	private String satJobId;

	@Column(name = "GS_PR17")
	private Double satPr17;

	@Column(name = "GS_DATA_TYPE")
	private String satDataType;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "GS_COMMENT")
	private String satComments;

	@Column(name = "GS_LAB")
	private String satLab;

	@Column(name = "GS_DATE")
	private Date satAcqDate;

	@Column(name = "GS_IP18")
	private Double satIc18;

	@Column(name = "GS_IP16")
	private Double satIc16;

	@Column(name = "GS_IP14")
	private Double satIc14;

	@Column(name = "GS_IP15")
	private Double satIc15;

	@Column(name = "GS_IP12")
	private Double satIc12;

	@Column(name = "GS_IP13")
	private Double satIc13;

	@Column(name = "QC_DATE")
	private Date satQcDate;

	@Column(name = "GS_PH18")
	private Double satPh18;

	@Column(name = "GS_NC10")
	private Double satNc10;

	@Column(name = "GS_NC11")
	private Double satNc11;

	@Column(name = "GS_NC12")
	private Double satNc12;

	@Column(name = "GS_NC17")
	private Double satNc17;

	@Column(name = "GS_NC18")
	private Double satNc18;

	@Column(name = "GS_NC19")
	private Double satNc19;

	@Column(name = "GS_NC13")
	private Double satNc13;

	@Column(name = "GS_NC14")
	private Double satNc14;

	@Column(name = "GS_NC15")
	private Double satNc15;

	@Column(name = "GS_NC16")
	private Double satNc16;

	@Column(name = "GS_NC31")
	private Double satNc31;

	@Column(name = "GS_NC32")
	private Double satNc32;

	@Column(name = "GS_NC33")
	private Double satNc33;

	@Column(name = "GS_NC34")
	private Double satNc34;

	@Column(name = "GS_NC30")
	private Double satNc30;

	@Column(name = "GS_NC39")
	private Double satNc39;

	@Column(name = "GS_NC35")
	private Double satNc35;

	@Column(name = "GS_NC36")
	private Double satNc36;

	@Column(name = "GS_NC37")
	private Double satNc37;

	@Column(name = "GS_NC38")
	private Double satNc38;

	@Column(name = "GS_NC20")
	private Double satNc20;

	@Column(name = "GS_NC21")
	private Double satNc21;

	@Column(name = "GS_NC22")
	private Double satNc22;

	@Column(name = "GS_NC23")
	private Double satNc23;

	@Column(name = "GS_NC28")
	private Double satNc28;

	@Column(name = "GS_NC29")
	private Double satNc29;

	@Column(name = "GS_NC24")
	private Double satNc24;

	@Column(name = "GS_NC25")
	private Double satNc25;

	@Column(name = "GS_NC26")
	private Double satNc26;

	@Column(name = "GS_NC27")
	private Double satNc27;

	@Column(name = "GS_NC42")
	private Double satNc42;

	@Column(name = "GS_NC43")
	private Double satNc43;

	@Column(name = "GS_NC44")
	private Double satNc44;

	@Column(name = "GS_NC45")
	private Double satNc45;

	@Column(name = "GS_NC40")
	private Double satNc40;

	@Column(name = "GS_NC41")
	private Double satNc41;

	@Column(name = "GS_AUTHOR")
	private String satAuthor;

	@Column(name = "RUN_NUMBER")
	private String satRunNumber;

	@Column(name = "GS_PRPH")
	private Double satPrph;

	@Column(name = "SVC_CODE")
	private String satSvcCode;

	@Column(name = "SAMPLE_ID_VEND")
	private String satSampleIdVend;

	@Column(name = "QC_USER")
	private String satQcUser;

	@Column(name = "IQM_CODE")
	private String satIqmCode;

	@Column(name = "LAST_UPDATE")
	private Date satLastUpdate;

	@Column(name = "GS_DATE", insertable = false, updatable = false)
	private Date satDate;

	@Transient
	private Double x5atCpi5;

	@Transient
	private Double x5atCpiOther;

	@Transient
	private Double satIc11;

	@Transient
	private Double satCpi1;

	@Transient
	private Double satCpi2;

	@Transient
	private String satPrep;

	@Transient
	private Double satCpi3;

	@Transient
	private Double satCpi4;

	@Override
	public String getName() {
		return AnalysisConstants.GC_SATURATES;
	}

}
