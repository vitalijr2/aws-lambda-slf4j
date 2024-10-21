package io.github.vitalijr2.aws.lambda.slf4j;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

import org.example.ServiceProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.event.Level;

@ExtendWith(MockitoExtension.class)
@Tag("slow")
class AWSLambdaLoggerFactoryTest {

  @Mock
  private AWSLambdaLoggerConfiguration configuration;

  @DisplayName("Custom output service provider")
  @Test
  void customOutputServiceProvider() {
    // when
    var loggerOutput = assertDoesNotThrow(
        () -> AWSLambdaLoggerFactory.getOutputServiceProvider(ServiceProvider.class));
    loggerOutput.log(configuration, null, Level.TRACE, "test message", null);

    // then
    verify(configuration).isLevelEnabled(Level.TRACE);
  }

  @DisplayName("No output service providers")
  @Test
  void noOutputServiceProviders() {
    // when and then
    Exception exception = assertThrows(IllegalStateException.class,
        AWSLambdaLoggerFactory::getOutputServiceProvider);

    assertEquals("No AWS Lambda Logger providers were found", exception.getMessage());
  }

}