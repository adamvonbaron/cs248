/**
 * MyDate class (implements DateInterface interface)
 * @author Adam Kessler
 */
 
import java.io.*;
import java.util.*;

public class MyDate implements DateInterface {
    
    public int curMonth;
    public int curDay;
    public int curDow;
    public int curYear;
    
    int[] months = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    
    String[] monthNames = {
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };
    
    int[] dayofweek = {
        0, 1, 2, 3, 4, 5, 6
    };
    
    int[] days = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
        16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
        29, 30, 31
    };
    
    String[] dayNames = {
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
    };
    
    public int getDay() { return curDay; }
    
    public int getDow() { return curDow; }
    
    public int getMonth() { return curMonth; }
    
    public int getYear() { return curYear; }
    
    public void set(int m, int d, int y, int dow) {
        curMonth = month[m];
        curDay = days[d];
        curYear = y;
        curDow = dayofweek[dow];
    }
    
    public void tomorrow() {
        
    }
    
    public String toString() {
        return dayofweek[curDow] + " " +
               month[curMonth - 1] + " " +
               curDay + ", " + curYear;
    }
}