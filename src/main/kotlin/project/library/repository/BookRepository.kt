package project.library.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import project.library.entities.Book

@Repository
interface BookRepository : JpaRepository<Book, Long> {
}
