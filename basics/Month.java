public class Month
{
    public static void main(String[] args)
    {
        int mon=6;
        String monString="";
        switch(mon)
        {
            case 1:monString="1-JAN";
                break;
            case 2:monString="2-FEB";
                break;
            case 3:monString="3-MAR";
                break;
            case 4:monString="4-APR";
                break;
            case 5:monString="5-MAY";
                break;
            case 6:monString="6-JUN";
                break;
            case 7:monString="7-JULY";
                break;
            case 8:monString="8-AU";
                break;
            case 9:monString="9-SEP";
                break;
            case 10:monString="10-OCT";
                break;
            case 11:monString="11-NOV";
                break;
            case 12:monString="12-DEC";
                break;
            default:System.out.println("INVALID MON! ");
        }
        System.out.println(monString);
    }
}