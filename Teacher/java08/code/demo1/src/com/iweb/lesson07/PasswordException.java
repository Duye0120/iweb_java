package com.iweb.lesson07;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 09:31
 * 描述: PasswordException
 */
public class PasswordException extends RuntimeException {
    public PasswordException() {
    }

    public PasswordException(String message) {
        super(message);
    }
}
