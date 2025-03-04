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

/**
 * The configuration properties and environment variables.
 *
 * @see AWSLambdaLoggerFactory
 */
public enum AWSLambdaLoggerConfigurationProperty {

  /**
   * <strong>dateTimeFormat</strong> - The date and time format to be used in the output messages.
   * The pattern describing the date and time format is defined by
   * {@link java.text.SimpleDateFormat}.
   * <p>
   * If the format is not specified or is invalid, the number of milliseconds since start up will be
   * output.
   * <p>
   * The environment variable is <strong>LOG_DATE_TIME_FORMAT</strong>.
   */
  DateTimeFormat("dateTimeFormat", "LOG_DATE_TIME_FORMAT", null),
  /**
   * <strong>defaultLogLevel</strong> - Default log level for all instances of LambdaLogger. Must
   * be one of (<em>trace</em>, <em>debug</em>, <em>info</em>, <em>warn</em>, <em>error</em>), a
   * value is case-insensitive. If not specified, defaults to <em>info</em>.
   * <p>
   * The environment variable is <strong>LOG_DEFAULT_LEVEL</strong>.
   */
  DefaultLogLevel("defaultLogLevel", "LOG_DEFAULT_LEVEL", "INFO"),
  /**
   * <strong>levelInBrackets</strong> - Should the level string be output in brackets? Defaults to
   * {@code false}.
   * <p>
   * The environment variable is <strong>LOG_LEVEL_IN_BRACKETS</strong>.
   */
  LevelInBrackets("levelInBrackets", "LOG_LEVEL_IN_BRACKETS", "false"),
  /**
   * <strong>log.a.b.c</strong> - Logging detail level for a LambdaLogger instance named.
   * <em>a.b.c</em>
   */
  LogLevel("log.", "LOG_", null),
  /**
   * <strong>logLevelSeparator</strong> - Customize the level separator.
   * <p>
   * The environment variable is <strong>LOG_LEVEL_SEPARATOR</strong>
   */
  LogLevelSeparator("logLevelSeparator", "LOG_LEVEL_SEPARATOR", ","),
  /**
   * <strong>markerSeparator</strong> - Customize the marker separator.
   * <p>
   * The environment variable is <strong>LOG_MARKER_SEPARATOR</strong>
   */
  MarkerSeparator("markerSeparator", "LOG_MARKER_SEPARATOR", ":"),
  /**
   * <strong>requestId</strong> - Set the context name of <strong>AWS request ID</strong>.
   * Defaults to {@code AWS_REQUEST_ID}.
   * <p>
   * The environment variable is <strong>LOG_AWS_REQUEST_ID</strong>.
   */
  RequestId("requestId", "LOG_AWS_REQUEST_ID", "AWS_REQUEST_ID"),
  /**
   * <strong>showDateTime</strong> - Set to {@code true} if you want the current date and time
   * to be included in output messages. Defaults to {@code false}.
   * <p>
   * The environment variable is <strong>LOG_SHOW_DATE_TIME</strong>.
   */
  ShowDateTime("showDateTime", "LOG_SHOW_DATE_TIME", "false"),
  /**
   * <strong>showLogName</strong> - Set to {@code true} if you want the Logger instance name
   * to be included in output messages. Defaults to {@code true}.
   * <p>
   * The environment variable is <strong>LOG_SHOW_NAME</strong>.
   */
  ShowLogName("showLogName", "LOG_SHOW_NAME", "true"),
  /**
   * <strong>showShortLogName</strong> - Set to {@code true} if you want the last component of the
   * name to be included in output messages. Defaults to {@code false}.
   * <p>
   * The environment variable is <strong>LOG_SHOW_SHORT_NAME</strong>.
   */
  ShowShortLogName("showShortLogName", "LOG_SHOW_SHORT_NAME", "false"),
  /**
   * <strong>showThreadId</strong> - If you would like to output the current thread id,
   * then set to {@code true}. Defaults to {@code false}.
   * <p>
   * The environment variable is <strong>LOG_SHOW_THREAD_ID</strong>.
   */
  ShowThreadId("showThreadId", "LOG_SHOW_THREAD_ID", "false"),
  /**
   * <strong>showThreadName</strong> - Set to {@code true} if you want to output
   * the current thread name. Defaults to {@code false}.
   * <p>
   * The environment variable is <strong>LOG_SHOW_THREAD_NAME</strong>.
   */
  ShowThreadName("showThreadName", "LOG_SHOW_THREAD_NAME", "false");

  /**
   * Default value of the property.
   */
  public final String defaultValue;
  /**
   * Property name.
   */
  public final String propertyName;
  /**
   * Environment variable name.
   */
  public final String variableName;

  AWSLambdaLoggerConfigurationProperty(String propertyName, String variableName,
      String defaultValue) {
    this.propertyName = propertyName;
    this.variableName = variableName;
    this.defaultValue = defaultValue;
  }

}
