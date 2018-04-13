package good.anyway;

public class Banner {
    private String content;

    public Banner(String content) {
        this.content = content;
    }

    public void print(int times) {
        System.out.print("+");
        for (int i = 0; i < content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < times; i++) {
            System.out.println("|" + content + "|");
        }

        System.out.print("+");
        for (int i = 0; i < content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }




    public void printAfter(int times) {
        printBorder();
        printContent(times);
        printBorder();
    }

    private void printBorder() {
        System.out.print("+");
        for (int i = 0; i < content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    private void printContent(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("|" + content + "|");
        }
    }
}
