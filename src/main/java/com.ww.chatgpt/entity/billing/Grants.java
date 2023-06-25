package com.ww.chatgpt.entity.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author ww
 */
@Data
public class Grants {
    private String object;
    @JsonProperty("data")
    private List<Datum> data;

}
