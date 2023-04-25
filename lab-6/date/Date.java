public class Date {
    private int day = 1;
    private int month = 1;
    private int year = 1;

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public static String displayMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Incorrect month number";
    }
    public static void main(String[] args) {
        Date myDate = new Date();
        myDate.setDay(12);
        myDate.setMonth(10);
        myDate.setYear(2017);
        System.out.println(Date.displayMonth(myDate.getMonth()));
    }
}
