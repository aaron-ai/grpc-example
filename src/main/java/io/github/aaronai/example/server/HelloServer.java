package io.github.aaronai.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServer {
    private final Server server;
    private final HelloService service;
    private final int port;

    public HelloServer(int port) {
        this.service = new HelloService();
        this.server = ServerBuilder.forPort(port).addService(service).build();
        this.port = port;
    }

    private void start() throws IOException {
        log.info("Server: starting ...");
        this.server.start();
        log.info("Server: started listen on port {}", port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            log.info("Server: stopping ...");
            HelloServer.this.stop();
            log.info("Server: stopped.");
        }));
    }

    private void stop() {
        server.shutdown();
        service.shutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final HelloServer server = new HelloServer(18848);
        server.start();
        server.blockUntilShutdown();
    }
}
