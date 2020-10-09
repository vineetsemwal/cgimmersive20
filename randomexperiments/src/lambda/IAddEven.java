package lambda;

/**
 * bi predicate example, special case of bi function where arguments can be any data type, return data type is boolean
 */
@FunctionalInterface
public interface IAddEven {

    boolean isAddEven(int num1, int num2);
}
