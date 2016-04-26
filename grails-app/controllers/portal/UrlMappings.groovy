package portal

class UrlMappings {

    static mappings = { context ->

        "/"(controller: 'home', action: 'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
