import java.util.List;
import java.util.Stack;

public class EverySecondGuyKilling {
    public static <T> T timeToRoulet(List<T> group) {
        boolean ifSecond = false;
        Stack<T> stack = new Stack<>();
        while (group.size() > 1) {
            for (T t : group) {
                if (ifSecond) {
                    stack.push(group.get(group.indexOf(t)));
                }
                ifSecond = !ifSecond;
            }
            while (stack.size() != 0) {
                group.remove(group.indexOf(stack.pop()));
            }
        }
        return group.get(0);
    }
}
