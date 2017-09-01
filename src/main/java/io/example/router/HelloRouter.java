package io.example.router;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.Route;

/**
 * @Author: xuyh
 * @Description:
 * @Date: Created in 17:22 2017/8/31
 */
public class HelloRouter extends AbstractVerticle {

    public Router getRouter() {
        Router helloRouter = Router.router(vertx);

        Route helloRoute = helloRouter.route(HttpMethod.POST, "/");

        helloRoute.handler(routingContext ->

        {

            // 所有的请求都会调用这个处理器处理
            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "text/plain");

            // 写入响应并结束处理
            response.end("Hello World from Vert.x-Web!");
        });

        return helloRouter;
    }

}
