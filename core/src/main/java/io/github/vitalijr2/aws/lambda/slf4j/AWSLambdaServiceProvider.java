/*-
 * ---------------LICENSE_START-----------------
 * SLF4J for AWS Lambda
 * ---------------------------------------------
 * Copyright (C) 2022 - 2025 Vitalij Berdinskih
 * ---------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ---------------LICENSE_END-------------------
 */
package io.github.vitalijr2.aws.lambda.slf4j;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.BasicMDCAdapter;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/**
 * Responsible for binding the {@link AWSLambdaLoggerFactory}, the {@link BasicMarkerFactory} and
 * the {@link BasicMDCAdapter}. This is used by the SLF4J API.
 *
 * @author Vitalij Berdinskih
 * @since 3.0.0
 */
public class AWSLambdaServiceProvider implements SLF4JServiceProvider {

  private static final ILoggerFactory loggerFactory = new AWSLambdaLoggerFactory();
  private static final IMarkerFactory markerFactory = new BasicMarkerFactory();
  private static final MDCAdapter contextMapAdapter = new BasicMDCAdapter();
  /**
   * Declare the version of the SLF4J API this implementation is compiled against. The value of this
   * field is modified with each major release.
   */
  // to avoid constant folding by the compiler, this field must *not* be final
  public static String REQUESTED_API_VERSION = "2.0.99"; // !final

  @Override
  public ILoggerFactory getLoggerFactory() {
    return loggerFactory;
  }

  @Override
  public IMarkerFactory getMarkerFactory() {
    return markerFactory;
  }

  @Override
  public MDCAdapter getMDCAdapter() {
    return contextMapAdapter;
  }

  @Override
  public String getRequestedApiVersion() {
    return REQUESTED_API_VERSION;
  }

  @Override
  public void initialize() {
    // initialized by static fields
  }

}
