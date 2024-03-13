package project.library.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany



@Entity
class Author {

    @Id
    var id: Long = 0
        get() = field
        set(value) {
            field = value
        }


    @Column(name = "FIRST_NAME")
    var firstName: String = ""
        get() = field
        set(value) {
            field = value
        }


    @Column(name = "LAST_NAME")
    var lastName: String = ""
        get() = field
        set(value) {
            field = value
        }

    @ManyToMany
    @JoinTable(
        name = "author_book",
        joinColumns = [JoinColumn(name = "author_id")],
        inverseJoinColumns = [JoinColumn(name = "book_id")])
    var bookList: List<Book> = mutableListOf()
        get() = field
        set(value) {
            field = value
        }




}
