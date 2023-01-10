/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: gateway-for-agent.proto

package io.holoinsight.server.gateway.grpc;

public interface WriteMetricsRequestV3OrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
   * 
   * @return Whether the header field is set.
   */
  boolean hasHeader();

  /**
   * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
   * 
   * @return The header.
   */
  io.holoinsight.server.gateway.grpc.common.CommonRequestHeader getHeader();

  /**
   * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
   */
  io.holoinsight.server.gateway.grpc.common.CommonRequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatch batch = 2;</code>
   */
  java.util.List<io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatch> getBatchList();

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatch batch = 2;</code>
   */
  io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatch getBatch(int index);

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatch batch = 2;</code>
   */
  int getBatchCount();

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatch batch = 2;</code>
   */
  java.util.List<? extends io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatchOrBuilder> getBatchOrBuilderList();

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatch batch = 2;</code>
   */
  io.holoinsight.server.gateway.grpc.WriteMetricsRequestV3.TaskBatchOrBuilder getBatchOrBuilder(
      int index);
}