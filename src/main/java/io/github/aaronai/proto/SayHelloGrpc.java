package io.github.aaronai.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: io/github/aaronai/hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SayHelloGrpc {

  private SayHelloGrpc() {}

  public static final String SERVICE_NAME = "io.github.aaronai.proto.SayHello";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.github.aaronai.proto.Hello.SayHelloRequest,
      io.github.aaronai.proto.Hello.SayHelloResponse> getUnaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unary",
      requestType = io.github.aaronai.proto.Hello.SayHelloRequest.class,
      responseType = io.github.aaronai.proto.Hello.SayHelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.github.aaronai.proto.Hello.SayHelloRequest,
      io.github.aaronai.proto.Hello.SayHelloResponse> getUnaryMethod() {
    io.grpc.MethodDescriptor<io.github.aaronai.proto.Hello.SayHelloRequest, io.github.aaronai.proto.Hello.SayHelloResponse> getUnaryMethod;
    if ((getUnaryMethod = SayHelloGrpc.getUnaryMethod) == null) {
      synchronized (SayHelloGrpc.class) {
        if ((getUnaryMethod = SayHelloGrpc.getUnaryMethod) == null) {
          SayHelloGrpc.getUnaryMethod = getUnaryMethod =
              io.grpc.MethodDescriptor.<io.github.aaronai.proto.Hello.SayHelloRequest, io.github.aaronai.proto.Hello.SayHelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.aaronai.proto.Hello.SayHelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.aaronai.proto.Hello.SayHelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SayHelloMethodDescriptorSupplier("Unary"))
              .build();
        }
      }
    }
    return getUnaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.github.aaronai.proto.Hello.SayHelloRequest,
      io.github.aaronai.proto.Hello.SayHelloResponse> getBidirectionalStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidirectionalStream",
      requestType = io.github.aaronai.proto.Hello.SayHelloRequest.class,
      responseType = io.github.aaronai.proto.Hello.SayHelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.github.aaronai.proto.Hello.SayHelloRequest,
      io.github.aaronai.proto.Hello.SayHelloResponse> getBidirectionalStreamMethod() {
    io.grpc.MethodDescriptor<io.github.aaronai.proto.Hello.SayHelloRequest, io.github.aaronai.proto.Hello.SayHelloResponse> getBidirectionalStreamMethod;
    if ((getBidirectionalStreamMethod = SayHelloGrpc.getBidirectionalStreamMethod) == null) {
      synchronized (SayHelloGrpc.class) {
        if ((getBidirectionalStreamMethod = SayHelloGrpc.getBidirectionalStreamMethod) == null) {
          SayHelloGrpc.getBidirectionalStreamMethod = getBidirectionalStreamMethod =
              io.grpc.MethodDescriptor.<io.github.aaronai.proto.Hello.SayHelloRequest, io.github.aaronai.proto.Hello.SayHelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BidirectionalStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.aaronai.proto.Hello.SayHelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.aaronai.proto.Hello.SayHelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SayHelloMethodDescriptorSupplier("BidirectionalStream"))
              .build();
        }
      }
    }
    return getBidirectionalStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SayHelloStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayHelloStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayHelloStub>() {
        @java.lang.Override
        public SayHelloStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayHelloStub(channel, callOptions);
        }
      };
    return SayHelloStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SayHelloBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayHelloBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayHelloBlockingStub>() {
        @java.lang.Override
        public SayHelloBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayHelloBlockingStub(channel, callOptions);
        }
      };
    return SayHelloBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SayHelloFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayHelloFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayHelloFutureStub>() {
        @java.lang.Override
        public SayHelloFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayHelloFutureStub(channel, callOptions);
        }
      };
    return SayHelloFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SayHelloImplBase implements io.grpc.BindableService {

    /**
     */
    public void unary(io.github.aaronai.proto.Hello.SayHelloRequest request,
        io.grpc.stub.StreamObserver<io.github.aaronai.proto.Hello.SayHelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnaryMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.github.aaronai.proto.Hello.SayHelloRequest> bidirectionalStream(
        io.grpc.stub.StreamObserver<io.github.aaronai.proto.Hello.SayHelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidirectionalStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.github.aaronai.proto.Hello.SayHelloRequest,
                io.github.aaronai.proto.Hello.SayHelloResponse>(
                  this, METHODID_UNARY)))
          .addMethod(
            getBidirectionalStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.github.aaronai.proto.Hello.SayHelloRequest,
                io.github.aaronai.proto.Hello.SayHelloResponse>(
                  this, METHODID_BIDIRECTIONAL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class SayHelloStub extends io.grpc.stub.AbstractAsyncStub<SayHelloStub> {
    private SayHelloStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayHelloStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayHelloStub(channel, callOptions);
    }

    /**
     */
    public void unary(io.github.aaronai.proto.Hello.SayHelloRequest request,
        io.grpc.stub.StreamObserver<io.github.aaronai.proto.Hello.SayHelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.github.aaronai.proto.Hello.SayHelloRequest> bidirectionalStream(
        io.grpc.stub.StreamObserver<io.github.aaronai.proto.Hello.SayHelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SayHelloBlockingStub extends io.grpc.stub.AbstractBlockingStub<SayHelloBlockingStub> {
    private SayHelloBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayHelloBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayHelloBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.github.aaronai.proto.Hello.SayHelloResponse unary(io.github.aaronai.proto.Hello.SayHelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnaryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SayHelloFutureStub extends io.grpc.stub.AbstractFutureStub<SayHelloFutureStub> {
    private SayHelloFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayHelloFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayHelloFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.aaronai.proto.Hello.SayHelloResponse> unary(
        io.github.aaronai.proto.Hello.SayHelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY = 0;
  private static final int METHODID_BIDIRECTIONAL_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SayHelloImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SayHelloImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY:
          serviceImpl.unary((io.github.aaronai.proto.Hello.SayHelloRequest) request,
              (io.grpc.stub.StreamObserver<io.github.aaronai.proto.Hello.SayHelloResponse>) responseObserver);
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
        case METHODID_BIDIRECTIONAL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStream(
              (io.grpc.stub.StreamObserver<io.github.aaronai.proto.Hello.SayHelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SayHelloBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SayHelloBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.github.aaronai.proto.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SayHello");
    }
  }

  private static final class SayHelloFileDescriptorSupplier
      extends SayHelloBaseDescriptorSupplier {
    SayHelloFileDescriptorSupplier() {}
  }

  private static final class SayHelloMethodDescriptorSupplier
      extends SayHelloBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SayHelloMethodDescriptorSupplier(String methodName) {
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
      synchronized (SayHelloGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SayHelloFileDescriptorSupplier())
              .addMethod(getUnaryMethod())
              .addMethod(getBidirectionalStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
