package com.crowdin.cli.client.exceptions;

public class ResponseException extends Exception {

    public ResponseException() {
        super();
    }

    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(String message, Throwable cause) {
        super(message, cause);
    }
}
