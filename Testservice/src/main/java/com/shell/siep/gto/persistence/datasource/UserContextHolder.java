package com.shell.siep.gto.persistence.datasource;

public class UserContextHolder {

    private UserContextHolder() {
    }

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void setUserContext(String user) {
        threadLocal.set(user);
    }

    public static String getUserContext() {
        return threadLocal.get();
    }

    public static void clearUserContext() {
        threadLocal.remove();
    }
}

