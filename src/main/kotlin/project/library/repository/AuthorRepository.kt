package project.library.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository
import project.library.entities.Author

@Repository
interface AuthorRepository : JpaRepository<Author, Long> , JpaSpecificationExecutor<Author> {
}
