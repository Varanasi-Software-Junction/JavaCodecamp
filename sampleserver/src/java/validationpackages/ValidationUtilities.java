
package validationpackages;

public class ValidationUtilities {
    public static String showErrorAlert(String headline,String message)
    {
        String output=" <div class=\"alert alert-danger alert-dismissible fade show\">\n" +
"    <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n" +
"    <strong>" + headline + "</strong> " + message + "\n" +
"  </div>";
        
        return output;
    }
}
