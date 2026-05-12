class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        
        // Reference: Jan 1, 1971 was Friday (index 0)
        int totalDays = 0;
        
        // Count days from 1971 to given year (excluding the given year)
        for(int y = 1971; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        
        // Count days from Jan to month (excluding the given month)
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int m = 0; m < month - 1; m++) {
            totalDays += monthDays[m];
        }
        
        // Add days of month
        totalDays += day - 1;
        
        // Adjust for leap year if month > February
        if(isLeapYear(year) && month > 2) {
            totalDays++;
        }
        
        return days[totalDays % 7];
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}