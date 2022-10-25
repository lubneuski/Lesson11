public class Doc {
     public static void equals(String a){
        System.out.println("--Проверить содержит ли номер документа последовательность abc и вывети сообщение " +
                "\nсодержит или нет(причем, abc и ABC считается одинаковой последовательностью).");
       try {
           if (a.contains("ABC") || a.contains("abc")) {
               System.out.println("Содержит");
           } else
//               System.out.println("Не содержит")
               throw new MyExeption(666, "Внимание! Последовательность abc не обнаружена!");
           }catch (MyExeption m){
               System.out.println(m);
           }
       System.out.println();
    }
    public static void start(String a) {
        System.out.println("--Проверить начинается ли номер документа с последовательности 555:");
        String a1 = "555";
        try {
            if (a.startsWith(a1)) {
                System.out.println("да");
            } else throw new MyExeption(69, "Это системное сообщение, не обращайте внимание.");
        } catch (MyExeption me) {
            System.out.println(me);
        }
        System.out.println();
    }
    public static void end(String a) {
        System.out.println("--Проверить заканчивается ли номер документа на последовательность 1a2b:");
        String a1 = "1a2b";
        try {
            if (a.endsWith(a1)) {
                System.out.println("да");
            } else
                throw new MyExeption(13, "Внимание! документ должен заканчивается на последовательность 1a2b!\nИсправьте или будете уничтожены! Спасибо!");
        } catch (MyExeption mex) {
            System.out.println(mex);
        }
        System.out.println();
    }
}