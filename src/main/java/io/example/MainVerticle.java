package io.example;

import io.vertx.core.AbstractVerticle;


/**
 * @Author: xuyh
 * @Description:
 * @Date: Created in 15:05 2017/8/31
 */
public class MainVerticle  extends AbstractVerticle{

    public void start() {
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}
