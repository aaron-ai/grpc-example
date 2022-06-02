package io.github.aaronai.example.client;

import io.github.aaronai.proto.Hello.SayHelloRequest;
import io.github.aaronai.proto.Hello.SayHelloResponse;
import io.github.aaronai.proto.SayHelloGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlockingStubExample {
    public static void main(String[] args) {
        ManagedChannel channel = NettyChannelBuilder.forTarget("127.0.0.1:18848").usePlaintext().build();
        final SayHelloGrpc.SayHelloBlockingStub stub = SayHelloGrpc.newBlockingStub(channel);
        SayHelloRequest request = SayHelloRequest.newBuilder().setRequestContent("request").build();
        final SayHelloResponse response = stub.unary(request);
        log.info("received response={}", response);
    }
}
