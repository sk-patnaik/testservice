package com.shell.siep.gto.services.paginated;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaginatedRecordWrapper {

    private long totalRecords;
    private Object records;
}
