package org.example;

import io.github.vitalijr2.aws.lambda.slf4j.AWSLambdaLoggerConfiguration;
import io.github.vitalijr2.aws.lambda.slf4j.AWSLambdaLoggerOutput;
import org.slf4j.event.Level;

public interface ServiceProvider extends AWSLambdaLoggerOutput {

  void hello(AWSLambdaLoggerConfiguration configuration, Level level);

}
