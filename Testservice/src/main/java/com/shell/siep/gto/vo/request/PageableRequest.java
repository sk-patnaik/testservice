package com.shell.siep.gto.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Getter
@Setter
public class PageableRequest extends DatabaseRequest {

    @ApiModelProperty(notes = "How many results on each page", required = true)
    private int size = 100;

    @ApiModelProperty(notes = "Which page you need (starts at 1)", required = true)
    private int page = 1;

    @ApiModelProperty(notes = "True if ascending false if descending")
    private boolean ascending = true;

    @ApiModelProperty(notes = "Sort Column.  If not there, there will be no sorting")
    private String sortColumn;

    @ApiModelProperty(notes = "Search Column.  If not there, there will be no filtering")
    private String searchColumn;

    @ApiModelProperty(notes = "Search Value.")
    private String searchValue;

    public Pageable getPageable() {

        if(size == 0){
            return null;
        }
        if(sortColumn == null || sortColumn.isEmpty()) {
            return PageRequest.of(page, size);
        }

        if(ascending) {
            return PageRequest.of(page, size, Sort.by(sortColumn).ascending());
        }

        return PageRequest.of(page, size, Sort.by(sortColumn).descending());
    }

    @Override
    public String toString() {
        return "PageableRequest{" +
                "[Size=" + size + "] " +
                "[Page=" + page + "] " +
                "[Ascending=" + ascending + "] " +
                "[SortColumn='" + sortColumn + '\'' + "] " +
                "[SearchColumn='" + searchColumn + '\'' + "] " +
                "[SearchValue='" + searchValue + '\'' + "]" +
                "} " + super.toString();
    }
}
