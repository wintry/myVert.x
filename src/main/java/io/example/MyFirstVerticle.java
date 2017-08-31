package io.example;

import io.vertx.core.AbstractVerticle;


/**
 * @Author: xuyh
 * @Description:
 * @Date: Created in 14:21 2017/8/31
 */
public class MyFirstVerticle extends AbstractVerticle {
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello World!");
        }).listen(8080);
    }
}