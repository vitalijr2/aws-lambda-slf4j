package org.example;

import io.github.vitalijr2.aws.lambda.slf4j.AWSLambdaLoggerOutput;

public interface ServiceProvider extends AWSLambdaLoggerOutput {

  String hello();

}
