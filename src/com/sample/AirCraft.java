package com.sample;

import java.util.List;

public class AirCraft {
    public static void main(String[] args) {
        // Create an instance of the AirTrafficMonitoringService
        AirTrafficMonitoringService service = new AirTrafficMonitoringService();
 
        // Register some aircraft
        service.registerAircraft(1);
        service.registerAircraft(2);
        service.registerAircraft(3);
 
        // Simulate polling aircraft info
        long currentTime = System.currentTimeMillis() / 1000; // Get current time in seconds
 
        // First Polling: Aircraft 1
        boolean warning1 = service.polledAircraftInfo(1, 10000, 12000, currentTime);
        System.out.println("Aircraft 1 Warning Issued: " + warning1); // Expect false
 
        // Update last polled info for aircraft 1
        service.getAircraftInfo(1).updateLastPolledInfo(12000, currentTime);
 
        // Second Polling: Aircraft 1 with higher altitude
        currentTime += 3600; // Simulate 1 hour later
        boolean warning2 = service.polledAircraftInfo(1, 10000, 15000, currentTime);
        System.out.println("Aircraft 1 Warning Issued: " + warning2); // Expect true
 
        // Check warning history for aircraft 1
        List<Long> warningHistory1 = service.warningHistory(1, 5);
        System.out.println("Aircraft 1 Warning History: " + warningHistory1);
 
        // First Polling: Aircraft 2
        boolean warning3 = service.polledAircraftInfo(2, 10000, 9000, currentTime);
        System.out.println("Aircraft 2 Warning Issued: " + warning3); // Expect false
 
        // Update last polled info for aircraft 2
        service.getAircraftInfo(2).updateLastPolledInfo(9000, currentTime);
 
        // Second Polling: Aircraft 2 with higher altitude
        currentTime += 3600; // Simulate 1 hour later
        boolean warning4 = service.polledAircraftInfo(2, 10000, 11000, currentTime);
        System.out.println("Aircraft 2 Warning Issued: " + warning4); // Expect true
 
        // Check warning history for aircraft 2
        List<Long> warningHistory2 = service.warningHistory(2, 5);
        System.out.println("Aircraft 2 Warning History: " + warningHistory2);
 
        // First Polling: Aircraft 3
        boolean warning5 = service.polledAircraftInfo(3, 10000, 8000, currentTime);
        System.out.println("Aircraft 3 Warning Issued: " + warning5); // Expect false
 
        // Update last polled info for aircraft 3
        service.getAircraftInfo(3).updateLastPolledInfo(8000, currentTime);
 
        // Second Polling: Aircraft 3 with higher altitude
        currentTime += 3600; // Simulate 1 hour later
        boolean warning6 = service.polledAircraftInfo(3, 10000, 12000, currentTime);
        System.out.println("Aircraft 3 Warning Issued: " + warning6); // Expect true
 
        // Check warning history for aircraft 3
        List<Long> warningHistory3 = service.warningHistory(3, 5);
        System.out.println("Aircraft 3 Warning History: " + warningHistory3);
    }
}

