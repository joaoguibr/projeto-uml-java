package com.iphone;

import com.iphone.browser.Browser;
import com.iphone.music.Music;
import com.iphone.phone.Phone;

public class Iphone implements Phone, Music, Browser {

    public Iphone() {

        System.out.println("Iphone is starting...");
    }
    @Override
    public void search(String url) {
        System.out.println("Search: " + url);
    }

    @Override
    public void reload() {
        System.out.println("Reloading...");
    }

    @Override
    public void back() {
        System.out.println("Going back...");
    }

    @Override
    public void forward() {
        System.out.println("Going forward...");
    }

    @Override
    public void play() {

        System.out.println("Playing...");
    }

    @Override
    public void stop() {

        System.out.println("Stopping...");
    }

    @Override
    public void next() {

        System.out.println("Next...");
    }

    @Override
    public void previous() {

        System.out.println("Previous...");
    }

    @Override
    public void chooseMusic(String music) {

        System.out.println("Choose music: " + music);
    }

    @Override
    public void ring() {

        System.out.println("Ringing...");
    }

    @Override
    public void call() {

        System.out.println("Calling...");
    }

    @Override
    public void text() {

        System.out.println("Texting...");
    }

    @Override
    public void answer() {

        System.out.println("Answering...");
    }
}
