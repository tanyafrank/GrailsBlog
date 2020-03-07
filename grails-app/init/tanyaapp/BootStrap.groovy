package tanyaapp

class BootStrap {

    def init = { servletContext ->

        new Post(title:"First Grails Project",
                teaser:"Clearing out the clutter",
                content:"The full content of the article",
                published:true).save()


        new Post(title:"Getting Ready for Go Live",
                teaser:"The follow up on some real world issues.",
                content:"The full content of the article",
                published:true).save()

        new Comment(post: "First Grails Project",
                 comment: "Comment1",
                ).save()

        new Commentor(name: "Tanya",
                url : "",
                email: "tanya@gmail.com",
                comment:"Comment1").save()
    }
    def destroy = {
    }
}
