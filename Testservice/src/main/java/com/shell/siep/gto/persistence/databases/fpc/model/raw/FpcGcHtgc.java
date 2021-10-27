package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcHtgc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_HTGC", schema="gfs")
public class FpcGcHtgc extends FpcDatabaseObject implements GTOGcHtgc, Serializable {

	@Column(name = "GH_WAX")
	private Double htgcWax;

	@Column(name = "SAMPLE_ID_VEND")
	private String htgcSampleIdVend;

	@Column(name = "GH_PRPH")
	private Double htgcPrph;

	@Column(name = "GH_PRISTANE")
	private Double htgcPristane;

	@Column(name = "JOB_ID")
	private String htgcJobId;

	@Column(name = "GH_PR17")
	private Double htgcPr17;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "GH_LAB")
	private String htgcLab;

	@Column(name = "GH_PH18")
	private Double htgcPh18;

	@Column(name = "GH_AUTHOR")
	private String htgcAuthor;

	@Column(name = "GH_QC")
	private String htgcQc;

	@Column(name = "GH_DATA_TYPE")
	private String htgcDataType;

	@Column(name = "GH_IP18")
	private Double htgcIc18;

	@Column(name = "GH_IP15")
	private Double htgcIc15;

	@Column(name = "GH_IP14")
	private Double htgcIc14;

	@Column(name = "GH_IP16")
	private Double htgcIc16;

	@Column(name = "GH_IP13")
	private Double htgcIc13;

	@Column(name = "GH_IP12")
	private Double htgcIc12;

	@Column(name = "GH_NC100")
	private Double htgcNc100;

	@Column(name = "GH_IPI")
	private Double htgcIpi;

	@Column(name = "LAST_UPDATE")
	private Date htgcLastUpdate;

	@Column(name = "QC_DATE")
	private Date htgcQcDate;

	@Column(name = "RUN_NUMBER")
	private String htgcRunNumber;

	@Column(name = "GH_DATE")
	private Date htgcDate;

	@Column(name = "QC_USER")
	private String htgcQcUser;

	@Column(name = "GH_COMMENT")
	private String htgcComments;

	@Column(name = "GH_PHYTANE")
	private Double htgcPhytane;

	@Column(name = "GH_ACI_COR")
	private Double htgcAciCor;

	@Column(name = "GH_DATE", insertable = false, updatable = false)
	private Date htgcAcqDate;

	@Column(name = "GH_NC26")
	private Double htgcNc26;

	@Column(name = "GH_NC27")
	private Double htgcNc27;

	@Column(name = "GH_NC28")
	private Double htgcNc28;

	@Column(name = "GH_NC29")
	private Double htgcNc29;

	@Column(name = "GH_NC20")
	private Double htgcNc20;

	@Column(name = "GH_NC21")
	private Double htgcNc21;

	@Column(name = "GH_NC22")
	private Double htgcNc22;

	@Column(name = "GH_NC23")
	private Double htgcNc23;

	@Column(name = "GH_NC24")
	private Double htgcNc24;

	@Column(name = "GH_NC25")
	private Double htgcNc25;

	@Column(name = "GH_NC15")
	private Double htgcNc15;

	@Column(name = "GH_NC16")
	private Double htgcNc16;

	@Column(name = "GH_NC17")
	private Double htgcNc17;

	@Column(name = "GH_NC18")
	private Double htgcNc18;

	@Column(name = "GH_NC19")
	private Double htgcNc19;

	@Column(name = "GH_NC10")
	private Double htgcNc10;

	@Column(name = "GH_NC11")
	private Double htgcNc11;

	@Column(name = "GH_NC12")
	private Double htgcNc12;

	@Column(name = "GH_NC13")
	private Double htgcNc13;

	@Column(name = "GH_NC14")
	private Double htgcNc14;

	@Column(name = "GH_NC48")
	private Double htgcNc48;

	@Column(name = "GH_NC49")
	private Double htgcNc49;

	@Column(name = "GH_NC40")
	private Double htgcNc40;

	@Column(name = "GH_NC41")
	private Double htgcNc41;

	@Column(name = "GH_NC42")
	private Double htgcNc42;

	@Column(name = "GH_NC43")
	private Double htgcNc43;

	@Column(name = "GH_NC44")
	private Double htgcNc44;

	@Column(name = "GH_NC45")
	private Double htgcNc45;

	@Column(name = "GH_NC46")
	private Double htgcNc46;

	@Column(name = "GH_NC47")
	private Double htgcNc47;

	@Column(name = "GH_NC37")
	private Double htgcNc37;

	@Column(name = "GH_NC38")
	private Double htgcNc38;

	@Column(name = "GH_NC39")
	private Double htgcNc39;

	@Column(name = "GH_NC30")
	private Double htgcNc30;

	@Column(name = "GH_NC31")
	private Double htgcNc31;

	@Column(name = "GH_NC32")
	private Double htgcNc32;

	@Column(name = "GH_NC33")
	private Double htgcNc33;

	@Column(name = "GH_NC34")
	private Double htgcNc34;

	@Column(name = "GH_NC35")
	private Double htgcNc35;

	@Column(name = "GH_NC36")
	private Double htgcNc36;

	@Column(name = "GH_METHOD")
	private String htgcMethod;

	@Column(name = "GH_NC90")
	private Double htgcNc90;

	@Column(name = "GH_NC91")
	private Double htgcNc91;

	@Column(name = "GH_NC92")
	private Double htgcNc92;

	@Column(name = "GH_NC93")
	private Double htgcNc93;

	@Column(name = "GH_NC94")
	private Double htgcNc94;

	@Column(name = "GH_NC95")
	private Double htgcNc95;

	@Column(name = "GH_NC96")
	private Double htgcNc96;

	@Column(name = "GH_NC97")
	private Double htgcNc97;

	@Column(name = "GH_NC98")
	private Double htgcNc98;

	@Column(name = "GH_NC99")
	private Double htgcNc99;

	@Column(name = "GH_NC60")
	private Double htgcNc60;

	@Column(name = "GH_NC61")
	private Double htgcNc61;

	@Column(name = "GH_NC62")
	private Double htgcNc62;

	@Column(name = "GH_NC63")
	private Double htgcNc63;

	@Column(name = "GH_NC64")
	private Double htgcNc64;

	@Column(name = "GH_NC65")
	private Double htgcNc65;

	@Column(name = "GH_NC66")
	private Double htgcNc66;

	@Column(name = "GH_NC67")
	private Double htgcNc67;

	@Column(name = "GH_NC68")
	private Double htgcNc68;

	@Column(name = "GH_NC69")
	private Double htgcNc69;

	@Column(name = "GH_NC59")
	private Double htgcNc59;

	@Column(name = "GH_NC50")
	private Double htgcNc50;

	@Column(name = "GH_NC51")
	private Double htgcNc51;

	@Column(name = "GH_NC52")
	private Double htgcNc52;

	@Column(name = "GH_NC53")
	private Double htgcNc53;

	@Column(name = "GH_NC54")
	private Double htgcNc54;

	@Column(name = "GH_NC55")
	private Double htgcNc55;

	@Column(name = "GH_NC56")
	private Double htgcNc56;

	@Column(name = "GH_NC57")
	private Double htgcNc57;

	@Column(name = "GH_NC58")
	private Double htgcNc58;

	@Column(name = "GH_NC80")
	private Double htgcNc80;

	@Column(name = "GH_NC81")
	private Double htgcNc81;

	@Column(name = "GH_NC82")
	private Double htgcNc82;

	@Column(name = "GH_NC83")
	private Double htgcNc83;

	@Column(name = "GH_NC84")
	private Double htgcNc84;

	@Column(name = "GH_NC85")
	private Double htgcNc85;

	@Column(name = "GH_NC86")
	private Double htgcNc86;

	@Column(name = "GH_NC87")
	private Double htgcNc87;

	@Column(name = "GH_NC88")
	private Double htgcNc88;

	@Column(name = "GH_NC89")
	private Double htgcNc89;

	@Column(name = "GH_NC70")
	private Double htgcNc70;

	@Column(name = "GH_NC71")
	private Double htgcNc71;

	@Column(name = "GH_NC72")
	private Double htgcNc72;

	@Column(name = "GH_NC73")
	private Double htgcNc73;

	@Column(name = "GH_NC74")
	private Double htgcNc74;

	@Column(name = "GH_NC75")
	private Double htgcNc75;

	@Column(name = "GH_NC76")
	private Double htgcNc76;

	@Column(name = "GH_NC77")
	private Double htgcNc77;

	@Column(name = "GH_NC78")
	private Double htgcNc78;

	@Column(name = "GH_NC79")
	private Double htgcNc79;

	@Column(name = "GH_CPI")
	private Double htgcCpi;

	@Column(name = "IQM_CODE")
	private String htgcIqmCode;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "GH_ACI")
	private Double htgcAci;

	@Column(name = "SVC_CODE")
	private String htgcSvcCode;

	@Transient
	private String htgcIqmFlag;

	@Transient
	private Integer htgcMethodId;

	@Transient
	private String htgcRequestIdVend;

	@Transient
	private Integer htgcDataTypeId;

	@Transient
	private Integer htgcUnitsId;

	@Transient
	private String htgcDataUnits;

	@Override
	public String getName() {
		return AnalysisConstants.GC_HTGC;
	}

}
