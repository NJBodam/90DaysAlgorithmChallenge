package sub.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Message {

    private final String from;
    private final String content;
    private final LocalDate created;
    private int likes;

    public Message(String from, String content, int likes, String created) {
        this.from = from;
        this.content = content;
        this.likes = likes;
        this.created = LocalDate.parse(created);
    }

    // getters and setters


    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreated() {
        return created;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return created.toString() + " " + from + " wrote: " +
                content + " (" + likes + ")";
    }


    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();

        messages.add(new Message("Alien", "Hello humans!",
                32, "2034-03-25"));
        messages.add(new Message("Pirate", "All hands on deck!",
                -2, "2034-01-05"));
        messages.add(new Message("User765214", "Bump!",
                1, "2033-02-17"));
        messages.add(new Message("Unregistered", "This message was marked as spam",
                -18, "2033-01-14"));

        messages.sort(new MessageContentComparator());
        messages.forEach(System.out::println);

//        Now we can use these classes to sort the list of
//        Message instances by different criteria, for example:

        // By date
        messages.sort(new MessageDateComparator());

        // By author's name
        messages.sort(new MessageAuthorComparator());

//        Since Comparator has only a single abstract method (SAM) and therefore is a
//        functional interface, we can use lambda functions to create Comparator
//        instances. For example, instead of the full class declaration, we can
//        rewrite MessageDateComparator as follows:


//        Comparator<Message> dateComparator = (m1, m2) ->
//                m1.getCreated().compareTo(m2.getCreated());
        // Below is same as above^
        Comparator<Message> dateComparator = Comparator.comparing(Message::getCreated);

//        We can even avoid using the named declaration and pass the lambda
//        directly to the sort method as an argument:
        messages.sort(Comparator.comparing(Message::getCreated));

        messages.sort(dateComparator);

//        If you are not going to reuse a Comparator object, declaring it as a
//        standalone class would be unnecessary, so you can just define it as a lambda function and use it immediately.






    }


}

class MessageContentComparator implements Comparator<Message> {

    @Override
    public int compare(Message message1, Message message2) {
        // here we should define how these two arguments will be compared
        int firstLength = message1.getContent().length();
        int secondLength = message2.getContent().length();
        return Integer.compare(firstLength, secondLength);

//        Here we used the compare static method of the Integer class to
//        safely compare two int numbers. Let's sort the message list using MessageContentComparator:

    }
}

class MessageDateComparator implements Comparator<Message> {

    @Override
    public int compare(Message message1, Message message2) {
        return message1.getCreated().compareTo(message2.getCreated());
    }
}

class MessageAuthorComparator implements Comparator<Message> {

    @Override
    public int compare(Message message1, Message message2) {
        return message1.getFrom().compareTo(message2.getFrom());
    }
}