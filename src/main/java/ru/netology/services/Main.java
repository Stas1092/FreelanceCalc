package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        FreelanceCalc service = new FreelanceCalc();
        int freeMontes = service.calc(100_000, 60_000, 150_000);
        System.out.println(freeMontes);
    }
}
