public class Program_4 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.println("Number of days in year " + i + " is " + numberOfDaysInAYear(i) );
        }
    }

    public static int numberOfDaysInAYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

/*
    OUTPUT:
        Number of days in year 2000 is 366
        Number of days in year 2001 is 365
        Number of days in year 2002 is 365
        Number of days in year 2003 is 365
        Number of days in year 2004 is 366
        Number of days in year 2005 is 365
        Number of days in year 2006 is 365
        Number of days in year 2007 is 365
        Number of days in year 2008 is 366
        Number of days in year 2009 is 365
        Number of days in year 2010 is 365
        Number of days in year 2011 is 365
        Number of days in year 2012 is 366
        Number of days in year 2013 is 365
        Number of days in year 2014 is 365
        Number of days in year 2015 is 365
        Number of days in year 2016 is 366
        Number of days in year 2017 is 365
        Number of days in year 2018 is 365
        Number of days in year 2019 is 365
        Number of days in year 2020 is 366
 */