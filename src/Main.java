public class Main {
    public static void main(String[] args) {
        Author den = new Author("Den", "Millman");
        Author keit = new Author("Кейт", "Мэннинг");
        Author richard = new Author("Ричард", "Мейсон");

        Book peacefulWarrior = new Book("Peaceful Warrior", den, 1980);
        Book gildedMountains = new Book("Золоченые горы", keit, 2024);
        Book cowardlyHawk = new Book("Трусливый ястреб", new Author("Ричард", "Мейсон"), 2021);

        System.out.println("Название книги : " + peacefulWarrior.getTitle() + " Год издания: " + peacefulWarrior.getPublishDate());
        peacefulWarrior.setPublishDate(2021);
        System.out.println("Название книги : " + peacefulWarrior.getTitle() + " Год издания: " + peacefulWarrior.getPublishDate());
        System.out.println(gildedMountains);

        System.out.println(cowardlyHawk);
        System.out.println(richard.equals(cowardlyHawk.getAuthor()));
    }
}