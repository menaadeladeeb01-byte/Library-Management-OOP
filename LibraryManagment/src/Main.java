public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // نضيف كتب
        Book book1 = new Book(1, "Clean Code", "Robert C. Martin", "Programming");
        Book book2 = new Book(2, "Effective Java", "Joshua Bloch", "Programming");
        Magazine mag1 = new Magazine(3, "Tech Monthly", "Tech Corp", 45);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(mag1);

        // نضيف أعضاء
        Member member1 = new Member(101, "Mena");
        Member member2 = new Member(102, "Adel");

        library.registerMember(member1);
        library.registerMember(member2);

        // عضو يستعير كتاب
        System.out.println("Borrowing book1 for Mena:");
        library.borrowItem(101, 1);

        // عضو يحاول يستعير نفس الكتاب (مش هيكون متاح)
        System.out.println("Trying to borrow book1 for Adel:");
        library.borrowItem(102, 1);

        // عرض كل العناصر
        System.out.println("\nLibrary collection:");
        for (MediaItem item : library.getMediaCollection().values()) {
            System.out.println(item);
        }

        // استرجاع الكتاب
        System.out.println("\nReturning book1:");
        library.returnItem(101, 1);

        // محاولة استعارة تاني بعد الرجوع
        System.out.println("Now Adel tries to borrow book1:");
        library.borrowItem(102, 1);

    }
}