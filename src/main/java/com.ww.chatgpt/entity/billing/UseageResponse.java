package com.ww.chatgpt.entity.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 余额查询接口返回值
 *
 * @author ww
 */
@Data
public class UseageResponse {

    /**
     * 总使用金额：美元
     */
    @JsonProperty("total_usage")
    private BigDecimal totalUsage;

}
