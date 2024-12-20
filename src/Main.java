public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10,10,58); // New time object (10:10:58)
        System.out.println("Expected Result: 10:10:58");
        System.out.println("Actual Result: " + time1);
        System.out.println();

        time1.tick();
        System.out.println("Expected Result: 10:10:59");
        System.out.println("Actual Result: " + time1);
        System.out.println();

        time1.tick();
        System.out.println("Expected Result: 10:11:00"); // Seconds resets to 00 (single digits padded with zero)
        System.out.println("Actual Result: " + time1);
        System.out.println();

        Time time2 = new Time(6,59,59); // New time object (06:59:59)
        System.out.println("Expected Result: 06:59:59");
        System.out.println("Actual Result: " + time2);
        System.out.println();

        time2.tick();
        System.out.println("Expected Result: 07:00:00"); // Both minutes and seconds reset to 00
        System.out.println("Actual Result: " + time2);
        System.out.println();
    
        Time time3 = new Time(23, 59, 59); // New time object (23:59:59)
        System.out.println("Expected Result: 23:59:59");
        System.out.println("Actual Result: " + time3);
        System.out.println();

        time3.tick();
        System.out.println("Expected Result: 00:00:00"); // Hours, minutes, and seconds all reset to 00
        System.out.println("Actual Result: " + time3);
        System.out.println();

        time3.tick();
        System.out.println("Expected Result: 00:00:01");
        System.out.println("Actual Result: " + time3);
        System.out.println();

        Time time4 = new Time(9,50,50); // New time object (09:50:50)
        System.out.println("Expected Result: 09:50:50");
        System.out.println("Actual Result: " + time4);
        System.out.println();

        Time time5 = new Time(10,40,32); // New time object (10:40:32)
        time4.add(time5); // Adds 09:50:50 to 10:40:32, changing time4
        System.out.println("Expecred Result: 20:31:22"); // 09:50:50 + 10:40:32 = 20:31:22
        System.out.println("Actual Result: " + time4);
        System.out.println();

        Time time6 = new Time(3,29,38); // New time object (03:29:38)
        time4.add(time6); // adds 03:29:38 to time4 (20:31:32)
        System.out.println("Expecred Result: 00:01:00"); // 20:31:32 + 03:29:38 = 00:01:00
        System.out.println("Actual Result: " + time4);
        System.out.println();

        




    




    }
}