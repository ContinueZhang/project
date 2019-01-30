package com.manna.xunwuproject.base;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiResponse {
    private int code;
    private String message;
    private Object data;
    private boolean more;


    public static ApiResponse ofMessage(int code, String message) {
        ApiResponseBuilder builder = ApiResponse.builder();
        return builder.code(code).message(message).build();
    }


    public static ApiResponse ofSuccess(Object data) {
        ApiResponseBuilder builder = ApiResponse.builder();
        return builder.code(Status.SUCCESS.code).message(Status.SUCCESS.standardMessage).data(data).build();
    }

    public static ApiResponse ofStatus(Status status) {
        ApiResponseBuilder builder = ApiResponse.builder();
        return builder.code(status.code).message(status.standardMessage).build();
    }

    public enum Status {
        SUCCESS(200, "OK"),
        BAD_REQUEST(400, "Bad Request"),
        INTERNAL_SERVER_ERROR(500, "Unknown Internal Error"),
        NOT_VALID_PARAM(40005, "Not valid Params"),
        NOT_SUPPORTED_OPERATION(40006, "Operation not supported"),
        NOT_LOGIN(50000, "Not Login"),
        ;
        private int code;
        private String standardMessage;

        Status(int code, String standardMessage) {
            this.code = code;
            this.standardMessage = standardMessage;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getStandardMessage() {
            return standardMessage;
        }

        public void setStandardMessage(String standardMessage) {
            this.standardMessage = standardMessage;
        }
    }
}
