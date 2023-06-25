package com.ww.chatgpt.entity.chat;

import com.ww.chatgpt.entity.billing.Usage;
import lombok.Data;

import java.util.List;

/**
 * chat答案类
 *
 * @author ww
 */
@Data
public class ChatCompletionResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<ChatChoice> choices;
    private Usage usage;
}
