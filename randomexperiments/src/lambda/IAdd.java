package lambda;

/**
 * oprerator example, special case of bi function where arguments and return data type are same
 */
@FunctionalInterface
public interface IAdd {

    int add(int num1, int num2);
}
