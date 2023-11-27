public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванов";
        post.passport = "4444 № 444444";
        post.phone = "89998887766";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 7;
        post.birthday.year = 1986;
    }

}
