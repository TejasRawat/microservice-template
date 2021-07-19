package org.ms.api.wrappers;

import java.util.HashMap;
import java.util.Map;

public class ApiExchange<T> {

    private T payload;
    private Map<String, Object> headers = new HashMap<>();
    private ApiContext apiContext = new ApiContext();

    public ApiExchange() {

    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public Map<String, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    public ApiContext getApiContext() {
        return apiContext;
    }

    public void setApiContext(ApiContext apiContext) {
        this.apiContext = apiContext;
    }
}
