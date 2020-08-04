package ir.tourismit.tit.core;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Service.proto")
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "ir.tourismit.tit.core.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ir.tourismit.tit.core.Request,
      ir.tourismit.tit.core.Response> getServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "service",
      requestType = ir.tourismit.tit.core.Request.class,
      responseType = ir.tourismit.tit.core.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ir.tourismit.tit.core.Request,
      ir.tourismit.tit.core.Response> getServiceMethod() {
    io.grpc.MethodDescriptor<ir.tourismit.tit.core.Request, ir.tourismit.tit.core.Response> getServiceMethod;
    if ((getServiceMethod = ServiceGrpc.getServiceMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getServiceMethod = ServiceGrpc.getServiceMethod) == null) {
          ServiceGrpc.getServiceMethod = getServiceMethod = 
              io.grpc.MethodDescriptor.<ir.tourismit.tit.core.Request, ir.tourismit.tit.core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ir.tourismit.tit.core.Service", "service"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ir.tourismit.tit.core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ir.tourismit.tit.core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("service"))
                  .build();
          }
        }
     }
     return getServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void service(ir.tourismit.tit.core.Request request,
        io.grpc.stub.StreamObserver<ir.tourismit.tit.core.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ir.tourismit.tit.core.Request,
                ir.tourismit.tit.core.Response>(
                  this, METHODID_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceStub extends io.grpc.stub.AbstractStub<ServiceStub> {
    private ServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     */
    public void service(ir.tourismit.tit.core.Request request,
        io.grpc.stub.StreamObserver<ir.tourismit.tit.core.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceBlockingStub> {
    private ServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ir.tourismit.tit.core.Response service(ir.tourismit.tit.core.Request request) {
      return blockingUnaryCall(
          getChannel(), getServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceFutureStub> {
    private ServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ir.tourismit.tit.core.Response> service(
        ir.tourismit.tit.core.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVICE:
          serviceImpl.service((ir.tourismit.tit.core.Request) request,
              (io.grpc.stub.StreamObserver<ir.tourismit.tit.core.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ir.tourismit.tit.core.ServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
