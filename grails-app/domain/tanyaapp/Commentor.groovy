package tanyaapp

class Commentor {

    String name
    String url
    String email
    Comment comment

    static belongsTo = Comment

    static constraints = {
        name(nullable:false, blank:false)
        url(nullable:true, blank:true, url:true)
        email(nullable:true, blank:true, email:true)
    }
}
