package io.example;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.Route;

import io.example.router.HelloRouter;


/**
 * @Author: xuyh
 * @Description:
 * @Date: Created in 14:21 2017/8/31
 */


public class MyFirstVerticle extends AbstractVerticle {

    public void start() {
        HttpServer server = vertx.createHttpServer();

        Router router = Router.router(vertx);

        Router helloRouter = new HelloRouter().getRouter();

        router.mountSubRouter("/",helloRouter);








        server.requestHandler(router::accept).listen(8080);

    }


    
}