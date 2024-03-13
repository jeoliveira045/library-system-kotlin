package project.library.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany

@Entity
class Book {

    @Id
    private var id: Long = 0;

    @Column(name = "NAME")
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }


    @ManyToMany
    var bookType: List<BookType> = mutableListOf()
        get() = field
        set(value) {
            field = value
        }
}
