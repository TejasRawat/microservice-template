package org.ms.api.exception;

import java.util.LinkedList;
import java.util.List;

public class ApiException extends Exception {

    private Integer httpStatusCode;
    private ApiError error;
    private List<ApiError> errors = new LinkedList<>();

    public ApiException(String message, Integer httpStatusCode) {
        super(message);
        this.httpStatusCode = httpStatusCode;
    }

    public ApiException(String message, Integer httpStatusCode, ApiError error) {
        super(message);
        this.httpStatusCode = httpStatusCode;
        this.error = error;
    }

    public ApiException(Integer httpStatusCode, ApiError error, List<ApiError> errors) {
        this.httpStatusCode = httpStatusCode;
        this.error = error;
        this.errors = errors;
    }

    public ApiException(String message, Integer httpStatusCode, ApiError error, List<ApiError> errors) {
        super(message);
        this.httpStatusCode = httpStatusCode;
        this.error = error;
        this.errors = errors;
    }

    public ApiException(String message, Throwable cause, Integer httpStatusCode, ApiError error, List<ApiError> errors) {
        super(message, cause);
        this.httpStatusCode = httpStatusCode;
        this.error = error;
        this.errors = errors;
    }

    public ApiException(Throwable cause, Integer httpStatusCode, ApiError error, List<ApiError> errors) {
        super(cause);
        this.httpStatusCode = httpStatusCode;
        this.error = error;
        this.errors = errors;
    }

    public ApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer httpStatusCode, ApiError error, List<ApiError> errors) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.httpStatusCode = httpStatusCode;
        this.error = error;
        this.errors = errors;
    }
}
