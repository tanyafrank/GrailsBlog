package tanyaapp

class Comment {

    Post post
    String comment
    Commentor person = new Commentor()
    Date dateCreated

    static belongsTo = Post

    static constraints = {
    }
    public int compareTo(Object o) {
        return dateCreated.compareTo(o.dateCreated)
    }
}
