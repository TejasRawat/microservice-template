package org.ms.api.wrappers;

import org.ms.api.exception.ApiError;

import java.util.List;

public class ApiResponse<T> {

    private Integer httpStatusCode;
    private T payload;
    private List<ApiError> errors;

}
