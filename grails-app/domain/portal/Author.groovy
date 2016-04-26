package portal

class Author {

	static hasMany = [books: Book]
	String firstName
	String lastName
    static constraints = {
    }

    static mapping = {
		books joinTable:[name:"book_authors", key:'author_id' ]
	}
}
