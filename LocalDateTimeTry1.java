import java.time.Duration;
import java.time.LocalTime;
import java.time.LocalDateTime;

class LocalDateTimeTry1 {
    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.now();
        int year = dt1.getYear();
        int month = dt1.getMonthValue();
        int day = dt1.getDayOfMonth();
        int hour = dt1.getHour();
        int minute = dt1.getMinute();
        int second = dt1.getSecond();
        System.out.println("Date: "+ year 
                                   + ((month<10?"0":"")+month)
                                   + ((day<10?"0":"")+day) );
        System.out.println("Time: "+ ((hour<10?"0":"")+hour) 
                                   + ((minute<10?"0":"")+minute)
                                   + ((second<10?"0":"")+second) );
                                   
        LocalTime timeStart = LocalTime.now();
        for(int i=0; i<1000000000; ++i) { if(i%3==0){} if(i%7==3){} }
        for(int j=0; j<1000000000; ++j) { if(j%3==1){} if(j%7==4){j++;} }
        for(int k=0; k<1000000000; ++k) { if(k%3==2){} if(k%7==5){} }
        LocalTime timeEnd = LocalTime.now();
        Duration diff = Duration.between(timeStart, timeEnd);
        System.out.println("Duration in nanoseconds: " + diff.toNanos());
        System.out.println("Duration: " + diff.toString());
    }
}