
class HelloWaorld1 {
    public static void main(String[] args) {
        try {
            int a = 10 / 5; // change to 0
            System.out.println("A = " + a);

            int arr[] = new int[5];
            arr[4] = 4; // change to arr[4] to [5]
            System.out.println("arr[] = " + arr[4]);

            String s = null; // "sanjay"
            System.out.println("String = " + s.length());
        }

        // Specific Exception ( Exception class --> runtime ---> below 3 )

        catch (ArithmeticException e) {
            System.out.println("Cant divide");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Array");
        } catch (NullPointerException e) {
            System.out.println("Null String");
        }
        // ===================================================================================================-
        // OR ===========================================
        // ===================================================================================================-

        // jab same satemnet do error me likhna hoto "|" use kar sakte h read as "OR"

        // catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
        // isme bhi child to parents ka relation vice versa nhi hona chaiye
        // System.out.println("Cant divide");
        // }

        // ===================================================================================================-
        // OR ====================================================
        // ===================================================================================================-

        // General Exception ( Exception class )
        // dono likhoge to code spefic error stat ko first priority deta hai
        // ArithmeticException >> Exception
        // ** likhte samajay Most specific to most general wise error stat likhna h
        // varna program error dega kyuki upr first general hoga to usme sab class h to
        // aage for specic likhne code bolega ki repeat h
        // *************** BUT GOOD PROGRAMMERS FINDS SPECIFIC ERROR **************

        // catch (Exception e) {
        // System.out.println("Cant do");
    } // }
}