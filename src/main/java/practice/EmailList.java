package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    TreeSet<String> treeSetEmail = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        String regex = "[A-z]+@[A-z]+[.][a-z]{2,4}";

        if (email.matches(regex)) {
            treeSetEmail.add(email.toLowerCase());
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }

    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        for (String emails : treeSetEmail) {
            System.out.println(emails);
        }
        return treeSetEmail.stream().toList();
    }

}
