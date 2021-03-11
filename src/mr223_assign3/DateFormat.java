package mr223_assign3;
import java.lang.Character;
public class DateFormat {
    private int day,month,year;
    private char format,punctuation;
    DateFormat(){
        setDay(0);
        setMonth(0);
        setYear(0);
        setFormat('b');
        setPunctuation('!');
    }
    DateFormat(int year,int month,int day,char punctuation,char format){
        setDay(day);
        setMonth(month);
        setYear(year);
        setFormat(format);
        setPunctuation(punctuation);
    }
    public void setDay(int day) {
        if(day>=1 && day<=31) {
            this.day=day;
        }else {
            this.day=0;
        }
    }
    public void setFormat(char format) {
        this.format=format;
    }
    public void setMonth(int month) {
        if(month>=1 && month<=12) {
            this.month=month;
        }else {
            this.month=0;
        }
    }
    public void setYear(int year) {
        if(year>=1900 && year<=2100) {
            this.year=year;
        }else {
            this.year=0;
        }
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public char getFormat() {
        return format;
    }
    private String getStringMonth() {
        if(month<10) {
            return "0"+month;
        }else {
            return Integer.toString(month);
        }
    }
    private String getStringDay() {
        if(day<10) {
            return "0"+day;
        }else {
            return Integer.toString(day);
        }
    }
    public int getYear() {
        return year;
    }
    public int getYear(boolean fullYear) {
        if(fullYear==false) {
            return year % 100;
        }else {
            return year;
        }
    }
    public void setPunctuation(char punctuation) {
        this.punctuation=punctuation;
    }
    public char getPunctuation() {
        return punctuation;
    }
    public String getFormatedDate(boolean fullYear) {
        String punt="";
        if(punctuation!='!') {
            punt=Character.toString(punctuation);
        }
        if(format=='b') {
            return ""+getYear(fullYear)+punt+getStringMonth()+punt+getStringDay();
        }else if(format=='l') {
            return ""+getStringDay()+punt+getStringMonth()+punt+getYear(fullYear);
        }else if(format=='m') {
            return ""+getStringMonth()+punt+getStringDay()+punt+getYear(fullYear);
        }else {
            return "Invalid date";
        }
    }
    public String getDate(boolean fullYear) {
        if(isDateValid()) {
            return getFormatedDate(fullYear);
        }else {
            return "Invalid date";
        }
    }

    private boolean isLeapYear() {
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        }else if(year % 4 == 0 && year % 100 !=0) {
            return true;
        }else {
            return false;
        }
    }
    private boolean isDateValid() {
        if(this.year == 0 || this.month == 0 || this.day == 0) {
            return false;
        }else {
            if(isLeapYear() && month == 2 && day >= 1 && day <= 29) {
                return true;
            }else if(isLeapYear()==false && month == 2 && day >=1 && day <= 28) {
                return true;
            }else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day>=1 && day <=31) {
                return true;
            }else if((month == 4 || month == 6 || month == 9 || month == 11) && day >= 1 && day <= 30) {
                return true;
            }else {
                return false;
            }
        }
    }
}
