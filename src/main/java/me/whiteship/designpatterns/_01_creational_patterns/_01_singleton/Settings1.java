package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

/**
 * private 생성자와 public static 메소드를 사용하는 방법
 */
public class Settings1 {

    //가장 naive한 방법 멀티 쓰레드 환경에서 위험함
    private static Settings1 instance;

    private Settings1() { }

    public static Settings1 getInstance() {
        if (instance == null) {
            instance = new Settings1();
        }

        return instance;
    }

}
