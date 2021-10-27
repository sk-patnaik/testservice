package com.shell.siep.gto.pigi.exceptions;

public class NoAnalysisDataException extends Exception{

    public NoAnalysisDataException(String desc, Exception e) {
        super(desc, e);
    }

    public NoAnalysisDataException(String desc) {
        super(desc);
    }
}
