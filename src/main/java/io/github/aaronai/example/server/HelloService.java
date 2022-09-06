package io.github.aaronai.example.server;

import io.github.aaronai.proto.Hello.SayHelloRequest;
import io.github.aaronai.proto.Hello.SayHelloResponse;
import io.github.aaronai.proto.SayHelloGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloService extends SayHelloGrpc.SayHelloImplBase {
    public StreamObserver<SayHelloRequest> bidirectionalStream(StreamObserver<SayHelloResponse> responseObserver) {
        return new StreamObserver<SayHelloRequest>() {
            @Override
            public void onNext(SayHelloRequest request) {
                log.info("Receive streaming request={}", request);
                SayHelloResponse response = SayHelloResponse.newBuilder().setResponseContent("This is streaming "
                    + "response").build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
            }

            @Override
            public void onCompleted() {
                log.info("request observer is completed");
                responseObserver.onCompleted();
            }
        };
    }

    public void unary(SayHelloRequest request, StreamObserver<SayHelloResponse> responseObserver) {
        log.info("receive request={}", request);
        SayHelloResponse response = SayHelloResponse.newBuilder().setResponseContent("This is unary request").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void shutdown() {
    }
}
