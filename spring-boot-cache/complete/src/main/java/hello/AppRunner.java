package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final BookRepository bookRepository;

    public AppRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


     void printBooks(){

        long start =System.currentTimeMillis();
        bookRepository.getByIsbn("isbn-1234");
        bookRepository.getByIsbn("isbn-4567");
        long end=System.currentTimeMillis();
         logger.info("spend " + (end-start)/1000 +" seconds " + "to get Book isbn-1234 and isbn-4567");

    }

    @Override
    public void run(String... args) throws Exception {

            while(true) {
                printBooks();
                Thread.sleep(3000);
            }
    }

}