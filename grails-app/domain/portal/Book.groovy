package portal

class Book {
	static transients = ['primaryAuthor']
	static belongsTo = Author
	static hasMany = [authors: Author]
	String name
	
    static constraints = {
    }

    static mapping = {
		authors joinTable:[name:"book_authors", key:'book_id' ]
	}

	public Author getPrimaryAuthor() {
		def rtn
		if(rtn == null && this.authors.size() > 0) {
			rtn = this.authors.first()
		}
		return rtn
	}

	public void setPrimaryAuthor(Author author) {
		if(!author.id) {
			return
		}
		if(!this.authors || !this.authors.contains(author)) {
			this.addToAuthors(author)
		}
	}

}
