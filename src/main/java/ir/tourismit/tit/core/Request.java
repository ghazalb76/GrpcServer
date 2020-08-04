// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service.proto

package ir.tourismit.tit.core;

/**
 * Protobuf type {@code ir.tourismit.tit.core.Request}
 */
public  final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ir.tourismit.tit.core.Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    processID_ = "";
    processReference_ = "";
    callerReference_ = "";
    serviceID_ = "";
    callerInputJson_ = "";
    previewsOutput_ = "";
    tokenAA_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Request(
      com.google.protobuf.CodedInputStream input,
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

            processID_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            processReference_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            callerReference_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceID_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            callerInputJson_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            previewsOutput_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            tokenAA_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ir.tourismit.tit.core.ServiceOuterClass.internal_static_ir_tourismit_tit_core_Request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ir.tourismit.tit.core.ServiceOuterClass.internal_static_ir_tourismit_tit_core_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ir.tourismit.tit.core.Request.class, ir.tourismit.tit.core.Request.Builder.class);
  }

  public static final int PROCESSID_FIELD_NUMBER = 1;
  private volatile java.lang.Object processID_;
  /**
   * <code>string ProcessID = 1;</code>
   */
  public java.lang.String getProcessID() {
    java.lang.Object ref = processID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processID_ = s;
      return s;
    }
  }
  /**
   * <code>string ProcessID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProcessIDBytes() {
    java.lang.Object ref = processID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      processID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROCESSREFERENCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object processReference_;
  /**
   * <code>string ProcessReference = 2;</code>
   */
  public java.lang.String getProcessReference() {
    java.lang.Object ref = processReference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processReference_ = s;
      return s;
    }
  }
  /**
   * <code>string ProcessReference = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProcessReferenceBytes() {
    java.lang.Object ref = processReference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      processReference_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALLERREFERENCE_FIELD_NUMBER = 3;
  private volatile java.lang.Object callerReference_;
  /**
   * <code>string CallerReference = 3;</code>
   */
  public java.lang.String getCallerReference() {
    java.lang.Object ref = callerReference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callerReference_ = s;
      return s;
    }
  }
  /**
   * <code>string CallerReference = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCallerReferenceBytes() {
    java.lang.Object ref = callerReference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callerReference_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICEID_FIELD_NUMBER = 4;
  private volatile java.lang.Object serviceID_;
  /**
   * <code>string ServiceID = 4;</code>
   */
  public java.lang.String getServiceID() {
    java.lang.Object ref = serviceID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceID_ = s;
      return s;
    }
  }
  /**
   * <code>string ServiceID = 4;</code>
   */
  public com.google.protobuf.ByteString
      getServiceIDBytes() {
    java.lang.Object ref = serviceID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALLERINPUTJSON_FIELD_NUMBER = 5;
  private volatile java.lang.Object callerInputJson_;
  /**
   * <code>string CallerInputJson = 5;</code>
   */
  public java.lang.String getCallerInputJson() {
    java.lang.Object ref = callerInputJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callerInputJson_ = s;
      return s;
    }
  }
  /**
   * <code>string CallerInputJson = 5;</code>
   */
  public com.google.protobuf.ByteString
      getCallerInputJsonBytes() {
    java.lang.Object ref = callerInputJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callerInputJson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREVIEWSOUTPUT_FIELD_NUMBER = 6;
  private volatile java.lang.Object previewsOutput_;
  /**
   * <code>string PreviewsOutput = 6;</code>
   */
  public java.lang.String getPreviewsOutput() {
    java.lang.Object ref = previewsOutput_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      previewsOutput_ = s;
      return s;
    }
  }
  /**
   * <code>string PreviewsOutput = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPreviewsOutputBytes() {
    java.lang.Object ref = previewsOutput_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      previewsOutput_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKENAA_FIELD_NUMBER = 7;
  private volatile java.lang.Object tokenAA_;
  /**
   * <code>string TokenAA = 7;</code>
   */
  public java.lang.String getTokenAA() {
    java.lang.Object ref = tokenAA_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tokenAA_ = s;
      return s;
    }
  }
  /**
   * <code>string TokenAA = 7;</code>
   */
  public com.google.protobuf.ByteString
      getTokenAABytes() {
    java.lang.Object ref = tokenAA_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tokenAA_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProcessIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, processID_);
    }
    if (!getProcessReferenceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, processReference_);
    }
    if (!getCallerReferenceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, callerReference_);
    }
    if (!getServiceIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serviceID_);
    }
    if (!getCallerInputJsonBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, callerInputJson_);
    }
    if (!getPreviewsOutputBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, previewsOutput_);
    }
    if (!getTokenAABytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, tokenAA_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProcessIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, processID_);
    }
    if (!getProcessReferenceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, processReference_);
    }
    if (!getCallerReferenceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, callerReference_);
    }
    if (!getServiceIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, serviceID_);
    }
    if (!getCallerInputJsonBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, callerInputJson_);
    }
    if (!getPreviewsOutputBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, previewsOutput_);
    }
    if (!getTokenAABytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, tokenAA_);
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
    if (!(obj instanceof ir.tourismit.tit.core.Request)) {
      return super.equals(obj);
    }
    ir.tourismit.tit.core.Request other = (ir.tourismit.tit.core.Request) obj;

    boolean result = true;
    result = result && getProcessID()
        .equals(other.getProcessID());
    result = result && getProcessReference()
        .equals(other.getProcessReference());
    result = result && getCallerReference()
        .equals(other.getCallerReference());
    result = result && getServiceID()
        .equals(other.getServiceID());
    result = result && getCallerInputJson()
        .equals(other.getCallerInputJson());
    result = result && getPreviewsOutput()
        .equals(other.getPreviewsOutput());
    result = result && getTokenAA()
        .equals(other.getTokenAA());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROCESSID_FIELD_NUMBER;
    hash = (53 * hash) + getProcessID().hashCode();
    hash = (37 * hash) + PROCESSREFERENCE_FIELD_NUMBER;
    hash = (53 * hash) + getProcessReference().hashCode();
    hash = (37 * hash) + CALLERREFERENCE_FIELD_NUMBER;
    hash = (53 * hash) + getCallerReference().hashCode();
    hash = (37 * hash) + SERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceID().hashCode();
    hash = (37 * hash) + CALLERINPUTJSON_FIELD_NUMBER;
    hash = (53 * hash) + getCallerInputJson().hashCode();
    hash = (37 * hash) + PREVIEWSOUTPUT_FIELD_NUMBER;
    hash = (53 * hash) + getPreviewsOutput().hashCode();
    hash = (37 * hash) + TOKENAA_FIELD_NUMBER;
    hash = (53 * hash) + getTokenAA().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ir.tourismit.tit.core.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.tourismit.tit.core.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.tourismit.tit.core.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.tourismit.tit.core.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.tourismit.tit.core.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.tourismit.tit.core.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.tourismit.tit.core.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ir.tourismit.tit.core.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ir.tourismit.tit.core.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ir.tourismit.tit.core.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ir.tourismit.tit.core.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ir.tourismit.tit.core.Request parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ir.tourismit.tit.core.Request prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ir.tourismit.tit.core.Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ir.tourismit.tit.core.Request)
      ir.tourismit.tit.core.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ir.tourismit.tit.core.ServiceOuterClass.internal_static_ir_tourismit_tit_core_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ir.tourismit.tit.core.ServiceOuterClass.internal_static_ir_tourismit_tit_core_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ir.tourismit.tit.core.Request.class, ir.tourismit.tit.core.Request.Builder.class);
    }

    // Construct using ir.tourismit.tit.core.Request.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      processID_ = "";

      processReference_ = "";

      callerReference_ = "";

      serviceID_ = "";

      callerInputJson_ = "";

      previewsOutput_ = "";

      tokenAA_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ir.tourismit.tit.core.ServiceOuterClass.internal_static_ir_tourismit_tit_core_Request_descriptor;
    }

    @java.lang.Override
    public ir.tourismit.tit.core.Request getDefaultInstanceForType() {
      return ir.tourismit.tit.core.Request.getDefaultInstance();
    }

    @java.lang.Override
    public ir.tourismit.tit.core.Request build() {
      ir.tourismit.tit.core.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ir.tourismit.tit.core.Request buildPartial() {
      ir.tourismit.tit.core.Request result = new ir.tourismit.tit.core.Request(this);
      result.processID_ = processID_;
      result.processReference_ = processReference_;
      result.callerReference_ = callerReference_;
      result.serviceID_ = serviceID_;
      result.callerInputJson_ = callerInputJson_;
      result.previewsOutput_ = previewsOutput_;
      result.tokenAA_ = tokenAA_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ir.tourismit.tit.core.Request) {
        return mergeFrom((ir.tourismit.tit.core.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ir.tourismit.tit.core.Request other) {
      if (other == ir.tourismit.tit.core.Request.getDefaultInstance()) return this;
      if (!other.getProcessID().isEmpty()) {
        processID_ = other.processID_;
        onChanged();
      }
      if (!other.getProcessReference().isEmpty()) {
        processReference_ = other.processReference_;
        onChanged();
      }
      if (!other.getCallerReference().isEmpty()) {
        callerReference_ = other.callerReference_;
        onChanged();
      }
      if (!other.getServiceID().isEmpty()) {
        serviceID_ = other.serviceID_;
        onChanged();
      }
      if (!other.getCallerInputJson().isEmpty()) {
        callerInputJson_ = other.callerInputJson_;
        onChanged();
      }
      if (!other.getPreviewsOutput().isEmpty()) {
        previewsOutput_ = other.previewsOutput_;
        onChanged();
      }
      if (!other.getTokenAA().isEmpty()) {
        tokenAA_ = other.tokenAA_;
        onChanged();
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
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ir.tourismit.tit.core.Request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ir.tourismit.tit.core.Request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object processID_ = "";
    /**
     * <code>string ProcessID = 1;</code>
     */
    public java.lang.String getProcessID() {
      java.lang.Object ref = processID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ProcessID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProcessIDBytes() {
      java.lang.Object ref = processID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        processID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ProcessID = 1;</code>
     */
    public Builder setProcessID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      processID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ProcessID = 1;</code>
     */
    public Builder clearProcessID() {
      
      processID_ = getDefaultInstance().getProcessID();
      onChanged();
      return this;
    }
    /**
     * <code>string ProcessID = 1;</code>
     */
    public Builder setProcessIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      processID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object processReference_ = "";
    /**
     * <code>string ProcessReference = 2;</code>
     */
    public java.lang.String getProcessReference() {
      java.lang.Object ref = processReference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processReference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ProcessReference = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProcessReferenceBytes() {
      java.lang.Object ref = processReference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        processReference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ProcessReference = 2;</code>
     */
    public Builder setProcessReference(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      processReference_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ProcessReference = 2;</code>
     */
    public Builder clearProcessReference() {
      
      processReference_ = getDefaultInstance().getProcessReference();
      onChanged();
      return this;
    }
    /**
     * <code>string ProcessReference = 2;</code>
     */
    public Builder setProcessReferenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      processReference_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object callerReference_ = "";
    /**
     * <code>string CallerReference = 3;</code>
     */
    public java.lang.String getCallerReference() {
      java.lang.Object ref = callerReference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callerReference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CallerReference = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCallerReferenceBytes() {
      java.lang.Object ref = callerReference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callerReference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CallerReference = 3;</code>
     */
    public Builder setCallerReference(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callerReference_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CallerReference = 3;</code>
     */
    public Builder clearCallerReference() {
      
      callerReference_ = getDefaultInstance().getCallerReference();
      onChanged();
      return this;
    }
    /**
     * <code>string CallerReference = 3;</code>
     */
    public Builder setCallerReferenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callerReference_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceID_ = "";
    /**
     * <code>string ServiceID = 4;</code>
     */
    public java.lang.String getServiceID() {
      java.lang.Object ref = serviceID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ServiceID = 4;</code>
     */
    public com.google.protobuf.ByteString
        getServiceIDBytes() {
      java.lang.Object ref = serviceID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ServiceID = 4;</code>
     */
    public Builder setServiceID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ServiceID = 4;</code>
     */
    public Builder clearServiceID() {
      
      serviceID_ = getDefaultInstance().getServiceID();
      onChanged();
      return this;
    }
    /**
     * <code>string ServiceID = 4;</code>
     */
    public Builder setServiceIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object callerInputJson_ = "";
    /**
     * <code>string CallerInputJson = 5;</code>
     */
    public java.lang.String getCallerInputJson() {
      java.lang.Object ref = callerInputJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callerInputJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CallerInputJson = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCallerInputJsonBytes() {
      java.lang.Object ref = callerInputJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callerInputJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CallerInputJson = 5;</code>
     */
    public Builder setCallerInputJson(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callerInputJson_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CallerInputJson = 5;</code>
     */
    public Builder clearCallerInputJson() {
      
      callerInputJson_ = getDefaultInstance().getCallerInputJson();
      onChanged();
      return this;
    }
    /**
     * <code>string CallerInputJson = 5;</code>
     */
    public Builder setCallerInputJsonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callerInputJson_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object previewsOutput_ = "";
    /**
     * <code>string PreviewsOutput = 6;</code>
     */
    public java.lang.String getPreviewsOutput() {
      java.lang.Object ref = previewsOutput_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        previewsOutput_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PreviewsOutput = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPreviewsOutputBytes() {
      java.lang.Object ref = previewsOutput_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        previewsOutput_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PreviewsOutput = 6;</code>
     */
    public Builder setPreviewsOutput(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      previewsOutput_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PreviewsOutput = 6;</code>
     */
    public Builder clearPreviewsOutput() {
      
      previewsOutput_ = getDefaultInstance().getPreviewsOutput();
      onChanged();
      return this;
    }
    /**
     * <code>string PreviewsOutput = 6;</code>
     */
    public Builder setPreviewsOutputBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      previewsOutput_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tokenAA_ = "";
    /**
     * <code>string TokenAA = 7;</code>
     */
    public java.lang.String getTokenAA() {
      java.lang.Object ref = tokenAA_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tokenAA_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TokenAA = 7;</code>
     */
    public com.google.protobuf.ByteString
        getTokenAABytes() {
      java.lang.Object ref = tokenAA_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenAA_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TokenAA = 7;</code>
     */
    public Builder setTokenAA(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tokenAA_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TokenAA = 7;</code>
     */
    public Builder clearTokenAA() {
      
      tokenAA_ = getDefaultInstance().getTokenAA();
      onChanged();
      return this;
    }
    /**
     * <code>string TokenAA = 7;</code>
     */
    public Builder setTokenAABytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tokenAA_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ir.tourismit.tit.core.Request)
  }

  // @@protoc_insertion_point(class_scope:ir.tourismit.tit.core.Request)
  private static final ir.tourismit.tit.core.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ir.tourismit.tit.core.Request();
  }

  public static ir.tourismit.tit.core.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    @java.lang.Override
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ir.tourismit.tit.core.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
