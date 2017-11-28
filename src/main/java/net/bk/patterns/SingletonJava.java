package net.bk.patterns;

public final class SingletonJava {
    private static final SingletonJava INSTANCE = new SingletonJava();

    private SingletonJava(){}

    public String property = "Something";

    public static SingletonJava getInstance(){
        return INSTANCE;
    }

}
