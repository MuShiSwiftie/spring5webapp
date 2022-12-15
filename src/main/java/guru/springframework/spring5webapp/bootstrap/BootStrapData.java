package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final PublisherRepository publisherRepository;

    public BootStrapData(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher hongye = new Publisher("Los Angeles", "Hongye Li");
        publisherRepository.save(hongye);

        System.out.println("Started in BootStrap");
        System.out.println("Number of publisher: " + publisherRepository.count());
    }
}
