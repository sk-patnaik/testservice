package com.shell.siep.gto.pigi.service;

import com.shell.siep.gto.pigi.exceptions.NoAnalysisDataException;
import com.shell.siep.gto.pigi.exceptions.PigiServiceException;

import java.io.ByteArrayOutputStream;

public interface PigiService {

    ByteArrayOutputStream createPigiFile(AnalysisRequest request)
            throws PigiServiceException, NoAnalysisDataException;
}
