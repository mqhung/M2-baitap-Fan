public class Main {
    public static void main(String[] args) {
        //fan1
        Fan firstFan = new Fan();
        firstFan.setSpeed(firstFan.FAST);
        firstFan.setRadius(10);
        firstFan.setColor("yellow");
        firstFan.setOn(true);
        System.out.println("FirstFan is: " +"\t" + firstFan.toString());
        //fan2
        Fan secondFan = new Fan();
        secondFan.setSpeed(secondFan.MEDIUM);
        secondFan.setRadius(5);
        secondFan.getColor();
        secondFan.setOn(false);
        System.out.println("SecondFan is: " +"\t"+secondFan.toString());
    }
}
