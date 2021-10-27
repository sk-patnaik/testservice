package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOGcTegc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_TEGC")
public class DDGcTegc extends DDDatabaseObject implements GTOGcTegc, Serializable {

	@Column(name = "TEGC_METHOD")
	private String tegcMethod;

	@Column(name = "TEGC_C44")
	private Double tegcC44;

	@Column(name = "TEGC_C43")
	private Double tegcC43;

	@Column(name = "TEGC_C40")
	private Double tegcC40;

	@Column(name = "TEGC_C42")
	private Double tegcC42;

	@Column(name = "TEGC_C41")
	private Double tegcC41;

	@Column(name = "TEGC_C37")
	private Double tegcC37;

	@Column(name = "TEGC_C36")
	private Double tegcC36;

	@Column(name = "TEGC_C39")
	private Double tegcC39;

	@Column(name = "TEGC_C38")
	private Double tegcC38;

	@Column(name = "TEGC_C33")
	private Double tegcC33;

	@Column(name = "TEGC_C32")
	private Double tegcC32;

	@Column(name = "TEGC_C35")
	private Double tegcC35;

	@Column(name = "TEGC_C34")
	private Double tegcC34;

	@Column(name = "TEGC_C31")
	private Double tegcC31;

	@Column(name = "TEGC_C30")
	private Double tegcC30;

	@Column(name = "TEGC_C26")
	private Double tegcC26;

	@Column(name = "TEGC_C25")
	private Double tegcC25;

	@Column(name = "TEGC_C28")
	private Double tegcC28;

	@Column(name = "TEGC_C27")
	private Double tegcC27;

	@Column(name = "TEGC_C22")
	private Double tegcC22;

	@Column(name = "TEGC_C21")
	private Double tegcC21;

	@Column(name = "TEGC_C24")
	private Double tegcC24;

	@Column(name = "TEGC_C23")
	private Double tegcC23;

	@Column(name = "TEGC_C29")
	private Double tegcC29;

	@Column(name = "TEGC_C20")
	private Double tegcC20;

	@Column(name = "TEGC_C15")
	private Double tegcC15;

	@Column(name = "TEGC_C14")
	private Double tegcC14;

	@Column(name = "TEGC_C17")
	private Double tegcC17;

	@Column(name = "TEGC_C16")
	private Double tegcC16;

	@Column(name = "TEGC_C11")
	private Double tegcC11;

	@Column(name = "TEGC_C10")
	private Double tegcC10;

	@Column(name = "TEGC_C13")
	private Double tegcC13;

	@Column(name = "TEGC_C12")
	private Double tegcC12;

	@Column(name = "TEGC_C19")
	private Double tegcC19;

	@Column(name = "TEGC_C18")
	private Double tegcC18;

	@Column(name = "TEGC_DATE")
	private Date tegcDate;

	@Column(name = "JOB_ID")
	private String tegcJobId;

	@Column(name = "TEGC_LAB")
	private String tegcLab;

	@Column(name = "TEGC_COMMENT")
	private String tegcComment;

	@Column(name = "SVC_CODE")
	private String tegcSvcCode;

	@Column(name = "SAMPLE_ID_VEND")
	private String tegcSampleIdVend;

	@Column(name = "IQM_CODE")
	private String tegcIqmCode;

	@Column(name = "QC_DATE")
	private Date tegcQcDate;

	@Column(name = "TEGC_C44PLS")
	private Double tegcC44pls;

	@Column(name = "RUN_NUMBER")
	private String tegcRunNumber;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "QC_USER")
	private String tegcQcUser;

	@Column(name = "TEGC_AUTHOR")
	private String tegcAuthor;

	@Column(name = "TEGC_QC")
	private String tegcQc;

	@Column(name = "TEGC_C4")
	private Double tegcC4;

	@Column(name = "TEGC_C7")
	private Double tegcC7;

	@Column(name = "TEGC_C8")
	private Double tegcC8;

	@Column(name = "TEGC_C5")
	private Double tegcC5;

	@Column(name = "TEGC_C6")
	private Double tegcC6;

	@Column(name = "TEGC_C9")
	private Double tegcC9;

	@Column(name = "LAST_UPDATE")
	private Date lastUpdate;

	@Column(name = "TEGC_C34PLS")
	private Double tegcC34pls;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "TEGC_DATE", insertable = false, updatable = false)
	private Date tegcAcqDate;

	@Override
	public String getName() {
		return AnalysisConstants.GC_TEGC;
	}
}
