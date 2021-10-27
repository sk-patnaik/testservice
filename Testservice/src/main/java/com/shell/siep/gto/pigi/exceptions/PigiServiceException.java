package com.shell.siep.gto.pigi.exceptions;

public class PigiServiceException extends Exception{

    public PigiServiceException(String desc, Exception e) {
        super(desc, e);
    }

    public PigiServiceException(String desc) {
        super(desc);
    }
}
