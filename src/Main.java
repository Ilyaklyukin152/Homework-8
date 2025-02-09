public class Main {
    public static void main(String[] args) {
        Author den = new Author("Den", "Millman");
        Author keit = new Author("Кейт", "Мэннинг");

        Book peacefulWarrior = new Book("Peaceful Warrior", den, 1980);
        Book gildedMountains = new Book("Золоченые горы", keit, 2024);

        System.out.println("Название книги : " + peacefulWarrior.getTitle() + " Год издания: " + peacefulWarrior.getPublishDate());
        peacefulWarrior.setPublishDate(2021);
        System.out.println("Название книги : " + peacefulWarrior.getTitle() + " Год издания: " + peacefulWarrior.getPublishDate());
        System.out.println(gildedMountains);
    }
}