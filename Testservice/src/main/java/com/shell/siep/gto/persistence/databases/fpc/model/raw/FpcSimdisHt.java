package com.shell.siep.gto.persistence.databases.fpc.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOSimdisHt;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_SIMDIS_HT", schema="gfs")
public class FpcSimdisHt extends FpcDatabaseObject implements GTOSimdisHt, Serializable {

	@Column(name = "SIMDIS_HT_QC")
	private String simdisHtQc;

	@Column(name = "SAMPLE_ID_VEND")
	private String simdisHtSampleIdVend;

	@Column(name = "SIMDIS_HT_C7")
	private Double simdisHtC7;

	@Column(name = "SIMDIS_HT_C6")
	private Double simdisHtC6;

	@Column(name = "SIMDIS_HT_C9")
	private Double simdisHtC9;

	@Column(name = "SIMDIS_HT_C8")
	private Double simdisHtC8;

	@Column(name = "IQM_CODE")
	private String simdisHtIqmCode;

	@Column(name = "SIMDIS_HT_C38")
	private Double simdisHtC38;

	@Column(name = "SIMDIS_HT_C37")
	private Double simdisHtC37;

	@Column(name = "SIMDIS_HT_C39")
	private Double simdisHtC39;

	@Column(name = "SIMDIS_HT_C34")
	private Double simdisHtC34;

	@Column(name = "SIMDIS_HT_C33")
	private Double simdisHtC33;

	@Column(name = "SIMDIS_HT_C36")
	private Double simdisHtC36;

	@Column(name = "SIMDIS_HT_C35")
	private Double simdisHtC35;

	@Column(name = "SIMDIS_HT_C30")
	private Double simdisHtC30;

	@Column(name = "SIMDIS_HT_C32")
	private Double simdisHtC32;

	@Column(name = "SIMDIS_HT_C31")
	private Double simdisHtC31;

	@Column(name = "SIMDIS_HT_C49")
	private Double simdisHtC49;

	@Column(name = "SIMDIS_HT_C48")
	private Double simdisHtC48;

	@Column(name = "SIMDIS_HT_C45")
	private Double simdisHtC45;

	@Column(name = "SIMDIS_HT_C44")
	private Double simdisHtC44;

	@Column(name = "SIMDIS_HT_C47")
	private Double simdisHtC47;

	@Column(name = "SIMDIS_HT_C46")
	private Double simdisHtC46;

	@Column(name = "SIMDIS_HT_C41")
	private Double simdisHtC41;

	@Column(name = "SIMDIS_HT_C40")
	private Double simdisHtC40;

	@Column(name = "SIMDIS_HT_C43")
	private Double simdisHtC43;

	@Column(name = "SIMDIS_HT_C42")
	private Double simdisHtC42;

	@Column(name = "SIMDIS_HT_C59")
	private Double simdisHtC59;

	@Column(name = "SIMDIS_HT_C56")
	private Double simdisHtC56;

	@Column(name = "SIMDIS_HT_C55")
	private Double simdisHtC55;

	@Column(name = "SIMDIS_HT_C58")
	private Double simdisHtC58;

	@Column(name = "SIMDIS_HT_C57")
	private Double simdisHtC57;

	@Column(name = "SIMDIS_HT_C52")
	private Double simdisHtC52;

	@Column(name = "SIMDIS_HT_C51")
	private Double simdisHtC51;

	@Column(name = "SIMDIS_HT_C54")
	private Double simdisHtC54;

	@Column(name = "SIMDIS_HT_C53")
	private Double simdisHtC53;

	@Column(name = "SIMDIS_HT_C50")
	private Double simdisHtC50;

	@Column(name = "SIMDIS_HT_C67")
	private Double simdisHtC67;

	@Column(name = "SIMDIS_HT_C66")
	private Double simdisHtC66;

	@Column(name = "SIMDIS_HT_C69")
	private Double simdisHtC69;

	@Column(name = "SIMDIS_HT_C68")
	private Double simdisHtC68;

	@Column(name = "SIMDIS_HT_C63")
	private Double simdisHtC63;

	@Column(name = "SIMDIS_HT_C62")
	private Double simdisHtC62;

	@Column(name = "SIMDIS_HT_C65")
	private Double simdisHtC65;

	@Column(name = "SIMDIS_HT_C64")
	private Double simdisHtC64;

	@Column(name = "SIMDIS_HT_C61")
	private Double simdisHtC61;

	@Column(name = "SIMDIS_HT_C60")
	private Double simdisHtC60;

	@Column(name = "SIMDIS_HT_C78")
	private Double simdisHtC78;

	@Column(name = "SIMDIS_HT_C77")
	private Double simdisHtC77;

	@Column(name = "SIMDIS_HT_C79")
	private Double simdisHtC79;

	@Column(name = "SIMDIS_HT_C74")
	private Double simdisHtC74;

	@Column(name = "SIMDIS_HT_C73")
	private Double simdisHtC73;

	@Column(name = "SIMDIS_HT_C76")
	private Double simdisHtC76;

	@Column(name = "SIMDIS_HT_C75")
	private Double simdisHtC75;

	@Column(name = "SIMDIS_HT_C70")
	private Double simdisHtC70;

	@Column(name = "SIMDIS_HT_C72")
	private Double simdisHtC72;

	@Column(name = "SIMDIS_HT_C71")
	private Double simdisHtC71;

	@Column(name = "SIMDIS_HT_C89")
	private Double simdisHtC89;

	@Column(name = "SIMDIS_HT_C88")
	private Double simdisHtC88;

	@Column(name = "SIMDIS_HT_C85")
	private Double simdisHtC85;

	@Column(name = "SIMDIS_HT_C84")
	private Double simdisHtC84;

