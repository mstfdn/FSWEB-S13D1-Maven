package org.example;

public class Main {

    public static void main(String[] args) {
        // shouldWakeUp metodu testleri
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1)); // false

        // hasTeen metodu testleri
        System.out.println(hasTeen(9, 99, 19));  // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false

        // isCatPlaying metodu testleri
        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true

        // area metodu testleri
        System.out.println(area(5.0, 4.0));  // 20.0
        System.out.println(area(-1.0, 4.0)); // -1
        System.out.println(area(5.0));       // 78.53975
        System.out.println(area(-1.0));      // -1
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        return isBarking && (clock >= 20 || clock < 8);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1; // Geçersiz değer
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1; // Geçersiz değer
        }
        return radius * radius * Math.PI;
    }
}
