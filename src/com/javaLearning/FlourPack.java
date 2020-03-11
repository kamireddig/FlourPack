package com.javaLearning;

public class FlourPack {
    public static void main(String[] args){
        canPack(1,0,4);
        canPack(1,0,5);
        canPack(0,5,4);
        canPack(2,2,11);
        canPack(-3,2,12);
    }
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        int bigFlour = bigCount * 5;
        int podil = goal / 5;
        int add = 0;
        add = bigFlour + smallCount;
        if (goal == add || goal == bigFlour || (goal > bigFlour && goal <= add)) {
            return true;
        }
        else if (bigFlour > goal && podil * 5 + smallCount >= goal) {
            return true;
        }
        return false;
    }
}