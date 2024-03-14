package project.library.repository.specification

import jakarta.persistence.criteria.Join
import jakarta.persistence.criteria.Path
import org.springframework.data.jpa.domain.Specification
import project.library.entities.Author
import project.library.entities.Book

class AuthorSpecification {

    companion object{
        public fun byId(id: Long): Specification<Author>{
            return Specification<Author> {root, query, criteriaBuilder ->
                var authorBookJoin: Join<Author, Book> = root.join("bookList")
                var authorBookJoinPath: Path<Join<Author, Book>> = authorBookJoin.get("id")
                criteriaBuilder.equal(authorBookJoinPath, id)
            }
        }
    }
}
