package org.ms.api.exception;

import java.util.HashMap;
import java.util.Map;

public class ApiError {

    private String errorCode;
    private String field;
    private String description;

    private Map<String, Object> extendedAttributes = new HashMap<>();

    public ApiError() {
    }

    public ApiError(String errorCode, String field, String description) {
        this.errorCode = errorCode;
        this.field = field;
        this.description = description;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getExtendedAttributes() {
        return extendedAttributes;
    }

    public void setExtendedAttributes(Map<String, Object> extendedAttributes) {
        this.extendedAttributes = extendedAttributes;
    }
}
