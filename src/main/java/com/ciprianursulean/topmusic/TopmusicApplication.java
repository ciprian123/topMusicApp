package com.ciprianursulean.topmusic;

import com.ciprianursulean.topmusic.repository.impl.VoteRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopmusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopmusicApplication.class, args);
        System.out.println("Running... ");

        VoteRepositoryImpl voteRepository = new VoteRepositoryImpl();
        System.out.println(voteRepository.getAllVotes());
    }

}
