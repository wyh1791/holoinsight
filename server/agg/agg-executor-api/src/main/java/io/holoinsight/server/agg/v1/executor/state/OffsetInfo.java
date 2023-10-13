/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.agg.v1.executor.state;

import lombok.Data;

/**
 * Consumer offset info
 * <p>
 * created at 2023/9/25
 *
 * @author xzchaoo
 */
@Data
public class OffsetInfo {
  /**
   * Kafka partition offset
   */
  private long offset;

  /**
   * Max event time ever encountered
   */
  private long maxEventTimestamp;
}