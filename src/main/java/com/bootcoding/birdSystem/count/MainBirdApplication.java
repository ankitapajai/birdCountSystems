package com.bootcoding.birdSystem.count;

import java.util.Arrays;

public class MainBirdApplication {

    public static void main(String[] args) {


        System.out.println("~~~~~~~~~~~~~~~~Welcome to Bird Watcher System~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("========================================================================");
        //last week counts..
        int[] lastWeekCounts = {0,2,5,3,7,8,4};

        //here, we create BirdWatcher object with last week counts
        BirdWatcher birdWatcher = new BirdWatcher(lastWeekCounts);

        //here all last week count display
        System.out.println("Last week's count:" + Arrays.toString(birdWatcher.getLastWeek()));

        //here, how many birds visited today
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        System.out.println("Birds visited today: " +birdCount.getToday());

        //here, Increment today's count and display
        birdCount.incrementTodaysCount();
        System.out.println("Birds visited today after increment: " +birdCount.getToday());

        //here, Check if there was a day with no visiting birds
        System.out.println("Has day without birds: "+ birdCount.hasDayWithoutBirds());

        //here, the number of visiting birds for the first number of days
        System.out.println("Number of birds for the first 4 days: " + birdCount.getCountForFirstDays(4));

        //here, the number of busy days
        System.out.println("Number of busy days: " + birdCount.getBusyDays());

    }
}
