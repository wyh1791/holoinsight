/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: gateway-for-agent.proto

package io.holoinsight.server.gateway.grpc;

/**
 * <pre>
 * TODO 写数据接口 v1
 * 优点是简单, 基本和用户的数据是匹配的, 可以很简单转换
 * 缺点是彻底失去对内容的控制能力, agent传过来啥就写啥, 会不会有点不太好?
 * 另外还有一个是数据的keys大量冗余
 * </pre>
 *
 * Protobuf type {@code io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1}
 */
public final class WriteMetricsRequestV1 extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1)
    WriteMetricsRequestV1OrBuilder {
  private static final long serialVersionUID = 0L;

  // Use WriteMetricsRequestV1.newBuilder() to construct.
  private WriteMetricsRequestV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WriteMetricsRequestV1() {
    point_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WriteMetricsRequestV1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private WriteMetricsRequestV1(com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(
                io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.parser(),
                extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              point_ = new java.util.ArrayList<io.holoinsight.server.gateway.grpc.Point>();
              mutable_bitField0_ |= 0x00000001;
            }
            point_.add(input.readMessage(io.holoinsight.server.gateway.grpc.Point.parser(),
                extensionRegistry));
            break;
          }
          case 24: {

            sync_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        point_ = java.util.Collections.unmodifiableList(point_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_WriteMetricsRequestV1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_WriteMetricsRequestV1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1.class,
            io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header_;

  /**
   * <pre>
   * 在请求头里还有apikey, 可以供我们找出租户
   * </pre>
   *
   * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
   * 
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }

  /**
   * <pre>
   * 在请求头里还有apikey, 可以供我们找出租户
   * </pre>
   *
   * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
   * 
   * @return The header.
   */
  @java.lang.Override
  public io.holoinsight.server.gateway.grpc.common.CommonRequestHeader getHeader() {
    return header_ == null
        ? io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.getDefaultInstance()
        : header_;
  }

  /**
   * <pre>
   * 在请求头里还有apikey, 可以供我们找出租户
   * </pre>
   *
   * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
   */
  @java.lang.Override
  public io.holoinsight.server.gateway.grpc.common.CommonRequestHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int POINT_FIELD_NUMBER = 2;
  private java.util.List<io.holoinsight.server.gateway.grpc.Point> point_;

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.holoinsight.server.gateway.grpc.Point> getPointList() {
    return point_;
  }

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.holoinsight.server.gateway.grpc.PointOrBuilder> getPointOrBuilderList() {
    return point_;
  }

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
   */
  @java.lang.Override
  public int getPointCount() {
    return point_.size();
  }

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
   */
  @java.lang.Override
  public io.holoinsight.server.gateway.grpc.Point getPoint(int index) {
    return point_.get(index);
  }

  /**
   * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
   */
  @java.lang.Override
  public io.holoinsight.server.gateway.grpc.PointOrBuilder getPointOrBuilder(int index) {
    return point_.get(index);
  }

  public static final int SYNC_FIELD_NUMBER = 3;
  private boolean sync_;

  /**
   * <pre>
   * 是否同步处理
   * </pre>
   *
   * <code>bool sync = 3;</code>
   * 
   * @return The sync.
   */
  @java.lang.Override
  public boolean getSync() {
    return sync_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
      return true;
    if (isInitialized == 0)
      return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < point_.size(); i++) {
      output.writeMessage(2, point_.get(i));
    }
    if (sync_ != false) {
      output.writeBool(3, sync_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getHeader());
    }
    for (int i = 0; i < point_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, point_.get(i));
    }
    if (sync_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, sync_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1)) {
      return super.equals(obj);
    }
    io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 other =
        (io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1) obj;

    if (hasHeader() != other.hasHeader())
      return false;
    if (hasHeader()) {
      if (!getHeader().equals(other.getHeader()))
        return false;
    }
    if (!getPointList().equals(other.getPointList()))
      return false;
    if (getSync() != other.getSync())
      return false;
    if (!unknownFields.equals(other.unknownFields))
      return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getPointCount() > 0) {
      hash = (37 * hash) + POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPointList().hashCode();
    }
    hash = (37 * hash) + SYNC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSync());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   * <pre>
   * TODO 写数据接口 v1
   * 优点是简单, 基本和用户的数据是匹配的, 可以很简单转换
   * 缺点是彻底失去对内容的控制能力, agent传过来啥就写啥, 会不会有点不太好?
   * 另外还有一个是数据的keys大量冗余
   * </pre>
   *
   * Protobuf type {@code io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1)
      io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_WriteMetricsRequestV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_WriteMetricsRequestV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1.class,
              io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1.Builder.class);
    }

    // Construct using io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPointFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (pointBuilder_ == null) {
        point_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pointBuilder_.clear();
      }
      sync_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_WriteMetricsRequestV1_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 getDefaultInstanceForType() {
      return io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 build() {
      io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 buildPartial() {
      io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 result =
          new io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (pointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          point_ = java.util.Collections.unmodifiableList(point_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.point_ = point_;
      } else {
        result.point_ = pointBuilder_.build();
      }
      result.sync_ = sync_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1) {
        return mergeFrom((io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 other) {
      if (other == io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1.getDefaultInstance())
        return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (pointBuilder_ == null) {
        if (!other.point_.isEmpty()) {
          if (point_.isEmpty()) {
            point_ = other.point_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePointIsMutable();
            point_.addAll(other.point_);
          }
          onChanged();
        }
      } else {
        if (!other.point_.isEmpty()) {
          if (pointBuilder_.isEmpty()) {
            pointBuilder_.dispose();
            pointBuilder_ = null;
            point_ = other.point_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pointBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                ? getPointFieldBuilder()
                : null;
          } else {
            pointBuilder_.addAllMessages(other.point_);
          }
        }
      }
      if (other.getSync() != false) {
        setSync(other.getSync());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.gateway.grpc.common.CommonRequestHeader, io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.Builder, io.holoinsight.server.gateway.grpc.common.CommonRequestHeaderOrBuilder> headerBuilder_;

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     * 
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     * 
     * @return The header.
     */
    public io.holoinsight.server.gateway.grpc.common.CommonRequestHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null
            ? io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.getDefaultInstance()
            : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     */
    public Builder setHeader(io.holoinsight.server.gateway.grpc.common.CommonRequestHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     */
    public Builder setHeader(
        io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     */
    public Builder mergeHeader(
        io.holoinsight.server.gateway.grpc.common.CommonRequestHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ = io.holoinsight.server.gateway.grpc.common.CommonRequestHeader
              .newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     */
    public io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.Builder getHeaderBuilder() {

      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     */
    public io.holoinsight.server.gateway.grpc.common.CommonRequestHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null
            ? io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.getDefaultInstance()
            : header_;
      }
    }

    /**
     * <pre>
     * 在请求头里还有apikey, 可以供我们找出租户
     * </pre>
     *
     * <code>.io.holoinsight.server.gateway.grpc.common.CommonRequestHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.gateway.grpc.common.CommonRequestHeader, io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.Builder, io.holoinsight.server.gateway.grpc.common.CommonRequestHeaderOrBuilder> getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.gateway.grpc.common.CommonRequestHeader, io.holoinsight.server.gateway.grpc.common.CommonRequestHeader.Builder, io.holoinsight.server.gateway.grpc.common.CommonRequestHeaderOrBuilder>(
                getHeader(), getParentForChildren(), isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<io.holoinsight.server.gateway.grpc.Point> point_ =
        java.util.Collections.emptyList();

    private void ensurePointIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        point_ = new java.util.ArrayList<io.holoinsight.server.gateway.grpc.Point>(point_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<io.holoinsight.server.gateway.grpc.Point, io.holoinsight.server.gateway.grpc.Point.Builder, io.holoinsight.server.gateway.grpc.PointOrBuilder> pointBuilder_;

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public java.util.List<io.holoinsight.server.gateway.grpc.Point> getPointList() {
      if (pointBuilder_ == null) {
        return java.util.Collections.unmodifiableList(point_);
      } else {
        return pointBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public int getPointCount() {
      if (pointBuilder_ == null) {
        return point_.size();
      } else {
        return pointBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public io.holoinsight.server.gateway.grpc.Point getPoint(int index) {
      if (pointBuilder_ == null) {
        return point_.get(index);
      } else {
        return pointBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder setPoint(int index, io.holoinsight.server.gateway.grpc.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointIsMutable();
        point_.set(index, value);
        onChanged();
      } else {
        pointBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder setPoint(int index,
        io.holoinsight.server.gateway.grpc.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        point_.set(index, builderForValue.build());
        onChanged();
      } else {
        pointBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder addPoint(io.holoinsight.server.gateway.grpc.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointIsMutable();
        point_.add(value);
        onChanged();
      } else {
        pointBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder addPoint(int index, io.holoinsight.server.gateway.grpc.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointIsMutable();
        point_.add(index, value);
        onChanged();
      } else {
        pointBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder addPoint(io.holoinsight.server.gateway.grpc.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        point_.add(builderForValue.build());
        onChanged();
      } else {
        pointBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder addPoint(int index,
        io.holoinsight.server.gateway.grpc.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        point_.add(index, builderForValue.build());
        onChanged();
      } else {
        pointBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder addAllPoint(
        java.lang.Iterable<? extends io.holoinsight.server.gateway.grpc.Point> values) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, point_);
        onChanged();
      } else {
        pointBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder clearPoint() {
      if (pointBuilder_ == null) {
        point_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pointBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public Builder removePoint(int index) {
      if (pointBuilder_ == null) {
        ensurePointIsMutable();
        point_.remove(index);
        onChanged();
      } else {
        pointBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public io.holoinsight.server.gateway.grpc.Point.Builder getPointBuilder(int index) {
      return getPointFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public io.holoinsight.server.gateway.grpc.PointOrBuilder getPointOrBuilder(int index) {
      if (pointBuilder_ == null) {
        return point_.get(index);
      } else {
        return pointBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public java.util.List<? extends io.holoinsight.server.gateway.grpc.PointOrBuilder> getPointOrBuilderList() {
      if (pointBuilder_ != null) {
        return pointBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(point_);
      }
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public io.holoinsight.server.gateway.grpc.Point.Builder addPointBuilder() {
      return getPointFieldBuilder()
          .addBuilder(io.holoinsight.server.gateway.grpc.Point.getDefaultInstance());
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public io.holoinsight.server.gateway.grpc.Point.Builder addPointBuilder(int index) {
      return getPointFieldBuilder().addBuilder(index,
          io.holoinsight.server.gateway.grpc.Point.getDefaultInstance());
    }

    /**
     * <code>repeated .io.holoinsight.server.gateway.grpc.Point point = 2;</code>
     */
    public java.util.List<io.holoinsight.server.gateway.grpc.Point.Builder> getPointBuilderList() {
      return getPointFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<io.holoinsight.server.gateway.grpc.Point, io.holoinsight.server.gateway.grpc.Point.Builder, io.holoinsight.server.gateway.grpc.PointOrBuilder> getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        pointBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<io.holoinsight.server.gateway.grpc.Point, io.holoinsight.server.gateway.grpc.Point.Builder, io.holoinsight.server.gateway.grpc.PointOrBuilder>(
                point_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        point_ = null;
      }
      return pointBuilder_;
    }

    private boolean sync_;

    /**
     * <pre>
     * 是否同步处理
     * </pre>
     *
     * <code>bool sync = 3;</code>
     * 
     * @return The sync.
     */
    @java.lang.Override
    public boolean getSync() {
      return sync_;
    }

    /**
     * <pre>
     * 是否同步处理
     * </pre>
     *
     * <code>bool sync = 3;</code>
     * 
     * @param value The sync to set.
     * @return This builder for chaining.
     */
    public Builder setSync(boolean value) {

      sync_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 是否同步处理
     * </pre>
     *
     * <code>bool sync = 3;</code>
     * 
     * @return This builder for chaining.
     */
    public Builder clearSync() {

      sync_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1)
  private static final io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1();
  }

  public static io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WriteMetricsRequestV1> PARSER =
      new com.google.protobuf.AbstractParser<WriteMetricsRequestV1>() {
        @java.lang.Override
        public WriteMetricsRequestV1 parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new WriteMetricsRequestV1(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<WriteMetricsRequestV1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WriteMetricsRequestV1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.gateway.grpc.WriteMetricsRequestV1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
