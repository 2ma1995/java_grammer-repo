package C02ClassBasic;
class Calendr{
    private String  year;
    private String  month;
    private String  day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}

public class C0205Constructor {
    public static void main(String[] args) {
//        데이터를 안정성을 위해 일반적으로 setter를 사용하지않음.
        Calendr c1 = new Calendr();
//        c1.setYear("2024");
//        c1.setMonth("12");
//        c1.setDay("11");
        System.out.println();
    }
}

