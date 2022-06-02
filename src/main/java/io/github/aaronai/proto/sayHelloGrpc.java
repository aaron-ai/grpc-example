package io.github.aaronai.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: io/github/aaronai/hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class sayHelloGrpc {

  private sayHelloGrpc() {}

  public static final String SERVICE_NAME = "io.github.aaronai.proto.sayHello";

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
    if ((getUnaryMethod = sayHelloGrpc.getUnaryMethod) == null) {
      synchronized (sayHelloGrpc.class) {
        if ((getUnaryMethod = sayHelloGrpc.getUnaryMethod) == null) {
          sayHelloGrpc.getUnaryMethod = getUnaryMethod =
              io.grpc.MethodDescriptor.<io.github.aaronai.proto.Hello.SayHelloRequest, io.github.aaronai.proto.Hello.SayHelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.aaronai.proto.Hello.SayHelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.aaronai.proto.Hello.SayHelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new sayHelloMethodDescriptorSupplier("Unary"))
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
    if ((getBidirectionalStreamMethod = sayHelloGrpc.getBidirectionalStreamMethod) == null) {
      synchronized (sayHelloGrpc.class) {
        if ((getBidirectionalStreamMethod = sayHelloGrpc.getBidirectionalStreamMethod) == null) {
          sayHelloGrpc.getBidirectionalStreamMethod = getBidirectionalStreamMethod =
              io.grpc.MethodDescriptor.<io.github.aaronai.proto.Hello.SayHelloRequest, io.github.aaronai.proto.Hello.SayHelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BidirectionalStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.aaronai.proto.Hello.SayHelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.aaronai.proto.Hello.SayHelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new sayHelloMethodDescriptorSupplier("BidirectionalStream"))
              .build();
        }
      }
    }
    return getBidirectionalStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static sayHelloStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sayHelloStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sayHelloStub>() {
        @java.lang.Override
        public sayHelloStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sayHelloStub(channel, callOptions);
        }
      };
    return sayHelloStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static sayHelloBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sayHelloBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sayHelloBlockingStub>() {
        @java.lang.Override
        public sayHelloBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sayHelloBlockingStub(channel, callOptions);
        }
      };
    return sayHelloBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static sayHelloFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sayHelloFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sayHelloFutureStub>() {
        @java.lang.Override
        public sayHelloFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sayHelloFutureStub(channel, callOptions);
        }
      };
    return sayHelloFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class sayHelloImplBase implements io.grpc.BindableService {

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
  public static final class sayHelloStub extends io.grpc.stub.AbstractAsyncStub<sayHelloStub> {
    private sayHelloStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sayHelloStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sayHelloStub(channel, callOptions);
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
  public static final class sayHelloBlockingStub extends io.grpc.stub.AbstractBlockingStub<sayHelloBlockingStub> {
    private sayHelloBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sayHelloBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sayHelloBlockingStub(channel, callOptions);
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
  public static final class sayHelloFutureStub extends io.grpc.stub.AbstractFutureStub<sayHelloFutureStub> {
    private sayHelloFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sayHelloFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sayHelloFutureStub(channel, callOptions);
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
    private final sayHelloImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(sayHelloImplBase serviceImpl, int methodId) {
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

  private static abstract class sayHelloBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    sayHelloBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.github.aaronai.proto.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("sayHello");
    }
  }

  private static final class sayHelloFileDescriptorSupplier
      extends sayHelloBaseDescriptorSupplier {
    sayHelloFileDescriptorSupplier() {}
  }

  private static final class sayHelloMethodDescriptorSupplier
      extends sayHelloBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    sayHelloMethodDescriptorSupplier(String methodName) {
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
      synchronized (sayHelloGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new sayHelloFileDescriptorSupplier())
              .addMethod(getUnaryMethod())
              .addMethod(getBidirectionalStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
