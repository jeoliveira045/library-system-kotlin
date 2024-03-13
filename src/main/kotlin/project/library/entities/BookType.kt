package project.library.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class BookType {

    @Id
    var id: Long = 0
        get() = field
        set(value) {
            field = value
        }


    var description: String = ""
        get() = field
        set(value) {
            field = value
        }
}
