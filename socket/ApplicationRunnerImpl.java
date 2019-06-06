package gree.socket;

import gree.socket.nio.SocketServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationRunnerImpl implements ApplicationRunner {
    @Value("${gree.socket.port}")
    private Integer port;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Successful service startup!");
        SocketServer server = new SocketServer(port);


    }
}
