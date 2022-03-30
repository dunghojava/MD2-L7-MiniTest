import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengthProgamingBook, lengthFictionBook;
        int count = 0;
        int totalPrice = 0;
        int choice = -1;
        while (choice != 0) {
            System.out.println("==========MENU HƠI NGU==========");
            System.out.println("1.Programing Book");
            System.out.println("2.Fiction Book");
            System.out.println("3.Tổng tiền của các cuốn sách");
            System.out.println("4.Check số sách Programing Book có language là JAVA");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sách 'Progaming Book'");
                    lengthProgamingBook = input.nextInt();
                    ProgrammingBook programmingBooks[] = new ProgrammingBook[lengthProgamingBook];
                    for (int i = 0; i < lengthProgamingBook; i++) {
                        programmingBooks[i] = new ProgrammingBook();
                        System.out.println("Nhập Book code của cuốn sách thứ " + (i+1) + ": ");
                        programmingBooks[i].setBookCode(input.next());
                        System.out.println("Nhập tên của cuốn sách thứ " + (i+1) + ": ");
                        programmingBooks[i].setName(input.next());
                        System.out.println("Nhập giá thành của cuốn sách thứ " + (i+1) + ": ");
                        programmingBooks[i].setPrice(input.nextInt());
                        System.out.println("Nhập tác giả của cuốn sách thứ " +(i+1) + ": ");
                        programmingBooks[i].setAuthor(input.next());
                        System.out.println("Nhập ngôn ngữ của cuốn sách thứ " + (i+1) + ": ");
                        programmingBooks[i].setLanguage(input.next());
                        System.out.println("Nhập Frame Work của cuốn sách thứ " + (i+1) + ": ");
                        programmingBooks[i].setFramework(input.next());
                        totalPrice += programmingBooks[i].getPrice();
                        if ((programmingBooks[i].getLanguage().equalsIgnoreCase("Java"))) {
                            count++;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập số lượng sách 'Fiction Book'");
                    lengthFictionBook = input.nextInt();
                    FictionBook fictionBooks[] = new FictionBook[lengthFictionBook];
                    System.out.println("check length ======= " + lengthFictionBook);
                    for (int i = 0; i < lengthFictionBook; i++) {
                        fictionBooks[i] = new FictionBook();
                        System.out.println("Nhập Book code của cuốn sách thứ " + (i+1) + ": ");
                        fictionBooks[i].setBookCode(input.next());
                        System.out.println("Nhập tên của cuốn sách thứ " + (i+1) + ": ");
                        fictionBooks[i].setName(input.next());
                        System.out.println("Nhập giá thành của cuốn sách thứ " + (i+1) + ": ");
                        fictionBooks[i].setPrice(input.nextInt());
                        System.out.println("Nhập tác giả của cuốn sách thứ " +(i+1) + ": ");
                        fictionBooks[i].setAuthor(input.next());
                        System.out.println("Nhập thể loại của cuốn sách thứ " + (i+1) + ": ");
                        fictionBooks[i].setCategory(input.next());
                        totalPrice += fictionBooks[i].getPrice();
                    }
                    break;
                case 3:
                    System.out.println("Tổng tiền là: " + totalPrice);
                    break;
                case 4:
                    System.out.println("Số sách Programing Book có language là JAVA là: " + count);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");


            }
        }

    }
}
