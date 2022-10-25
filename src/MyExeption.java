public class MyExeption extends Exception{
    private int detail;
    public MyExeption(int detail, String message) {
        super(message);
        this.detail = detail;
    }
    @Override
    public String toString() {
        return "Ошибка "+this.detail+": "+getMessage();
    }
}