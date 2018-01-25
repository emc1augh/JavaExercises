package Tutorial3;

import java.util.Calendar;

public class CreditCard {

    private int expiryMonth;
    private int expiryYear;
    private String firstName;
    private String lastName;
    private String ccNumber;

    public CreditCard(int expMonth, int expYear, String fName, String lName, String ccNum){
        expiryMonth=expMonth;
        expiryYear=expYear;
        firstName=fName;
        lastName=lName;
        ccNumber=ccNum;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String formatExpiryDate(){
        int month = expiryMonth;
        String year = String.valueOf(expiryYear).substring(2);
        return month + "/" + year;
    }

    public String formatFullName(){
        String first = firstName;
        String last = lastName;
        return first + " " + last;
    }

    public String formatCCNumber(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ccNumber.length(); i++) {
            if (i % 4 == 0 && i != 0) {
                result.append(" ");
                result.append(ccNumber.charAt(i));
            } else {
                result.append(ccNumber.charAt(i));
            }
        }
        return result.toString();
    }

    public boolean isValid(){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;

        return expiryYear >= year && (expiryYear < year || expiryMonth >= month);
    }


    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard(10, 2018, "Bob", "Jones", "1234567890123456");
        System.out.println(cc1.isValid());
    }


}
