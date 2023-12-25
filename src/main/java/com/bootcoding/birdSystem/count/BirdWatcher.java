package com.bootcoding.birdSystem.count;

import java.util.Arrays;

public class BirdWatcher {

    private int[] birdCounts;

    public BirdWatcher(int[] birdCounts){
        this.birdCounts = Arrays.copyOf(birdCounts, birdCounts.length);
    }

    //method to get last week counts
    public int[] getLastWeek(){
        return Arrays.copyOf(birdCounts, birdCounts.length);
    }

    //method to get today's count
    public int getToday(){
        return birdCounts[birdCounts.length-1];
    }

    //method to increment today's count
    public void incrementTodaysCount(){
        birdCounts[birdCounts.length-1]++;
    }

    //method to check if there was a day with no visiting birds
    public boolean hasDayWithoutBirds() {
        for (int count : birdCounts) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to calculate the number of visiting birds for the first number of days
    public int getCountForFirstDays(int days) {
        int count = 0;
        for (int i = 0; i < days && i < birdCounts.length; i++) {
            count += birdCounts[i];
        }
        return count;
    }

    // Method to calculate the number of busy days
    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdCounts) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
