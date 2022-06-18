package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;

public class Millenials extends User {

    public Millenials(String username) {
        super(username);
        this.socialPublisher = new TwitterPublisher();
    }
}
