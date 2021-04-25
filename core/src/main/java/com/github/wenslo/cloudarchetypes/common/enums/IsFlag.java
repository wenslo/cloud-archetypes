package com.github.wenslo.cloudarchetypes.common.enums;

public enum IsFlag {
    NO(0, "否"), YES(1, "是");
    private Integer code;
    private String describe;

    IsFlag(Integer code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
