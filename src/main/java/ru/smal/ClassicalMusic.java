package ru.smal;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void diMyDestroy(){
        System.out.println("Doing my destroy");
    }

    @Override
    public String getSong() {
        return "Hungurian Rhapsody";
    }
}