	@Column(name = "SIMDIS_HT_C87")
	private Double simdisHtC87;

	@Column(name = "SIMDIS_HT_C86")
	private Double simdisHtC86;

	@Column(name = "SIMDIS_HT_C81")
	private Double simdisHtC81;

	@Column(name = "SIMDIS_HT_C80")
	private Double simdisHtC80;

	@Column(name = "SIMDIS_HT_C83")
	private Double simdisHtC83;

	@Column(name = "SIMDIS_HT_C82")
	private Double simdisHtC82;

	@Column(name = "SIMDIS_HT_C90")
	private Double simdisHtC90;

	@Column(name = "SIMDIS_HT_C99")
	private Double simdisHtC99;

	@Column(name = "SIMDIS_HT_C96")
	private Double simdisHtC96;

	@Column(name = "SIMDIS_HT_C95")
	private Double simdisHtC95;

	@Column(name = "SIMDIS_HT_C98")
	private Double simdisHtC98;

	@Column(name = "SIMDIS_HT_C97")
	private Double simdisHtC97;

	@Column(name = "SIMDIS_HT_C92")
	private Double simdisHtC92;

	@Column(name = "SIMDIS_HT_C91")
	private Double simdisHtC91;

	@Column(name = "SIMDIS_HT_C94")
	private Double simdisHtC94;

	@Column(name = "SIMDIS_HT_C93")
	private Double simdisHtC93;

	@Column(name = "SIMDIS_HT_C16")
	private Double simdisHtC16;

	@Column(name = "SIMDIS_HT_C15")
	private Double simdisHtC15;

	@Column(name = "SIMDIS_HT_C18")
	private Double simdisHtC18;

	@Column(name = "SIMDIS_HT_C17")
	private Double simdisHtC17;

	@Column(name = "SIMDIS_HT_C12")
	private Double simdisHtC12;

	@Column(name = "SIMDIS_HT_C11")
	private Double simdisHtC11;

	@Column(name = "SIMDIS_HT_C14")
	private Double simdisHtC14;

	@Column(name = "SIMDIS_HT_C13")
	private Double simdisHtC13;

	@Column(name = "SIMDIS_HT_C10")
	private Double simdisHtC10;

	@Column(name = "SIMDIS_HT_C19")
	private Double simdisHtC19;

	@Column(name = "SIMDIS_HT_C27")
	private Double simdisHtC27;

	@Column(name = "SIMDIS_HT_C26")
	private Double simdisHtC26;

	@Column(name = "SIMDIS_HT_C29")
	private Double simdisHtC29;

	@Column(name = "SIMDIS_HT_C28")
	private Double simdisHtC28;

	@Column(name = "SIMDIS_HT_C23")
	private Double simdisHtC23;

	@Column(name = "SIMDIS_HT_C22")
	private Double simdisHtC22;

	@Column(name = "SIMDIS_HT_C25")
	private Double simdisHtC25;

	@Column(name = "SIMDIS_HT_C24")
	private Double simdisHtC24;

	@Column(name = "SIMDIS_HT_C21")
	private Double simdisHtC21;

	@Column(name = "SIMDIS_HT_C20")
	private Double simdisHtC20;

	@Column(name = "LAST_UPDATE")
	private Date simdisHtLastUpdate;

	@Column(name = "SIMDIS_HT_DATE")
	private Date simdisHtAcqDate;

	@Column(name = "SIMDIS_HT_SAMPLE_AMT")
	private Double simdisHtSampleAmt;

	@Column(name = "RUN_NUMBER")
	private String simdisHtRunNumber;

	@Column(name = "QC_DATE")
	private Date simdisHtQcDate;

	@Column(name = "SIMDIS_HT_DATATYPE")
	private String simdisHtDatatype;

	@Column(name = "SIMDIS_HT_C105")
	private Double simdisHtC105;

	@Column(name = "SIMDIS_HT_C106")
	private Double simdisHtC106;

	@Column(name = "SIMDIS_HT_C103")
	private Double simdisHtC103;

	@Column(name = "SIMDIS_HT_C104")
	private Double simdisHtC104;

	@Column(name = "SIMDIS_HT_C101")
	private Double simdisHtC101;

	@Column(name = "SIMDIS_HT_C102")
	private Double simdisHtC102;

	@Column(name = "SIMDIS_HT_C100")
	private Double simdisHtC100;

	@Column(name = "SIMDIS_HT_C107")
	private Double simdisHtC107;

	@Column(name = "SIMDIS_HT_C108")
	private Double simdisHtC108;

	@Column(name = "QC_USER")
	private String simdisHtQcUser;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "SIMDIS_HT_C0_5")
	private Double simdisHtC05;

	@Column(name = "SIMDIS_HT_COMMENT")
	private String simdisHtComment;

	@Column(name = "SVC_CODE")
	private String simdisHtSvcCode;

	@Column(name = "SIMDIS_HT_RECOVERY_PCT")
	private Double simdisHtRecoveryPct;

	@Column(name = "SIMDIS_HT_CONF")
	private Double simdisHtConf;

	@Column(name = "SIMDIS_HT_DATE", insertable = false, updatable = false)
	private Date simdisHtDate;

	@Column(name = "JOB_ID")
	private String simdisHtJobId;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "SIMDIS_HT_LAB")
	private String simdisHtLab;

	@Column(name = "SIMDIS_HT_WEIGHT_CS2")
	private Double simdisHtWeightCs2;

	@Column(name = "SIMDIS_HT_METHOD")
	private String simdisHtMethod;

	@Column(name = "SIMDIS_HT_AUTHOR")
	private String simdisHtAuthor;

	@Override
	public String getName() {
		return AnalysisConstants.GC_SIMDIS_HT;
	}

}
