class Dates {
    private int day , month , year;

    Dates(int month , int day , int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setMonth(int month){
        if(month > 0 && month < 13){
            this.month = month;
        }
    }

    public int getmonth(){
        return month;
    }

    public void setday(int day){
        if(day > 0 && day < 32){
            this.day = day;
        }
    }

    public int getday(){
        return day;
    }

    public void setyear(int year){
        this.year = year;
    }

    public int getyear(){
        return year;
    }

    public void display(){
        System.out.println(month + "/" + day + "/" + year);
    }
}


public class calander {
    public static void main(String[] args) {
        Dates date = new Dates(9, 24, 2025);
        System.out.print("Current date : ");
        date.display();
        
        date.setday(12);
        date.setMonth(12);
        date.setyear(2027);

        System.out.print("Updated Date : ");
        date.display();
    }
}
