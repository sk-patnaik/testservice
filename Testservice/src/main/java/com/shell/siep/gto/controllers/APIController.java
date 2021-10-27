package com.shell.siep.gto.controllers;

import com.shell.siep.gto.persistence.Database;
import com.shell.siep.gto.vo.request.AnalysisRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.handler.AbstractUrlHandlerMapping;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = {"*"})
public abstract class APIController extends AbstractUrlHandlerMapping {

	@Override
	public void setUseTrailingSlashMatch(boolean useTrailingSlashMatch) {
		super.setUseTrailingSlashMatch(true);
	}

    protected void checkDatabases(AnalysisRequest request) {
        List<String> searchableDatabases = new ArrayList<>();
        for(Database db : Database.getActiveDatabases()) {
            if(request.getDatabases().contains(db.getCode())) {
                searchableDatabases.add(db.getCode());
            }
        }
        request.setDatabases(searchableDatabases);
    }
}
