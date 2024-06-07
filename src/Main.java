import com.iphone.Iphone;


public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.search("www.google.com");
        iphone.reload();
        iphone.back();
        iphone.forward();
        iphone.play();
        iphone.stop();
        iphone.next();
        iphone.previous();
        iphone.chooseMusic("MJ");
        iphone.ring();
        iphone.call();
        iphone.text();
        iphone.answer();
    }
}
