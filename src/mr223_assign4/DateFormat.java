package mr223_assign4;

public class DateFormat {
    private int day;
    private int year;
    private int month;
    private char format;
    private char punctuation;

    DateFormat() {
        setFormat('b');setPunctuation('!');setYear(0);setMonth(0);setDay(0);
    }
    public void setDay(int day) {
        if ((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) && day >= 1 && day <= 31) {
            this.day = day;
        } else
        if ((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && day >= 1 && day <= 30) {
            this.day = day;
        } else if(this.month == 2 && day >= 1 && day <= 29)  {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Not a valid day that month.");
        }
    }
    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2100) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year must be between 1900 and 2100");
        }
    }
    public int getYear() {
        return year;
    }
    public int getYear(boolean full) {
        if (full == false) {
            return year % 100;
        } else {
            return year;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
    }
    public int getMonth() {
        return month;
    }

    DateFormat(int year, int month, int day, char punctuation, char format) {
        setYear(year);
        setMonth(month);
        setDay(day);
        setFormat(format);
        setPunctuation(punctuation);
    }

    public void setFormat(char format) {
        this.format = format;
    }

    public char getFormat() {
        return format;
    }

    private String receiveMonth() {
        if (month < 10) {
            return "0" + month;
        } else {
            return ""+month;
        }
    }

    private String receiveDay() {
        if (day < 10) {
            return "0" + day;
        } else {
            return ""+day;
        }
    }


    public void setPunctuation(char punctuation) {
        this.punctuation = punctuation;
    }

    public char getPunctuation() {
        return punctuation;
    }

    public String dateInFormatStyle(boolean full) {
        String empty = "";
        if (punctuation != '!') {
            empty = Character.toString(punctuation);
        }
        if (format == 'b') {
            return "" + getYear(full) + empty + receiveMonth() + empty + receiveDay();
        } else if (format == 'm') {
            return "" + receiveMonth() + empty + receiveDay() + empty + getYear(full);
        }else if (format == 'l') {
            return "" + receiveDay() + empty + receiveMonth() + empty + getYear(full);
        } else {
            return "Invalid date";
        }
    }


    private boolean isLeapYear() {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public String getDate(boolean fullYear) {
        if (isDateValid()) {
            return dateInFormatStyle(fullYear);
        } else {
            return "Invalid date";
        }
    }

    private boolean isDateValid() {
        if (this.year == 0 || this.month == 0 || this.day == 0) {
            return false;
        } else {
            if (isLeapYear() && month == 2 && day >= 1 && day <= 29) {
                return true;
            } else if (isLeapYear() == false && month == 2 && day >= 1 && day <= 28) {
                return true;
            } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                    || month == 12) && day >= 1 && day <= 31) {
                return true;
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day >= 1 && day <= 30) {
                return true;
            } else {
                return false;
            }
        }
    }
}
