package randomexperiments.exceptionhandling;

public class LabBookSource {

    public static void main(String args[]) {
        LabBookSource source = new LabBookSource();
        Activity activity1 = new Activity("hello", "world", "+");
        String operationResult1 = source.doOperation(activity1);
        System.out.println("+ result=" + operationResult1);
        Activity activity2 = new Activity("hello", "world", "-");
        String operationResult2 = source.doOperation(activity2);
        System.out.println("- result=" + operationResult2);


        String handleMsg1 = source.handleException(activity1);
        System.out.println("verifying noexception found->" + handleMsg1);

        Activity activity3 = new Activity(null, "world", "+");
        String handleMsg2 = source.handleException(activity3);
        System.out.println("verifyinng null values found ->" + handleMsg2);

        Activity activity4 = new Activity("hello", "world", "*");
        String handleMsg3 = source.handleException(activity4);
        System.out.println("vverifying operation is printed ->" + handleMsg3);

    }


    public String handleException(Activity a) {
        try {
            if (a.string1 == null || a.string2 == null) {
                throw new NullPointerException("Null values found");
            }


            if (!a.operator.equals("+") && !a.operator.equals("-")) {
                throw new Exception(a.operator);
            }
        } catch (Exception e) {
            return e.getMessage();
        }

        return "No Exception Found";

    }

    public String doOperation(Activity a) {
        switch (a.operator) {

            case "+": {
                return a.string1 + a.string2;
            }

            default: {
                String result = a.string1;
                return result;
            }

        }

    }

}
