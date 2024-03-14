package project.library.repository.specification

import jakarta.persistence.criteria.Join
import jakarta.persistence.criteria.Path
import org.springframework.data.jpa.domain.Specification
import project.library.entities.Author
import project.library.entities.Book
import project.library.entities.BookType

class AuthorSpecification {

    companion object{
        public fun byBookId(id: Long): Specification<Author>{
            return Specification<Author> {root, query, criteriaBuilder ->
                val authorBookJoin: Join<Author, Book> = root.join("bookList")
                val authorBookJoinPath: Path<Join<Author, Book>> = authorBookJoin.get("id")
                criteriaBuilder.equal(authorBookJoinPath, id)
            }
        }

        public fun byBookType(bookType: String): Specification<Author>{
            return Specification<Author> {root, cq, cb ->
                val authorBookTypeJoin: Join<Author, BookType> = root.join<Author?, BookType?>("bookList").join("bookType");
                cb.equal(authorBookTypeJoin.get<Path<Join<Author, BookType>>>("description"), bookType)
            }
        }
    }
}
