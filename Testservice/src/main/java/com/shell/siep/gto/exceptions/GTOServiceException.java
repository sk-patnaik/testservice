package com.shell.siep.gto.exceptions;

public class GTOServiceException extends Exception {
    public GTOServiceException(String exceptionDescription, Exception e) {
        super(exceptionDescription, e);
    }

    public GTOServiceException(String exceptionDescription) {
        super(exceptionDescription);
    }
}
