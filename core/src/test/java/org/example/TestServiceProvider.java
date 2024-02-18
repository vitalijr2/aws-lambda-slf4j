package org.example;

import io.github.vitalijr2.aws.lambda.slf4j.AWSLambdaLoggerConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import org.slf4j.event.Level;

public class TestServiceProvider implements ServiceProvider {

  @Override
  public String hello() {
    return "hello world";
  }

  @Override
  public void log(@NotNull AWSLambdaLoggerConfiguration configuration, @Nullable Marker marker,
      @NotNull Level level, @NotNull String message, @Nullable Throwable throwable) {
    hello();
  }

}
