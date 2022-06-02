package io.github.aaronai.example.client;

import io.github.aaronai.proto.Hello;
import io.github.aaronai.proto.Hello.SayHelloRequest;
import io.github.aaronai.proto.SayHelloGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StubExample {
    static class ResponseObserver implements StreamObserver<Hello.SayHelloResponse> {
        @Override
        public void onNext(Hello.SayHelloResponse response) {
            log.info("Receive streaming response={}", response);
        }

        @Override
        public void onError(Throwable t) {
            log.info("ResponseObserver#onError is triggered", t);
        }

        @Override
        public void onCompleted() {
            log.info("ResponseObserver#onComplete is triggered");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = NettyChannelBuilder.forTarget("127.0.0.1:18848").usePlaintext().build();
        final SayHelloGrpc.SayHelloStub stub = SayHelloGrpc.newStub(channel);
        final ResponseObserver responseObserver = new ResponseObserver();
        final StreamObserver<SayHelloRequest> requestObserver = stub.bidirectionalStream(responseObserver);
        SayHelloRequest request = SayHelloRequest.newBuilder().setRequestContent("request").build();
        requestObserver.onNext(request);
        Thread.sleep(100000);
    }
}
