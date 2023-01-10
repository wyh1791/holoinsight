/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: common.proto

package io.holoinsight.server.common.grpc;

/**
 * Protobuf type {@code io.holoinsight.server.common.grpc.CommonRequestHeader}
 */
public final class CommonRequestHeader extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.common.grpc.CommonRequestHeader)
    CommonRequestHeaderOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CommonRequestHeader.newBuilder() to construct.
  private CommonRequestHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CommonRequestHeader() {
    apikey_ = "";
    traceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CommonRequestHeader();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CommonRequestHeader(com.google.protobuf.CodedInputStream input,
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
            java.lang.String s = input.readStringRequireUtf8();

            apikey_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            traceId_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              header_ =
                  com.google.protobuf.MapField.newMapField(HeaderDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String> header__ =
                input.readMessage(HeaderDefaultEntryHolder.defaultEntry.getParserForType(),
                    extensionRegistry);
            header_.getMutableMap().put(header__.getKey(), header__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_CommonRequestHeader_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 3:
        return internalGetHeader();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_CommonRequestHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.common.grpc.CommonRequestHeader.class,
            io.holoinsight.server.common.grpc.CommonRequestHeader.Builder.class);
  }

  public static final int APIKEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object apikey_;

  /**
   * <code>string apikey = 1;</code>
   */
  public java.lang.String getApikey() {
    java.lang.Object ref = apikey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apikey_ = s;
      return s;
    }
  }

  /**
   * <code>string apikey = 1;</code>
   */
  public com.google.protobuf.ByteString getApikeyBytes() {
    java.lang.Object ref = apikey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      apikey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRACE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object traceId_;

  /**
   * <code>string trace_id = 2;</code>
   */
  public java.lang.String getTraceId() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      traceId_ = s;
      return s;
    }
  }

  /**
   * <code>string trace_id = 2;</code>
   */
  public com.google.protobuf.ByteString getTraceIdBytes() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      traceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEADER_FIELD_NUMBER = 3;

  private static final class HeaderDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_CommonRequestHeader_HeaderEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING, "",
            com.google.protobuf.WireFormat.FieldType.STRING, "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> header_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetHeader() {
    if (header_ == null) {
      return com.google.protobuf.MapField.emptyMapField(HeaderDefaultEntryHolder.defaultEntry);
    }
    return header_;
  }

  public int getHeaderCount() {
    return internalGetHeader().getMap().size();
  }

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */

  public boolean containsHeader(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetHeader().getMap().containsKey(key);
  }

  /**
   * Use {@link #getHeaderMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getHeader() {
    return getHeaderMap();
  }

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
    return internalGetHeader().getMap();
  }

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */

  public java.lang.String getHeaderOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetHeader().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */

  public java.lang.String getHeaderOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetHeader().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getApikeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, apikey_);
    }
    if (!getTraceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, traceId_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(output, internalGetHeader(),
        HeaderDefaultEntryHolder.defaultEntry, 3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (!getApikeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, apikey_);
    }
    if (!getTraceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, traceId_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : internalGetHeader()
        .getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> header__ =
          HeaderDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey())
              .setValue(entry.getValue()).build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, header__);
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
    if (!(obj instanceof io.holoinsight.server.common.grpc.CommonRequestHeader)) {
      return super.equals(obj);
    }
    io.holoinsight.server.common.grpc.CommonRequestHeader other =
        (io.holoinsight.server.common.grpc.CommonRequestHeader) obj;

    if (!getApikey().equals(other.getApikey()))
      return false;
    if (!getTraceId().equals(other.getTraceId()))
      return false;
    if (!internalGetHeader().equals(other.internalGetHeader()))
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
    hash = (37 * hash) + APIKEY_FIELD_NUMBER;
    hash = (53 * hash) + getApikey().hashCode();
    hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTraceId().hashCode();
    if (!internalGetHeader().getMap().isEmpty()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHeader().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader parseFrom(
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
      io.holoinsight.server.common.grpc.CommonRequestHeader prototype) {
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
   * Protobuf type {@code io.holoinsight.server.common.grpc.CommonRequestHeader}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.common.grpc.CommonRequestHeader)
      io.holoinsight.server.common.grpc.CommonRequestHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_CommonRequestHeader_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetHeader();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 3:
          return internalGetMutableHeader();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_CommonRequestHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.common.grpc.CommonRequestHeader.class,
              io.holoinsight.server.common.grpc.CommonRequestHeader.Builder.class);
    }

    // Construct using io.holoinsight.server.common.grpc.CommonRequestHeader.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      apikey_ = "";

      traceId_ = "";

      internalGetMutableHeader().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_CommonRequestHeader_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.common.grpc.CommonRequestHeader getDefaultInstanceForType() {
      return io.holoinsight.server.common.grpc.CommonRequestHeader.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.common.grpc.CommonRequestHeader build() {
      io.holoinsight.server.common.grpc.CommonRequestHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.common.grpc.CommonRequestHeader buildPartial() {
      io.holoinsight.server.common.grpc.CommonRequestHeader result =
          new io.holoinsight.server.common.grpc.CommonRequestHeader(this);
      int from_bitField0_ = bitField0_;
      result.apikey_ = apikey_;
      result.traceId_ = traceId_;
      result.header_ = internalGetHeader();
      result.header_.makeImmutable();
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
      if (other instanceof io.holoinsight.server.common.grpc.CommonRequestHeader) {
        return mergeFrom((io.holoinsight.server.common.grpc.CommonRequestHeader) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.common.grpc.CommonRequestHeader other) {
      if (other == io.holoinsight.server.common.grpc.CommonRequestHeader.getDefaultInstance())
        return this;
      if (!other.getApikey().isEmpty()) {
        apikey_ = other.apikey_;
        onChanged();
      }
      if (!other.getTraceId().isEmpty()) {
        traceId_ = other.traceId_;
        onChanged();
      }
      internalGetMutableHeader().mergeFrom(other.internalGetHeader());
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
      io.holoinsight.server.common.grpc.CommonRequestHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (io.holoinsight.server.common.grpc.CommonRequestHeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object apikey_ = "";

    /**
     * <code>string apikey = 1;</code>
     */
    public java.lang.String getApikey() {
      java.lang.Object ref = apikey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apikey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string apikey = 1;</code>
     */
    public com.google.protobuf.ByteString getApikeyBytes() {
      java.lang.Object ref = apikey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apikey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string apikey = 1;</code>
     */
    public Builder setApikey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      apikey_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string apikey = 1;</code>
     */
    public Builder clearApikey() {

      apikey_ = getDefaultInstance().getApikey();
      onChanged();
      return this;
    }

    /**
     * <code>string apikey = 1;</code>
     */
    public Builder setApikeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      apikey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object traceId_ = "";

    /**
     * <code>string trace_id = 2;</code>
     */
    public java.lang.String getTraceId() {
      java.lang.Object ref = traceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        traceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string trace_id = 2;</code>
     */
    public com.google.protobuf.ByteString getTraceIdBytes() {
      java.lang.Object ref = traceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        traceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string trace_id = 2;</code>
     */
    public Builder setTraceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      traceId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string trace_id = 2;</code>
     */
    public Builder clearTraceId() {

      traceId_ = getDefaultInstance().getTraceId();
      onChanged();
      return this;
    }

    /**
     * <code>string trace_id = 2;</code>
     */
    public Builder setTraceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      traceId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> header_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetHeader() {
      if (header_ == null) {
        return com.google.protobuf.MapField.emptyMapField(HeaderDefaultEntryHolder.defaultEntry);
      }
      return header_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMutableHeader() {
      onChanged();;
      if (header_ == null) {
        header_ = com.google.protobuf.MapField.newMapField(HeaderDefaultEntryHolder.defaultEntry);
      }
      if (!header_.isMutable()) {
        header_ = header_.copy();
      }
      return header_;
    }

    public int getHeaderCount() {
      return internalGetHeader().getMap().size();
    }

    /**
     * <code>map&lt;string, string&gt; header = 3;</code>
     */

    public boolean containsHeader(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetHeader().getMap().containsKey(key);
    }

    /**
     * Use {@link #getHeaderMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getHeader() {
      return getHeaderMap();
    }

    /**
     * <code>map&lt;string, string&gt; header = 3;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
      return internalGetHeader().getMap();
    }

    /**
     * <code>map&lt;string, string&gt; header = 3;</code>
     */

    public java.lang.String getHeaderOrDefault(java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetHeader().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     * <code>map&lt;string, string&gt; header = 3;</code>
     */

    public java.lang.String getHeaderOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetHeader().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearHeader() {
      internalGetMutableHeader().getMutableMap().clear();
      return this;
    }

    /**
     * <code>map&lt;string, string&gt; header = 3;</code>
     */

    public Builder removeHeader(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableHeader().getMutableMap().remove(key);
      return this;
    }

    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableHeader() {
      return internalGetMutableHeader().getMutableMap();
    }

    /**
     * <code>map&lt;string, string&gt; header = 3;</code>
     */
    public Builder putHeader(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableHeader().getMutableMap().put(key, value);
      return this;
    }

    /**
     * <code>map&lt;string, string&gt; header = 3;</code>
     */

    public Builder putAllHeader(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableHeader().getMutableMap().putAll(values);
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


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.common.grpc.CommonRequestHeader)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.common.grpc.CommonRequestHeader)
  private static final io.holoinsight.server.common.grpc.CommonRequestHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.common.grpc.CommonRequestHeader();
  }

  public static io.holoinsight.server.common.grpc.CommonRequestHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommonRequestHeader> PARSER =
      new com.google.protobuf.AbstractParser<CommonRequestHeader>() {
        @java.lang.Override
        public CommonRequestHeader parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CommonRequestHeader(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CommonRequestHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommonRequestHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.common.grpc.CommonRequestHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
