import java.lang.reflect.Method;
import java.util.Scanner;

// @SuppressWarnings("unchecked") Fixed raw type of class_name
public class Main {

    public static void main(String[] args) {
        try {
            Methods method = new Methods();
            Class<?> class_name = method.getClass();
            Method[] method_list = class_name.getDeclaredMethods();
            System.out.println("List of Methods:");
            for(Method list : method_list)
            {
                System.out.println("-- "+list.getName());
            }

            Scanner r_main = new Scanner(System.in);
            System.out.print("Give method's name: ");
            String param = r_main.nextLine();
            Method method_calling = class_name.getDeclaredMethod(param);
            method_calling.invoke(method);
        }

        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
