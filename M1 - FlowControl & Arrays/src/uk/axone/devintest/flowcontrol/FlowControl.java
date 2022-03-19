package uk.axone.devintest.flowcontrol;

public class FlowControl {

    //Given a day of the week
    //Mon, Tue, Wed - Print 'Weekday'
    //Thu - Print 'Midweek'
    //Fri - Print "Thank God its Friday!"
    //Sat or Sun - Print 'Weekend'
    //Invalid input

    void useIfElse(String day){
        //Mon, Tue, Wed - Print 'Weekday'
        if(day.equals("Mon") || day.equals("Tue") || day.equals("Wed")){
            System.out.println("Weekday");
        }
        else if(day.equals("Thu")){
            System.out.println("Midweek");
        }
        else if(day.equals("Fri")){
            System.out.println("Thank God its Friday!");
        }
        else if(day.equals("Sat") || day.equals("Sun")){
            System.out.println("Weekend");
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    void useSwitch(String day){
        switch(day){
            case "Mon" : System.out.println("Weekday");
                break;
            case "Tue" : System.out.println("Weekday");
                break;
            case "Wed" : System.out.println("Weekday");
                break;
            case "Thu" : System.out.println("Midweek");
                break;
            case "Fri" : System.out.println("Thank God .. its Friday");
                break;
            case "Sat" : System.out.println("Weekend");
                break;
            case "Sun" : System.out.println("Weekend");
                break;
            default : System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        FlowControl fCon = new FlowControl();
        String day = new String("Fri");
        //fCon.useIfElse(day);
        fCon.useSwitch("Sun");
    }

}
