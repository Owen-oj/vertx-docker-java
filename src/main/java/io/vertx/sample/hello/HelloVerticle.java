package io.vertx.sample.hello;

import io.vertx.core.AbstractVerticle;

public class HelloVerticle extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    vertx.createHttpServer().requestHandler(request -> {
      request.response().end("Hello AWS CodePipeLine & Docker world !");
    }).listen(8888);
  }
}
