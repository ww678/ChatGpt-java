package com.ww.chatgpt.listener;

import com.ww.chatgpt.util.SseHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * sse
 *
 * @author ww
 */
@Slf4j
@RequiredArgsConstructor
public class SseStreamListener extends AbstractStreamListener {

    final SseEmitter sseEmitter;


    @Override
    public void onMsg(String message) {
        SseHelper.send(sseEmitter, message);
    }

    @Override
    public void onError(Throwable throwable, String response) {
        SseHelper.complete(sseEmitter);
    }

}
