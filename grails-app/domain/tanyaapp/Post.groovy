package tanyaapp

class Post {
    String title
    String teaser
    String content
    Date lastUpdated
    Boolean published = false
    SortedSet comments

    static hasMany = [comments:Comment]

    static constraints = {
        title(nullable:false, blank:false)
        teaser(nllable: true)
        content(nullable:false, blank:false)
        lastUpdated(nullable:true)
        published(nullable:false)
    }
}
