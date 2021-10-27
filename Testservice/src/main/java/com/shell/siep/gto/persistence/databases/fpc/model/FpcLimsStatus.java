package com.shell.siep.gto.persistence.databases.fpc.model;

import com.shell.siep.gto.persistence.model.GTOLimsStatusKey;
import com.shell.siep.gto.persistence.model.GTOLimsStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOLimsStatusKey.class)
@Table(name="FPC_LIMS_STATUS", schema="gfs")
public class FpcLimsStatus extends FpcDatabaseObject implements GTOLimsStatus, Serializable {

	@Id
	@Column(name = "REQUEST_ID")
	private String measRequest;

	@Column(name = "LAST_UPDATE")
	private Date measLastUpdate;

	@Column(name = "STATUS")
	private String stat;

	@Id
	@Column(name = "SAMPLE_ID")
	private String measSampleId;
}
