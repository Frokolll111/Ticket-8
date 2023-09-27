public class Main {
    public static void main(String[] args) {
        try {
            doSomething(-5);
        } catch (CustomException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }

    public static void doSomething(int value) throws  CustomException{
        if (value < 0) {
            throw new CustomException("Значение должно быть больше или равно нулю");
        }
    }

}